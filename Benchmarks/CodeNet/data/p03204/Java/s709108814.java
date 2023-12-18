import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.TreeSet;
import java.util.HashSet;
import java.io.OutputStreamWriter;
import java.util.NoSuchElementException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.io.BufferedWriter;
import java.util.Set;
import java.util.NavigableSet;
import java.io.IOException;
import java.io.Writer;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Egor Kulikov (egor@egork.net)
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        EWanderingTKHS solver = new EWanderingTKHS();
        solver.solve(1, in, out);
        out.close();
    }

    static class EWanderingTKHS {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            int[] a = new int[n - 1];
            int[] b = new int[n - 1];
            in.readIntArrays(a, b);
            MiscUtils.decreaseByOne(a, b);
            IndependentSetSystem setSystem = new ListIndependentSetSystem(n);
            NavigableSet<Integer>[] sets = new NavigableSet[n];
            Set<Integer>[] theirFirst = new Set[n];
            Set<Integer>[] parts = new Set[n];
            for (int i = 0; i < n; i++) {
                sets[i] = new TreeSet<>();
                theirFirst[i] = new HashSet<>();
                parts[i] = new HashSet<>();
                parts[i].add(i);
            }
            for (int i = 0; i < n - 1; i++) {
                sets[a[i]].add(b[i]);
                sets[b[i]].add(a[i]);
            }
            IntSet special = new IntHashSet();
            special.add(0);
            int[] processSpecial = new int[n];
            int sizeSpecial = 0;
            int[] processJoinA = new int[n];
            int[] processJoinB = new int[n];
            int sizeJoin = 0;
            int[] answer = new int[n];
            for (int i = 1; i < n; i++) {
                int first = sets[i].first();
                theirFirst[first].add(i);
                if (first == 0) {
                    processSpecial[sizeSpecial++] = i;
                } else if (first > i && sets[first].first() == i) {
                    processJoinA[sizeJoin] = i;
                    processJoinB[sizeJoin++] = first;
                }
            }
            int atSpecial = 0;
            int atJoin = 0;
            boolean[] done = new boolean[n];
            done[0] = true;
            while (true) {
                if (sizeSpecial > atSpecial) {
                    int current = processSpecial[atSpecial++];
                    for (int i : parts[current]) {
                        answer[i] = answer[sets[current].first()] + parts[current].size();
                        done[i] = true;
                    }
                    for (int i : theirFirst[current]) {
                        processSpecial[sizeSpecial++] = i;
                    }
                    continue;
                }
                if (sizeJoin > atJoin) {
                    int x = processJoinA[atJoin];
                    int y = processJoinB[atJoin++];
                    setSystem.join(x, y);
                    if (setSystem.get(x) == y) {
                        int t = x;
                        x = y;
                        y = t;
                    }
                    theirFirst[x] = join(theirFirst[x], theirFirst[y]);
                    theirFirst[x].remove(x);
                    theirFirst[x].remove(y);
                    parts[x] = join(parts[x], parts[y]);
                    sets[x] = (NavigableSet<Integer>) join(sets[x], sets[y]);
                    while (parts[x].contains(sets[x].first())) {
                        sets[x].pollFirst();
                    }
                    if (done[sets[x].first()]) {
                        processSpecial[sizeSpecial++] = x;
                    } else {
                        int first = setSystem.get(sets[x].first());
                        theirFirst[first].add(x);
                        if (setSystem.get(sets[first].first()) == x) {
                            processJoinA[sizeJoin] = x;
                            processJoinB[sizeJoin++] = first;
                        }
                    }
                    continue;
                }
                break;
            }
            out.printLine(Arrays.copyOfRange(answer, 1, n));
        }

        private Set<Integer> join(Set<Integer> a, Set<Integer> b) {
            if (a.size() > b.size()) {
                a.addAll(b);
                return a;
            }
            b.addAll(a);
            return b;
        }

    }

    static class ListIndependentSetSystem implements IndependentSetSystem {
        private final IntList[] lists;
        private int[] parent;
        private int setCount;
        private IndependentSetSystem.Listener listener;

        public ListIndependentSetSystem(int size) {
            //noinspection unchecked
            lists = new IntList[size];
            parent = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
            }
            setCount = size;
        }

        public boolean join(int first, int second) {
            first = parent[first];
            second = parent[second];
            if (first == second) {
                return false;
            }
            int firstSize = lists[first] == null ? 1 : lists[first].size() + 1;
            int secondSize = lists[second] == null ? 1 : lists[second].size() + 1;
            if (firstSize < secondSize) {
                int temp = first;
                first = second;
                second = temp;
            }
            if (lists[first] == null) {
                lists[first] = new IntArrayList();
            }
            lists[first].add(second);
            parent[second] = first;
            if (lists[second] != null) {
                lists[first].addAll(lists[second]);
                final int finalFirst = first;
                lists[second].forEach((IntTask) i -> parent[i] = finalFirst);
            }
            lists[second] = null;
            if (listener != null) {
                listener.joined(second, first);
            }
            setCount--;
            return true;
        }

        public int get(int index) {
            return parent[index];
        }

    }

    static interface IntStream extends Iterable<Integer>, Comparable<IntStream> {
        public IntIterator intIterator();

        default public Iterator<Integer> iterator() {
            return new Iterator<Integer>() {
                private IntIterator it = intIterator();

                public boolean hasNext() {
                    return it.isValid();
                }

                public Integer next() {
                    int result = it.value();
                    it.advance();
                    return result;
                }
            };
        }

        default public int compareTo(IntStream c) {
            IntIterator it = intIterator();
            IntIterator jt = c.intIterator();
            while (it.isValid() && jt.isValid()) {
                int i = it.value();
                int j = jt.value();
                if (i < j) {
                    return -1;
                } else if (i > j) {
                    return 1;
                }
                it.advance();
                jt.advance();
            }
            if (it.isValid()) {
                return 1;
            }
            if (jt.isValid()) {
                return -1;
            }
            return 0;
        }

        default public void forEach(IntTask task) {
            for (IntIterator it = intIterator(); it.isValid(); it.advance()) {
                task.process(it.value());
            }
        }

    }

    static interface IntReversableCollection extends IntCollection {
    }

    static class IntArrayList extends IntAbstractStream implements IntList {
        private int size;
        private int[] data;

        public IntArrayList() {
            this(3);
        }

        public IntArrayList(int capacity) {
            data = new int[capacity];
        }

        public IntArrayList(IntCollection c) {
            this(c.size());
            addAll(c);
        }

        public IntArrayList(IntStream c) {
            this();
            if (c instanceof IntCollection) {
                ensureCapacity(((IntCollection) c).size());
            }
            addAll(c);
        }

        public IntArrayList(IntArrayList c) {
            size = c.size();
            data = c.data.clone();
        }

        public IntArrayList(int[] arr) {
            size = arr.length;
            data = arr.clone();
        }

        public int size() {
            return size;
        }

        public int get(int at) {
            if (at >= size) {
                throw new IndexOutOfBoundsException("at = " + at + ", size = " + size);
            }
            return data[at];
        }

        private void ensureCapacity(int capacity) {
            if (data.length >= capacity) {
                return;
            }
            capacity = Math.max(2 * data.length, capacity);
            data = Arrays.copyOf(data, capacity);
        }

        public void addAt(int index, int value) {
            ensureCapacity(size + 1);
            if (index > size || index < 0) {
                throw new IndexOutOfBoundsException("at = " + index + ", size = " + size);
            }
            if (index != size) {
                System.arraycopy(data, index, data, index + 1, size - index);
            }
            data[index] = value;
            size++;
        }

        public void removeAt(int index) {
            if (index >= size || index < 0) {
                throw new IndexOutOfBoundsException("at = " + index + ", size = " + size);
            }
            if (index != size - 1) {
                System.arraycopy(data, index + 1, data, index, size - index - 1);
            }
            size--;
        }

    }

    static interface IntCollection extends IntStream {
        public int size();

        default public void add(int value) {
            throw new UnsupportedOperationException();
        }

        default public IntCollection addAll(IntStream values) {
            for (IntIterator it = values.intIterator(); it.isValid(); it.advance()) {
                add(it.value());
            }
            return this;
        }

    }

    static class MiscUtils {
        public static void decreaseByOne(int[]... arrays) {
            for (int[] array : arrays) {
                for (int i = 0; i < array.length; i++) {
                    array[i]--;
                }
            }
        }

    }

    static abstract class IntAbstractStream implements IntStream {
        public String toString() {
            StringBuilder builder = new StringBuilder();
            boolean first = true;
            for (IntIterator it = intIterator(); it.isValid(); it.advance()) {
                if (first) {
                    first = false;
                } else {
                    builder.append(' ');
                }
                builder.append(it.value());
            }
            return builder.toString();
        }

        public boolean equals(Object o) {
            if (!(o instanceof IntStream)) {
                return false;
            }
            IntStream c = (IntStream) o;
            IntIterator it = intIterator();
            IntIterator jt = c.intIterator();
            while (it.isValid() && jt.isValid()) {
                if (it.value() != jt.value()) {
                    return false;
                }
                it.advance();
                jt.advance();
            }
            return !it.isValid() && !jt.isValid();
        }

        public int hashCode() {
            int result = 0;
            for (IntIterator it = intIterator(); it.isValid(); it.advance()) {
                result *= 31;
                result += it.value();
            }
            return result;
        }

    }

    static interface IntSet extends IntCollection {
    }

    static class IntHashSet extends IntAbstractStream implements IntSet {
        private static final Random RND = new Random();
        private static final int[] SHIFTS = new int[4];
        private static final byte PRESENT_MASK = 1;
        private static final byte REMOVED_MASK = 2;
        private int size;
        private int realSize;
        private int[] values;
        private byte[] present;
        private int step;
        private int ratio;

        static {
            for (int i = 0; i < 4; i++) {
                SHIFTS[i] = RND.nextInt(31) + 1;
            }
        }

        public IntHashSet() {
            this(3);
        }

        public IntHashSet(int capacity) {
            capacity = Math.max(capacity, 3);
            values = new int[capacity];
            present = new byte[capacity];
            ratio = 2;
            initStep(capacity);
        }

        public IntHashSet(IntCollection c) {
            this(c.size());
            addAll(c);
        }

        public IntHashSet(int[] arr) {
            this(new IntArray(arr));
        }

        private void initStep(int capacity) {
            step = RND.nextInt(capacity - 2) + 1;
            while (IntegerUtils.gcd(step, capacity) != 1) {
                step++;
            }
        }

        public IntIterator intIterator() {
            return new IntIterator() {
                private int position = size == 0 ? values.length : -1;

                public int value() throws NoSuchElementException {
                    if (position == -1) {
                        advance();
                    }
                    if (position >= values.length) {
                        throw new NoSuchElementException();
                    }
                    if ((present[position] & PRESENT_MASK) == 0) {
                        throw new IllegalStateException();
                    }
                    return values[position];
                }

                public boolean advance() throws NoSuchElementException {
                    if (position >= values.length) {
                        throw new NoSuchElementException();
                    }
                    position++;
                    while (position < values.length && (present[position] & PRESENT_MASK) == 0) {
                        position++;
                    }
                    return isValid();
                }

                public boolean isValid() {
                    return position < values.length;
                }

                public void remove() {
                    if ((present[position] & PRESENT_MASK) == 0) {
                        throw new IllegalStateException();
                    }
                    present[position] = REMOVED_MASK;
                }
            };
        }

        public int size() {
            return size;
        }

        public void add(int value) {
            ensureCapacity((realSize + 1) * ratio + 2);
            int current = getHash(value);
            while (present[current] != 0) {
                if ((present[current] & PRESENT_MASK) != 0 && values[current] == value) {
                    return;
                }
                current += step;
                if (current >= values.length) {
                    current -= values.length;
                }
            }
            while ((present[current] & PRESENT_MASK) != 0) {
                current += step;
                if (current >= values.length) {
                    current -= values.length;
                }
            }
            if (present[current] == 0) {
                realSize++;
            }
            present[current] = PRESENT_MASK;
            values[current] = value;
            size++;
        }

        private int getHash(int value) {
            int hash = IntHash.hash(value);
            int result = hash;
            for (int i : SHIFTS) {
                result ^= hash >> i;
            }
            result %= values.length;
            if (result < 0) {
                result += values.length;
            }
            return result;
        }

        private void ensureCapacity(int capacity) {
            if (values.length < capacity) {
                capacity = Math.max(capacity * 2, values.length);
                rebuild(capacity);
            }
        }

        private void rebuild(int capacity) {
            initStep(capacity);
            int[] oldValues = values;
            byte[] oldPresent = present;
            values = new int[capacity];
            present = new byte[capacity];
            size = 0;
            realSize = 0;
            for (int i = 0; i < oldValues.length; i++) {
                if ((oldPresent[i] & PRESENT_MASK) == PRESENT_MASK) {
                    add(oldValues[i]);
                }
            }
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(int[] array) {
            for (int i = 0; i < array.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(array[i]);
            }
        }

        public void printLine(int[] array) {
            print(array);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }

    static interface IntTask {
        public void process(int value);

    }

    static interface IndependentSetSystem {
        public boolean join(int first, int second);

        public int get(int index);

        public static interface Listener {
            public void joined(int joinedRoot, int root);

        }

    }

    static class IntArray extends IntAbstractStream implements IntList {
        private int[] data;

        public IntArray(int[] arr) {
            data = arr;
        }

        public int size() {
            return data.length;
        }

        public int get(int at) {
            return data[at];
        }

        public void addAt(int index, int value) {
            throw new UnsupportedOperationException();
        }

        public void removeAt(int index) {
            throw new UnsupportedOperationException();
        }

    }

    static class IntHash {
        private IntHash() {
        }

        public static int hash(int c) {
            return c;
        }

    }

    static interface IntIterator {
        public int value() throws NoSuchElementException;

        public boolean advance();

        public boolean isValid();

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public void readIntArrays(int[]... arrays) {
            for (int i = 0; i < arrays[0].length; i++) {
                for (int j = 0; j < arrays.length; j++) {
                    arrays[j][i] = readInt();
                }
            }
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int readInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class IntegerUtils {
        public static int gcd(int a, int b) {
            a = Math.abs(a);
            b = Math.abs(b);
            while (b != 0) {
                int temp = a % b;
                a = b;
                b = temp;
            }
            return a;
        }

    }

    static interface IntList extends IntReversableCollection {
        public abstract int get(int index);

        public abstract void addAt(int index, int value);

        public abstract void removeAt(int index);

        default public IntIterator intIterator() {
            return new IntIterator() {
                private int at;
                private boolean removed;

                public int value() {
                    if (removed) {
                        throw new IllegalStateException();
                    }
                    return get(at);
                }

                public boolean advance() {
                    at++;
                    removed = false;
                    return isValid();
                }

                public boolean isValid() {
                    return !removed && at < size();
                }

                public void remove() {
                    removeAt(at);
                    at--;
                    removed = true;
                }
            };
        }

        default public void add(int value) {
            addAt(size(), value);
        }

    }
}

