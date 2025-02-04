import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.OptionalInt;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;



public class Main {
    public static void main(String[] args) throws Exception {
        BasicScanner sc = new BasicScanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, IntTreeSet> ul = new HashMap<>();
        HashMap<Integer, IntTreeSet> rl = new HashMap<>();
        HashMap<Integer, IntTreeSet> dl = new HashMap<>();
        HashMap<Integer, IntTreeSet> ll = new HashMap<>();
        HashMap<Integer, IntTreeSet> um = new HashMap<>();
        HashMap<Integer, IntTreeSet> rm = new HashMap<>();
        HashMap<Integer, IntTreeSet> dm = new HashMap<>();
        HashMap<Integer, IntTreeSet> lm = new HashMap<>();
        HashMap<Integer, IntTreeSet> up = new HashMap<>();
        HashMap<Integer, IntTreeSet> rp = new HashMap<>();
        HashMap<Integer, IntTreeSet> dp = new HashMap<>();
        HashMap<Integer, IntTreeSet> lp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            char u = sc.nextChars()[0];
            if (u == 'U') {
                if (!ul.containsKey(x)) {
                    ul.put(x, new IntTreeSet());
                }
                ul.get(x).add(y);
                if (!um.containsKey(y - x)) {
                    um.put(y - x, new IntTreeSet());
                }
                um.get(y - x).add(x);
                if (!up.containsKey(y + x)) {
                    up.put(y + x, new IntTreeSet());
                }
                up.get(y + x).add(x);
            } else if (u == 'R') {
                if (!rl.containsKey(y)) {
                    rl.put(y, new IntTreeSet());
                }
                rl.get(y).add(x);
                if (!rm.containsKey(y - x)) {
                    rm.put(y - x, new IntTreeSet());
                }
                rm.get(y - x).add(x);
                if (!rp.containsKey(y + x)) {
                    rp.put(y + x, new IntTreeSet());
                }
                rp.get(y + x).add(x);
            } else if (u == 'D') {
                if (!dl.containsKey(x)) {
                    dl.put(x, new IntTreeSet());
                }
                dl.get(x).add(y);
                if (!dm.containsKey(y - x)) {
                    dm.put(y - x, new IntTreeSet());
                }
                dm.get(y - x).add(x);
                if (!dp.containsKey(y + x)) {
                    dp.put(y + x, new IntTreeSet());
                }
                dp.get(y + x).add(x);
            } else if (u == 'L') {
                if (!ll.containsKey(y)) {
                    ll.put(y, new IntTreeSet());
                }
                ll.get(y).add(x);
                if (!lm.containsKey(y - x)) {
                    lm.put(y - x, new IntTreeSet());
                }
                lm.get(y - x).add(x);
                if (!lp.containsKey(y + x)) {
                    lp.put(y + x, new IntTreeSet());
                }
                lp.get(y + x).add(x);
            }
        }
        long min = Long.MAX_VALUE;
        for (Map.Entry<Integer, IntTreeSet> ue : ul.entrySet()) {
            int x = ue.getKey();
            if (!dl.containsKey(x)) {
                continue;
            }
            IntTreeSet uys = ue.getValue();
            IntTreeSet dys = dl.get(x);
            for (int uy : uys) {
                OptionalInt dy = dys.higher(uy);
                if (dy.isPresent()) {
                    min = Math.min(min, (dy.getAsInt() - uy) * 5);
                }
            }
        }
        for (Map.Entry<Integer, IntTreeSet> re : rl.entrySet()) {
            int y = re.getKey();
            if (!ll.containsKey(y)) {
                continue;
            }
            IntTreeSet rxs = re.getValue();
            IntTreeSet lxs = ll.get(y);
            for (int rx : rxs) {
                OptionalInt lx = lxs.higher(rx);
                if (lx.isPresent()) {
                    min = Math.min(min, (lx.getAsInt() - rx) * 5);
                }
            }
        }
        for (Map.Entry<Integer, IntTreeSet> ume : um.entrySet()) {
            int m = ume.getKey();
            if (!lm.containsKey(m)) {
                continue;
            }
            IntTreeSet ums = ume.getValue();
            IntTreeSet lms = lm.get(m);
            for (int ux : ums) {
                OptionalInt lx = lms.higher(ux);
                if (lx.isPresent()) {
                    min = Math.min(min, (lx.getAsInt() - ux) * 10);
                }
            }
        }
        for (Map.Entry<Integer, IntTreeSet> upe : up.entrySet()) {
            int p = upe.getKey();
            if (!rp.containsKey(p)) {
                continue;
            }
            IntTreeSet ups = upe.getValue();
            IntTreeSet rps = rp.get(p);
            for (int ux : ups) {
                OptionalInt rx = rps.lower(ux);
                if (rx.isPresent()) {
                    min = Math.min(min, (ux - rx.getAsInt()) * 10);
                }
            }
        }
        for (Map.Entry<Integer, IntTreeSet> dme : dm.entrySet()) {
            int m = dme.getKey();
            if (!rm.containsKey(m)) {
                continue;
            }
            IntTreeSet dms = dme.getValue();
            IntTreeSet rms = rm.get(m);
            for (int dx : dms) {
                OptionalInt rx = rms.lower(dx);
                if (rx.isPresent()) {
                    min = Math.min(min, (dx - rx.getAsInt()) * 10);
                }
            }
        }
        for (Map.Entry<Integer, IntTreeSet> dpe : dp.entrySet()) {
            int p = dpe.getKey();
            if (!lp.containsKey(p)) {
                continue;
            }
            IntTreeSet dps = dpe.getValue();
            IntTreeSet lps = lp.get(p);
            for (int dx : dps) {
                OptionalInt lx = lps.higher(dx);
                if (lx.isPresent()) {
                    min = Math.min(min, (lx.getAsInt() - dx) * 10);
                }
            }
        }
        System.out.println(min == Long.MAX_VALUE ? "SAFE" : min);
        Thread.sleep(1000);
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class BasicScanner {
    private final InputStream in;
    private final byte[] buf = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public BasicScanner(InputStream in) {this.in = in;}
    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try {buflen = in.read(buf);}
        catch (final IOException e) {e.printStackTrace();}
        return buflen > 0;
    }
    private int readByte() {return hasNextByte() ? buf[ptr++] : -1;}
    public boolean hasNext() {
        while (hasNextByte() && !(33 <= buf[ptr] && buf[ptr] <= 126)) ptr++;
        return hasNextByte();
    }
    private StringBuilder nextSequence() {
        if (!hasNext()) throw new NoSuchElementException();
        final StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (33 <= b && b <= 126) {sb.appendCodePoint(b); b = readByte();}
        return sb;
    }
    public char nextChar() {
        return (char) readByte();
    }
    public String next() {
        return nextSequence().toString();
    }
    public String next(int len) {
        return new String(nextChars(len));
    }
    public char[] nextChars() {
        final StringBuilder sb = nextSequence();
        int l = sb.length();
        char[] dst = new char[l];
        sb.getChars(0, l, dst, 0);
        return dst;
    }
    public char[] nextChars(int len) {
        if (!hasNext()) throw new NoSuchElementException();
        char[] s = new char[len];
        int i = 0;
        int b = readByte();
        while (33 <= b && b <= 126 && i < len) {s[i++] = (char) b; b = readByte();}
        if (i != len) throw new NoSuchElementException(String.format("length %d is longer than the sequence.", len));
        return s;
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {minus = true; b = readByte();}
        if (b < '0' || '9' < b) throw new NumberFormatException();
        while (true) {
            if ('0' <= b && b <= '9') n = n * 10 + b - '0';
            else if (b == -1 || !(33 <= b && b <= 126)) return minus ? -n : n;
            else throw new NumberFormatException();
            b = readByte();
        }
    }
    public int nextInt() {return Math.toIntExact(nextLong());}
    public double nextDouble() {return Double.parseDouble(next());}
}



