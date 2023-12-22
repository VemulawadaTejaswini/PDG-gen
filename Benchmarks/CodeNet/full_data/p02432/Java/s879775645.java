import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder out = new StringBuilder();
        Deque<Integer> dq = new Deque<>();
        final int Q = nextInt(sc);
        for (int i = 0; i < Q; i++) {
            int q = nextInt(sc);
            int d = nextInt(sc);
            switch (q) {
                case 0:
                    int x = nextInt(sc);
                    switch (d) {
                        case 0:
                            dq.addFirst(x);
                            break;
                        case 1:
                            dq.addLast(x);
                            break;
                        default:
                            break;
                    }
                    break;
                case 1:
                    out.append(dq.get(d)).append('\n');
                    break;
                case 2:
                    switch (d) {
                        case 0:
                            dq.pollFirst();
                            break;
                        case 1:
                            dq.pollLast();
                            break;
                        default:
                            break;
                    }
                default:
                    break;
            }
        }
        sc.close();
        pw.write(out.toString());
        pw.flush();
        pw.close();
    }

    public static int nextInt(Scanner sc) {
        return Integer.parseInt(sc.next());
    }
    public static long nextLong(Scanner sc) {
        return Long.parseLong(sc.next());
    }
}


/**
 * verified:
 * 
 * @author https://atcoder.jp/users/suisen
 * @param <T> Deque に格納するデータの型
 */
@SuppressWarnings("unchecked")
class Deque<T> implements Iterable<T>, RandomAccess {

    static final int DEFAULT_CAPACITY = 1 << 6;

    T[] buf;

    int len = 1;

    int mask;

    int head = 0;

    int tail = 0;

    public Deque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException(
                String.format("Capacity %d is negative.", capacity)
            );
        }
        while (this.len < capacity) {
            this.len <<= 1;
        }
        this.mask = this.len - 1;
        this.buf = (T[]) new Object[len];
    }

    public Deque() {
        this(DEFAULT_CAPACITY);
    }

    public T getLast() {
        if (size() == 0) throw new NoSuchElementException();
        return buf[(tail - 1) & mask];
    }

    public T getFirst() {
        if (size() == 0) throw new NoSuchElementException();
        return buf[head];
    }

    public T get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException(
                String.format("Index %d out of bounds for length %d.", index, size())
            );
        }
        return buf[(head + index) & mask];
    }

    public void addLast(T v) {
        if (size() == len) grow();
        buf[tail++ & mask] = v;
    }

    public void addFirst(T v) {
        if (size() == len) grow();
        buf[--head & mask] = v;
    }

    public T removeLast() {
        if (size() == 0) throw new NoSuchElementException();
        return buf[--tail & mask];
    }

    public T removeFirst() {
        if (size() == 0) throw new NoSuchElementException();
        return buf[head++ & mask];
    }

    public T pollLast() {
        if (size() == 0) return null;
        return removeLast();
    }

    public T pollFirst() {
        if (size() == 0) return null;
        return removeFirst();
    }

    public int size() {
        return tail - head;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void removeAll() {
        head = tail = 0;
    }

    public void clear(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException(
                String.format("Capacity %d is negative.", capacity)
            );
        }
        head = tail = 0;
        this.len = 1;
        while (this.len < capacity) {
            this.len <<= 1;
        }
        this.mask = this.len - 1;
        this.buf = (T[]) new Object[len];
    }

    public void clear() {
        clear(DEFAULT_CAPACITY);
    }

    public T[] toArray(Class<T> clazz) {
        T[] ret = (T[]) Array.newInstance(clazz, size());
        Iterator<T> it = iterator();
        Arrays.setAll(ret, i -> it.next());
        return ret;
    }

    private void grow() {
        T[] newBuf = (T[]) new Object[len << 1];
        head &= mask;
        tail &= mask;
        int len1 = len - head;
        int len2 = head;
        System.arraycopy(buf, head, newBuf, 0, len1);
        System.arraycopy(buf, 0, newBuf, len1, len2);
        this.head = 0;
        this.tail = this.len;
        this.len <<= 1;
        this.mask = this.len - 1;
        this.buf = newBuf;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>(){
            int it = head;
            public boolean hasNext() {return it < tail;}
            public T next() {return buf[it++ & mask];}
        };
    }

    public Iterator<T> descendingIterator() {
        return new Iterator<T>(){
            int it = tail;
            public boolean hasNext() {return it > head;}
            public T next() {return buf[--it & mask];}
        };
    }

    /***************************** DEBUG *********************************/

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) sb.append(',');
        }
        sb.append(']');
        return sb.toString();
    }

    /******* Usage *******/

    public static void main(String[] args) {
        Deque<Integer> dq = new Deque<>();
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);
        dq.addFirst(1);
        dq.addFirst(0);
        dq.addFirst(-1);
        System.out.println(dq);
        dq.removeAll();
        System.out.println(dq);
        System.out.println(dq.pollFirst()); // => null
        // System.out.println(dq.removeFirst()); => NoSuchElementException
    }
}