class IntTreeMap<V> implements Iterable<IntTreeMap.Entry<V>> {
    private Entry<V> root;
    private int size = 0;
    private int modCount = 0;
    public int size() {return size;}
    public boolean containsKey(int key) {return getEntry(key) != null;}
    public V get(int key) {
        Entry<V> p = getEntry(key);
        return (p == null ? null : p.value);
    }
    final Entry<V> getEntry(int key) {
        Entry<V> p = root;
        while (p != null) {
            if (key < p.key) p = p.left;
            else if (key > p.key) p = p.right;
            else return p;
        }
        return null;
    }
    final Entry<V> getCeilingEntry(int key) {
        Entry<V> p = root;
        while (p != null) {
            if (key < p.key) {
                if (p.left != null) p = p.left;
                else return p;
            } else if (key > p.key) {
                if (p.right != null) {
                    p = p.right;
                } else {
                    Entry<V> parent = p.parent;
                    Entry<V> ch = p;
                    while (parent != null && ch == parent.right) {
                        ch = parent;
                        parent = parent.parent;
                    }
                    return parent;
                }
            } else return p;
        }
        return null;
    }
    final Entry<V> getFloorEntry(int key) {
        Entry<V> p = root;
        while (p != null) {
            if (key > p.key) {
                if (p.right != null) p = p.right;
                else return p;
            } else if (key < p.key) {
                if (p.left != null) {
                    p = p.left;
                } else {
                    Entry<V> parent = p.parent;
                    Entry<V> ch = p;
                    while (parent != null && ch == parent.left) {
                        ch = parent;
                        parent = parent.parent;
                    }
                    return parent;
                }
            } else return p;
        }
        return null;
    }
    final Entry<V> getHigherEntry(int key) {
        Entry<V> p = root;
        while (p != null) {
            if (key < p.key) {
                if (p.left != null) p = p.left;
                else return p;
            } else {
                if (p.right != null) {
                    p = p.right;
                } else {
                    Entry<V> parent = p.parent;
                    Entry<V> ch = p;
                    while (parent != null && ch == parent.right) {
                        ch = parent;
                        parent = parent.parent;
                    }
                    return parent;
                }
            }
        }
        return null;
    }
    final Entry<V> getLowerEntry(int key) {
        Entry<V> p = root;
        while (p != null) {
            if (key > p.key) {
                if (p.right != null) p = p.right;
                else return p;
            } else {
                if (p.left != null) {
                    p = p.left;
                } else {
                    Entry<V> parent = p.parent;
                    Entry<V> ch = p;
                    while (parent != null && ch == parent.left) {
                        ch = parent;
                        parent = parent.parent;
                    }
                    return parent;
                }
            }
        }
        return null;
    }
    public V put(int key, V value) {
        Entry<V> t = root;
        if (t == null) {
            root = new Entry<>(key, value, null);
            size = 1;
            modCount++;
            return null;
        }
        int cmp;
        Entry<V> parent;
        do {
            parent = t;
            cmp = key > t.key ? 1 : key == t.key ? 0 : -1;
            if (cmp < 0) t = t.left;
            else if (cmp > 0) t = t.right;
            else return t.setValue(value);
        } while (t != null);
        Entry<V> e = new Entry<>(key, value, parent);
        if (cmp < 0) parent.left = e;
        else parent.right = e;
        fixAfterInsertion(e);
        size++;
        modCount++;
        return null;
    }
    public V remove(int key) {
        Entry<V> p = getEntry(key);
        if (p == null) return null;
        V oldValue = p.value;
        deleteEntry(p);
        return oldValue;
    }
    public void clear() {
        modCount++;
        size = 0;
        root = null;
    }
    public Entry<V> firstEntry() {return getFirstEntry();}
    public Entry<V> lastEntry()  {return getLastEntry();}
    public Entry<V> pollFirstEntry() {
        Entry<V> p = getFirstEntry();
        Entry<V> result = p;
        if (p != null) deleteEntry(p);
        return result;
    }
    public Entry<V> pollLastEntry() {
        Entry<V> p = getLastEntry();
        Entry<V> result = p;
        if (p != null) deleteEntry(p);
        return result;
    }
    public Entry<V> lowerEntry(int key) {return getLowerEntry(key);}
    public Entry<V> floorEntry(int key) {return getFloorEntry(key);}
    public Entry<V> ceilingEntry(int key) {return getCeilingEntry(key);}
    public Entry<V> higherEntry(int key) {return getHigherEntry(key);}
    public boolean replace(int key, V oldValue, V newValue) {
        Entry<V> p = getEntry(key);
        if (p != null && Objects.equals(oldValue, p.value)) {
            p.value = newValue;
            return true;
        }
        return false;
    }
    public V replace(int key, V value) {
        Entry<V> p = getEntry(key);
        if (p!=null) {
            V oldValue = p.value;
            p.value = value;
            return oldValue;
        }
        return null;
    }
    public void forEach(IntObjConsumer<V> action) {
        Objects.requireNonNull(action);
        int expectedModCount = modCount;
        for (Entry<V> e = getFirstEntry(); e != null; e = successor(e)) {
            action.accept(e.key, e.value);
            if (expectedModCount != modCount) {
                throw new ConcurrentModificationException();
            }
        }
    }
    public Iterator<Entry<V>> iterator() {
        return new EntryIterator(getFirstEntry());
    }
    public Iterator<Entry<V>> descendingIterator() {
        return new DescendingEntryIterator(getLastEntry());
    }
    abstract class PrivateEntryIterator<T> implements Iterator<T> {
        Entry<V> next;
        Entry<V> lastReturned;
        int expectedModCount;
        PrivateEntryIterator(Entry<V> first) {
            expectedModCount = modCount;
            lastReturned = null;
            next = first;
        }
        public final boolean hasNext() {return next != null;}
        final Entry<V> nextEntry() {
            Entry<V> e = next;
            if (e == null) throw new NoSuchElementException();
            if (modCount != expectedModCount) throw new ConcurrentModificationException();
            next = successor(e);
            lastReturned = e;
            return e;
        }
        final Entry<V> prevEntry() {
            Entry<V> e = next;
            if (e == null) throw new NoSuchElementException();
            if (modCount != expectedModCount) throw new ConcurrentModificationException();
            next = predecessor(e);
            lastReturned = e;
            return e;
        }
        public void remove() {
            if (lastReturned == null) throw new IllegalStateException();
            if (modCount != expectedModCount) throw new ConcurrentModificationException();
            if (lastReturned.left != null && lastReturned.right != null) next = lastReturned;
            deleteEntry(lastReturned);
            expectedModCount = modCount;
            lastReturned = null;
        }
    }
    final class EntryIterator extends PrivateEntryIterator<Entry<V>> {
        EntryIterator(Entry<V> first) {super(first);}
        public Entry<V> next() {return nextEntry();}
    }
    final class DescendingEntryIterator extends PrivateEntryIterator<Entry<V>> {
        DescendingEntryIterator(Entry<V> first) {super(first);}
        public Entry<V> next() {return prevEntry();}
    }

    private static final boolean RED   = false;
    private static final boolean BLACK = true;

    public static final class Entry<V> {
        int key;
        V value;
        Entry<V> left;
        Entry<V> right;
        Entry<V> parent;
        boolean color = BLACK;
        Entry(int key, V value, Entry<V> parent) {
            this.key = key;
            this.value = value;
            this.parent = parent;
        }
        public int getKey() {return key;}
        public V getValue() {return value;}
        public V setValue(V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }
        public boolean equals(Object o) {
            if (!(o instanceof Entry)) return false;
            Entry<?> e = (Entry<?>) o;
            return key == e.getKey() && (value == null ? e.value == null : value.equals(e.value));
        }
        public int hashCode() {
            int keyHash = key;
            int valueHash = (value == null ? 0 : value.hashCode());
            return keyHash ^ valueHash;
        }
        public String toString() {return key + "=" + value;}
    }
    final Entry<V> getFirstEntry() {
        Entry<V> p = root;
        if (p != null) while (p.left != null) p = p.left;
        return p;
    }
    final Entry<V> getLastEntry() {
        Entry<V> p = root;
        if (p != null) while (p.right != null) p = p.right;
        return p;
    }
    static <V> Entry<V> successor(Entry<V> t) {
        if (t == null) return null;
        else if (t.right != null) {
            Entry<V> p = t.right;
            while (p.left != null) p = p.left;
            return p;
        } else {
            Entry<V> p = t.parent;
            Entry<V> ch = t;
            while (p != null && ch == p.right) {
                ch = p;
                p = p.parent;
            }
            return p;
        }
    }
    static <V> Entry<V> predecessor(Entry<V> t) {
        if (t == null) return null;
        else if (t.left != null) {
            Entry<V> p = t.left;
            while (p.right != null) p = p.right;
            return p;
        } else {
            Entry<V> p = t.parent;
            Entry<V> ch = t;
            while (p != null && ch == p.left) {
                ch = p;
                p = p.parent;
            }
            return p;
        }
    }
    private static <V> boolean colorOf(Entry<V> p) {return p == null ? BLACK : p.color;}
    private static <V> Entry<V> parentOf(Entry<V> p) {return p == null ? null: p.parent;}
    private static <K,V> void setColor(Entry<V> p, boolean c) {if (p != null) p.color = c;}
    private static <V> Entry<V> leftOf (Entry<V> p) {return (p == null) ? null: p.left;}
    private static <V> Entry<V> rightOf(Entry<V> p) {return (p == null) ? null: p.right;}
    private void rotateLeft(Entry<V> p) {
        if (p != null) {
            Entry<V> r = p.right;
            p.right = r.left;
            if (r.left != null) r.left.parent = p;
            r.parent = p.parent;
            if (p.parent == null) root = r;
            else if (p.parent.left == p) p.parent.left = r;
            else p.parent.right = r;
            r.left = p;
            p.parent = r;
        }
    }
    private void rotateRight(Entry<V> p) {
        if (p != null) {
            Entry<V> l = p.left;
            p.left = l.right;
            if (l.right != null) l.right.parent = p;
            l.parent = p.parent;
            if (p.parent == null) root = l;
            else if (p.parent.right == p) p.parent.right = l;
            else p.parent.left = l;
            l.right = p;
            p.parent = l;
        }
    }
    private void fixAfterInsertion(Entry<V> x) {
        x.color = RED;
        while (x != null && x != root && x.parent.color == RED) {
            if (parentOf(x) == leftOf(parentOf(parentOf(x)))) {
                Entry<V> y = rightOf(parentOf(parentOf(x)));
                if (colorOf(y) == RED) {
                    setColor(parentOf(x), BLACK);
                    setColor(y, BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    x = parentOf(parentOf(x));
                } else {
                    if (x == rightOf(parentOf(x))) {
                        x = parentOf(x);
                        rotateLeft(x);
                    }
                    setColor(parentOf(x), BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    rotateRight(parentOf(parentOf(x)));
                }
            } else {
                Entry<V> y = leftOf(parentOf(parentOf(x)));
                if (colorOf(y) == RED) {
                    setColor(parentOf(x), BLACK);
                    setColor(y, BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    x = parentOf(parentOf(x));
                } else {
                    if (x == leftOf(parentOf(x))) {
                        x = parentOf(x);
                        rotateRight(x);
                    }
                    setColor(parentOf(x), BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    rotateLeft(parentOf(parentOf(x)));
                }
            }
        }
        root.color = BLACK;
    }
    private void deleteEntry(Entry<V> p) {
        modCount++;
        size--;
        if (p.left != null && p.right != null) {
            Entry<V> s = successor(p);
            p.key = s.key;
            p.value = s.value;
            p = s;
        }
        Entry<V> replacement = (p.left != null ? p.left : p.right);
        if (replacement != null) {
            replacement.parent = p.parent;
            if (p.parent == null) root = replacement;
            else if (p == p.parent.left) p.parent.left  = replacement;
            else p.parent.right = replacement;
            p.left = p.right = p.parent = null;
            if (p.color == BLACK) fixAfterDeletion(replacement);
        } else if (p.parent == null) {
            root = null;
        } else {
            if (p.color == BLACK) fixAfterDeletion(p);
            if (p.parent != null) {
                if (p == p.parent.left) p.parent.left = null;
                else if (p == p.parent.right) p.parent.right = null;
                p.parent = null;
            }
        }
    }
    private void fixAfterDeletion(Entry<V> x) {
        while (x != root && colorOf(x) == BLACK) {
            if (x == leftOf(parentOf(x))) {
                Entry<V> sib = rightOf(parentOf(x));
                if (colorOf(sib) == RED) {
                    setColor(sib, BLACK);
                    setColor(parentOf(x), RED);
                    rotateLeft(parentOf(x));
                    sib = rightOf(parentOf(x));
                }
                if (colorOf(leftOf(sib))  == BLACK &&
                    colorOf(rightOf(sib)) == BLACK) {
                    setColor(sib, RED);
                    x = parentOf(x);
                } else {
                    if (colorOf(rightOf(sib)) == BLACK) {
                        setColor(leftOf(sib), BLACK);
                        setColor(sib, RED);
                        rotateRight(sib);
                        sib = rightOf(parentOf(x));
                    }
                    setColor(sib, colorOf(parentOf(x)));
                    setColor(parentOf(x), BLACK);
                    setColor(rightOf(sib), BLACK);
                    rotateLeft(parentOf(x));
                    x = root;
                }
            } else {
                Entry<V> sib = leftOf(parentOf(x));
                if (colorOf(sib) == RED) {
                    setColor(sib, BLACK);
                    setColor(parentOf(x), RED);
                    rotateRight(parentOf(x));
                    sib = leftOf(parentOf(x));
                }
                if (colorOf(rightOf(sib)) == BLACK &&
                    colorOf(leftOf(sib)) == BLACK) {
                    setColor(sib, RED);
                    x = parentOf(x);
                } else {
                    if (colorOf(leftOf(sib)) == BLACK) {
                        setColor(rightOf(sib), BLACK);
                        setColor(sib, RED);
                        rotateLeft(sib);
                        sib = leftOf(parentOf(x));
                    }
                    setColor(sib, colorOf(parentOf(x)));
                    setColor(parentOf(x), BLACK);
                    setColor(leftOf(sib), BLACK);
                    rotateRight(parentOf(x));
                    x = root;
                }
            }
        }
        setColor(x, BLACK);
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class Out {
    private final OutputStream out;
    private byte[] buf = new byte[1024];
    private int ptr = 0;
    private static final int AUTO_FLUSH_THRETHOLD = 1 << 17;

    public Out(OutputStream out) {
        this.out = out;
    }

    public void flush() {
        try {
            out.write(buf, 0, ptr);
            out.flush();
            ptr = 0;
        } catch (IOException e) {e.printStackTrace();}
    }

    public void close() {
        try {out.close();} catch (IOException e) {e.printStackTrace();}
    }

    public Out writeln(Object o) {return write(o).write('\n');}
    public Out writeln(String s) {return write(s).write('\n');}
    public Out writeln(char[] c) {return write(c).write('\n');}
    public Out writeln(char   c) {return write(c).write('\n');}
    public Out writeln(byte   b) {return write(b).write('\n');}
    public Out writeln(int    x) {return write(x).write('\n');}
    public Out writeln(long   x) {return write(x).write('\n');}
    public Out writeln(double d) {return write(d).write('\n');}

    public Out writeSpace() {return write(' ');}
    
    public Out write(Object o) {
        return write(o.toString());
    }

    public Out write(String s) {
        try {
            Field strValueField = s.getClass().getDeclaredField("value");
            strValueField.setAccessible(true);
            byte[] b = (byte[]) strValueField.get(s);
            int l = s.length();
            if (l > AUTO_FLUSH_THRETHOLD) {
                flush();
                int i = 0;
                while (i + AUTO_FLUSH_THRETHOLD < l) {
                    out.write(b, i, AUTO_FLUSH_THRETHOLD);
                    out.flush();
                    i += AUTO_FLUSH_THRETHOLD;
                }
                ensureCapacity(l - i);
                System.arraycopy(b, i, buf, 0, l - i);
                ptr = l - i;
            } else {
                ensureCapacity(ptr + l);
                System.arraycopy(b, 0, buf, ptr, l);
                ptr += l;
            }
        } catch (Exception e) {e.printStackTrace();}
        return this;
    }

    public Out write(char[] c) {
        int l = c.length;
        if (l > AUTO_FLUSH_THRETHOLD) {
            flush();
            ensureCapacity(AUTO_FLUSH_THRETHOLD);
            int i = 0;
            while (i + AUTO_FLUSH_THRETHOLD < l) {
                for (int j = 0; j < AUTO_FLUSH_THRETHOLD; j++) {
                    buf[ptr++] = (byte) c[i + j];
                }
                flush();
                i += AUTO_FLUSH_THRETHOLD;
            }
            for (; i < l; i++) {
                buf[ptr++] = (byte) c[i];
            }
        } else {
            ensureCapacity(ptr + l);
            for (char ch : c) buf[ptr++] = (byte) ch;
        }
        return this;
    }

    public Out write(char c) {
        ensureCapacity(ptr + 1);
        buf[ptr++] = (byte) c;
        return this;
    }

    public Out write(byte b) {
        ensureCapacity(ptr + 1);
        buf[ptr++] = b;
        return this;
    }

    public Out write(int x) {
        if (x == 0) {
            ensureCapacity(ptr + 1);
            buf[ptr++] = '0';
            return this;
        }
        int d = stringSize(x);
        ensureCapacity(ptr + d);
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr + d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        ptr += d;
        return this;
    }

    public Out write(long x) {
        if (x == 0) {
            ensureCapacity(ptr + 1);
            buf[ptr++] = '0';
            return this;
        }
        int d = stringSize(x);
        ensureCapacity(ptr + d);
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr + d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        ptr += d;
        return this;
    }

    public Out write(double d) {
        return write(Double.toString(d));
    }

    private void ensureCapacity(int cap) {
        if (cap > AUTO_FLUSH_THRETHOLD) {
            flush();
        }
        if (cap >= buf.length) {
            int newLength = buf.length;
            while (newLength < cap) newLength <<= 1;
            byte[] newBuf = new byte[newLength];
            System.arraycopy(buf, 0, newBuf, 0, buf.length);
            buf = newBuf;
        }
    }
    private static int stringSize(long x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        long p = -10;
        for (int i = 1; i < 19; i++, p *= 10) if (x > p) return i + d;
        return 19 + d;
    }
    private static int stringSize(int x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        int p = -10;
        for (int i = 1; i < 10; i++, p *= 10) if (x > p) return i + d;
        return 10 + d;
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class ExtendedScanner extends BasicScanner {
    public ExtendedScanner(InputStream in) {super(in);}
    public int[] ints(final int n) {
        final int[] a = new int[n];
        Arrays.setAll(a, $ -> nextInt());
        return a;
    }
    public int[] ints(final int n, final IntUnaryOperator f) {
        final int[] a = new int[n];
        Arrays.setAll(a, $ -> f.applyAsInt(nextInt()));
        return a;
    }
    public int[][] ints(final int n, final int m) {
        final int[][] a = new int[n][];
        Arrays.setAll(a, $ -> ints(m));
        return a;
    }
    public int[][] ints(final int n, final int m, final IntUnaryOperator f) {
        final int[][] a = new int[n][];
        Arrays.setAll(a, $ -> ints(m, f));
        return a;
    }
    public long[] longs(final int n) {
        final long[] a = new long[n];
        Arrays.setAll(a, $ -> nextLong());
        return a;
    }
    public long[] longs(final int n, final LongUnaryOperator f) {
        final long[] a = new long[n];
        Arrays.setAll(a, $ -> f.applyAsLong(nextLong()));
        return a;
    }
    public long[][] longs(final int n, final int m) {
        final long[][] a = new long[n][];
        Arrays.setAll(a, $ -> longs(m));
        return a;
    }
    public long[][] longs(final int n, final int m, final LongUnaryOperator f) {
        final long[][] a = new long[n][];
        Arrays.setAll(a, $ -> longs(m, f));
        return a;
    }
    public char[][] charArrays(final int n) {
        final char[][] c = new char[n][];
        Arrays.setAll(c, $ -> nextChars());
        return c;
    }
    public char[][] charArrays(final int n, final int m) {
        final char[][] c = new char[n][];
        Arrays.setAll(c, $ -> nextChars(m));
        return c;
    }
    public double[] doubles(final int n) {
        final double[] a = new double[n];
        Arrays.setAll(a, $ -> nextDouble());
        return a;
    }
    public double[][] doubles(final int n, final int m) {
        final double[][] a = new double[n][];
        Arrays.setAll(a, $ -> doubles(m));
        return a;
    }
    public String[] strings(final int n) {
        final String[] s = new String[n];
        Arrays.setAll(s, $ -> next());
        return s;
    }
    public String[] strings(final int n, final int m) {
        final String[] s = new String[n];
        Arrays.setAll(s, $ -> next(m));
        return s;
    }
}


@FunctionalInterface
interface IntObjConsumer<T> {
    public void accept(int x, T y);
    public default Consumer<T> curry(final int x) {return y -> accept(x, y);}
}


class IntTreeSet implements Iterable<Integer> {
    private IntTreeMap<Object> m = new IntTreeMap<>();
    private static final Object PRESENT = new Object();
    public PrimitiveIterator.OfInt iterator() {return new TreeSetIterator();}
    public PrimitiveIterator.OfInt descendingIterator() {return new DescendingTreeSetIterator();}
    public int size() {return m.size();}
    public boolean isEmpty() {return m.size() == 0;}
    public boolean contains(int key) {return m.containsKey(key);}
    public boolean add(int key) {return m.put(key, PRESENT) == null;}
    public boolean remove(int key) {return m.remove(key) == PRESENT;}
    public void clear() {m.clear();}
    public OptionalInt first() {return convertEntryToOptional(m.firstEntry());}
    public OptionalInt last () {return convertEntryToOptional(m.lastEntry ());}
    public OptionalInt lower  (int e) {return convertEntryToOptional(m.lowerEntry  (e));}
    public OptionalInt floor  (int e) {return convertEntryToOptional(m.floorEntry  (e));}
    public OptionalInt ceiling(int e) {return convertEntryToOptional(m.ceilingEntry(e));}
    public OptionalInt higher (int e) {return convertEntryToOptional(m.higherEntry (e));}
    public OptionalInt pollFirst() {return convertEntryToOptional(m.pollFirstEntry());}
    public OptionalInt pollLast()  {return convertEntryToOptional(m.pollLastEntry ());}
    private static OptionalInt convertEntryToOptional(IntTreeMap.Entry<?> e) {
        return e == null ? OptionalInt.empty() : OptionalInt.of(e.getKey());
    }
    private class TreeSetIterator implements PrimitiveIterator.OfInt {
        Iterator<IntTreeMap.Entry<Object>> it = m.iterator();
        public boolean hasNext() {return it.hasNext();}
        public int nextInt() {return it.next().key;}
    }
    private class DescendingTreeSetIterator implements PrimitiveIterator.OfInt {
        Iterator<IntTreeMap.Entry<Object>> it = m.descendingIterator();
        public boolean hasNext() {return it.hasNext();}
        public int nextInt() {return it.next().key;}
    }
}
