import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        int n = nextInt(sc);
        char[][] s = new char[n][];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next().toCharArray();
        }
        int[] l = new int[n];
        int[] r = new int[n];
        int sl = 0;
        int sr = 0;
        int lmax = -1;
        int lmaxi = -1;
        int rmax = -1;
        int rmaxi = -1;
        for (int i = 0; i < n; i++) {
            for (char c : s[i]) {
                if (c == ')') {
                    if (r[i] > 0) {
                        r[i]--;
                    } else {
                        l[i]++;
                    }
                } else {
                    r[i]++;
                }
            }
            sl += l[i];
            sr += r[i];
            if (l[i] != 0 && r[i] == 0 && lmax < l[i]) {
                lmax = l[i];
                lmaxi = i;
            }
            if (l[i] == 0 && r[i] != 0 && rmax < r[i]) {
                rmax = r[i];
                rmaxi = i;
            }
        }
        if (sl != sr) {
            sb.append("No\n");
            pw.write(sb.toString());
            pw.flush();
            pw.close();
            return;
        } else if (sl == 0) {
            sb.append("Yes\n");
            pw.write(sb.toString());
            pw.flush();
            pw.close();
            return;
        } else if (lmaxi < 0 || rmaxi < 0) {
            sb.append("No\n");
            pw.write(sb.toString());
            pw.flush();
            pw.close();
            return;
        } else {
            PriorityQueue<Integer> pq = new PriorityQueue<Integer>((u, v) -> l[u] - l[v]);
            PriorityQueue<Integer> rpq = new PriorityQueue<Integer>((u, v) -> l[v] - l[u]);
            
            int ll = r[rmaxi];
            for (int i = 0; i < n; i++) {
                if (i == lmaxi || i == rmaxi) {
                    continue;
                } else if (l[i] < r[i]) {
                    pq.push(i);
                } else {
                    rpq.push(i);
                }
            }
            while (pq.size() > 0) {
                int i = pq.pop();
                if (l[i] > ll) {
                    sb.append("No\n");
                    pw.write(sb.toString());
                    pw.flush();
                    pw.close();
                    return;
                }
                ll = ll - l[i] + r[i];
            }
            while (rpq.size() > 0) {
                int i = rpq.pop();
                if (l[i] > ll) {
                    sb.append("No\n");
                    pw.write(sb.toString());
                    pw.flush();
                    pw.close();
                    return;
                }
                ll = ll - l[i] + r[i];
            }
            sb.append("Yes\n");
            pw.write(sb.toString());
            pw.flush();
            pw.close();
            return;
        }
    }

    public static int nextInt(Scanner sc) {
        return Integer.parseInt(sc.next());
    }
    public static long nextLong(Scanner sc) {
        return Long.parseLong(sc.next());
    }
}

class IntArrayList implements Iterable<Integer> {

    static final int DEFAULT_CAPACITY = 64;

    int[] a;
    int tail = 0;
    
    public IntArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException();
        }
        this.a = new int[capacity];
    }

    public IntArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public void add(int v) {
        if (tail == a.length) grow();
        a[tail++] = v;
    }

    public int removeLast() {
        if (tail == 0) throw new NoSuchElementException();
        return a[--tail];
    }

    public int get(final int i) {
        if (i < 0 || i >= tail) throw new IndexOutOfBoundsException("Index " + i + " out of bounds for length " + size());
        return a[i];
    }

    public void set(final int i, final int v) {
        if (i < 0 || i >= tail) throw new IndexOutOfBoundsException("Index " + i + " out of bounds for length " + size());
        a[i] = v;
    }

    void grow() {
        int[] b = new int[a.length << 1];
        System.arraycopy(a, 0, b, 0, a.length);
        a = b;
    }

    public int size() {
        return tail;
    }

    public void clear() {
        tail = 0;
    }

    public void reverse(int fromIndex, int toIndex) {
        int l = fromIndex, r = toIndex - 1;
        while (l < r) {
            int tmp = a[l]; a[l] = a[r]; a[r] = tmp;
            l++; r--;
        }
    }

    public void reverse() {
        reverse(0, tail);
    }

    public int[] toArray() {
        final int[] ret = new int[tail];
        System.arraycopy(a, 0, ret, 0, tail);
        return ret;
    }

    public void sort() {
        Arrays.sort(a, 0, tail);
    }

    public PrimitiveIterator.OfInt iterator() {
        return new PrimitiveIterator.OfInt(){
            int i = 0;
            public boolean hasNext() {return i < tail;}
            public int nextInt() {return a[i++];}
        };
    }
}

class IntPriorityQueue {
    static final int DEFAULT_CAPACITY = 1 << 6;

    @FunctionalInterface
    public static interface IntComparator {public int compare(int a, int b);}

    int[] que;

    final IntComparator comparator;
    final boolean descending;

    int size = 0;

    public IntPriorityQueue(int capacity, boolean descending) {
        int k = 1;
        while (k < capacity) k <<= 1;
        this.que = new int[k];
        this.comparator = null;
        this.descending = descending;
        this.size = 0;
    }

    public IntPriorityQueue(int capacity) {
        this(capacity, false);
    }

    public IntPriorityQueue(boolean descending) {
        this(DEFAULT_CAPACITY, descending);
    }

    public IntPriorityQueue() {
        this(DEFAULT_CAPACITY, false);
    }

    public IntPriorityQueue(int capacity, IntComparator comparator) {
        int k = 1;
        while (k < capacity) k <<= 1;
        this.que = new int[k];
        this.comparator = comparator;
        this.descending = false;
        this.size = 0;
    }

    public IntPriorityQueue(IntComparator comparator) {
        this(DEFAULT_CAPACITY, comparator);
    }

    public void push(int e) {
        if (++size == que.length) grow();
        if (comparator != null) {
            pushUsingComparator(e);
        } else if (descending) {
            pushDescending(e);
        } else {
            pushAscending(e);
        }
    }

    void grow() {
        int[] newQue = new int[que.length << 1];
        System.arraycopy(que, 0, newQue, 0, que.length);
        que = newQue;
    }

    void pushUsingComparator(int e) {
        int i = size;
        while (i > 1) {
            int p = i >> 1;
            if (comparator.compare(e, que[p]) >= 0) break;
            que[i] = que[i = p];
        }
        que[i] = e;
    }

    void pushDescending(int e) {
        int i = size;
        while (i > 1) {
            int p = i >> 1;
            if (e <= que[p]) break;
            que[i] = que[i = p];
        }
        que[i] = (int) e;
    }

    void pushAscending(int e) {
        int i = size;
        while (i > 1) {
            int p = i >> 1;
            if (e >= que[p]) break;
            que[i] = que[i = p];
        }
        que[i] = (int) e;
    }

    public int pop() {
        if (comparator != null) {
            return popUsingComparator();
        } else if (descending) {
            return popDescending();
        } else {
            return popAscending();
        }
    }

    int popUsingComparator() {
        int ret = que[1];
        int e = que[size--];
        int i = 1;
        int h = size >> 1;
        while (i <= h) {
            int l = i << 1 | 0, r = i << 1 | 1;
            if (r <= size) {
                if (comparator.compare(que[l], que[r]) > 0) {
                    if (comparator.compare(e, que[r]) <= 0) break;
                    que[i] = que[i = r];
                } else {
                    if (comparator.compare(e, que[l]) <= 0) break;
                    que[i] = que[i = l];
                }
            } else {
                if (comparator.compare(e, que[l]) <= 0) break;
                que[i] = que[i = l];
            }
        }
        que[i] = e;
        return ret;
    }

    int popDescending() {
        int ret = que[1];
        int e = que[size--];
        int i = 1;
        int h = size >> 1;
        while (i <= h) {
            int l = i << 1 | 0, r = i << 1 | 1;
            if (r <= size) {
                if (que[l] < que[r]) {
                    if (e >= que[r]) break;
                    que[i] = que[i = r];
                } else {
                    if (e >= que[l]) break;
                    que[i] = que[i = l];
                }
            } else {
                if (e >= que[l]) break;
                que[i] = que[i = l];
            }
        }
        que[i] = (int) e;
        return ret;
    }

    int popAscending() {
        int ret = que[1];
        int e = que[size--];
        int i = 1;
        int h = size >> 1;
        while (i <= h) {
            int l = i << 1 | 0, r = i << 1 | 1;
            if (r <= size) {
                if (que[l] > que[r]) {
                    if (e <= que[r]) break;
                    que[i] = que[i = r];
                } else {
                    if (e <= que[l]) break;
                    que[i] = que[i = l];
                }
            } else {
                if (e <= que[l]) break;
                que[i] = que[i = l];
            }
        }
        que[i] = (int) e;
        return ret;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = 0;
    }

    public static void main(String[] args) {
        IntPriorityQueue pq = new IntPriorityQueue(1, true);
        pq.push(  3); pq.push(  4); pq.push(  1); pq.push(- 1);
        pq.push( 10); pq.push( 14); pq.push( 30); pq.push(- 3);
        pq.push(-13); pq.push( 32); pq.push( 13); pq.push(  7);
        pq.push(- 7); pq.push( 12); pq.push(-29); pq.push(- 2);
        pq.push(  0); pq.push(  1); pq.push( 10);
        while (pq.size() > 0) {
            System.out.print(pq.pop());
            if (pq.size() > 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }
}

@SuppressWarnings("unchecked") 
class PriorityQueue<T> {
    static final int DEFAULT_CAPACITY = 1 << 6;

    T[] que;

    final Comparator<? super T> comparator;

    int size = 0;

    public PriorityQueue(int capacity, Comparator<? super T> comparator) {
        int k = 1;
        while (k < capacity) k <<= 1;
        this.que = (T[]) new Object[k];
        this.comparator = comparator;
        this.size = 0;
    }

    public PriorityQueue(int capacity) {
        this(capacity, null);
    }

    public PriorityQueue(Comparator<? super T> comparator) {
        this(DEFAULT_CAPACITY, comparator);
    }

    public PriorityQueue() {
        this(DEFAULT_CAPACITY, null);
    }

    public void push(T e) {
        if (++size == que.length) grow();
        if (comparator != null) {
            pushUsingComparator(e);
        } else {
            pushComparable((Comparable<? super T>) e);
        }
    }

    void grow() {
        T[] newQue = (T[]) new Object[que.length << 1];
        System.arraycopy(que, 0, newQue, 0, que.length);
        que = newQue;
    }

    void pushUsingComparator(T e) {
        int i = size;
        while (i > 1) {
            int p = i >> 1;
            if (comparator.compare(e, que[p]) >= 0) break;
            que[i] = que[i = p];
        }
        que[i] = e;
    }

    void pushComparable(Comparable<? super T> e) {
        int i = size;
        while (i > 1) {
            int p = i >> 1;
            if (e.compareTo(que[p]) >= 0) break;
            que[i] = que[i = p];
        }
        que[i] = (T) e;
    }

    public T pop() {
        if (comparator != null) {
            return popUsingComparator();
        } else {
            return popComparable();
        }
    }

    T popUsingComparator() {
        T ret = que[1];
        T e = que[size--];
        int i = 1;
        int h = size >> 1;
        while (i <= h) {
            int l = i << 1 | 0, r = i << 1 | 1;
            if (r <= size) {
                if (comparator.compare(que[l], que[r]) > 0) {
                    if (comparator.compare(e, que[r]) <= 0) break;
                    que[i] = que[i = r];
                } else {
                    if (comparator.compare(e, que[l]) <= 0) break;
                    que[i] = que[i = l];
                }
            } else {
                if (comparator.compare(e, que[l]) <= 0) break;
                que[i] = que[i = l];
            }
        }
        que[i] = e;
        return ret;
    }

    T popComparable() {
        T ret = que[1];
        Comparable<? super T> e = (Comparable<? super T>) que[size--];
        int i = 1;
        int h = size >> 1;
        while (i <= h) {
            int l = i << 1 | 0, r = i << 1 | 1;
            if (r <= size) {
                if (((Comparable<? super T>) que[l]).compareTo(que[r]) > 0) {
                    if (e.compareTo(que[r]) <= 0) break;
                    que[i] = que[i = r];
                } else {
                    if (e.compareTo(que[l]) <= 0) break;
                    que[i] = que[i = l];
                }
            } else {
                if (e.compareTo(que[l]) <= 0) break;
                que[i] = que[i = l];
            }
        }
        que[i] = (T) e;
        return ret;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = 0;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(1);
        pq.push(  3); pq.push(  4); pq.push(  1); pq.push(- 1);
        pq.push( 10); pq.push( 14); pq.push( 30); pq.push(- 3);
        pq.push(-13); pq.push( 32); pq.push( 13); pq.push(  7);
        pq.push(- 7); pq.push( 12); pq.push(-29); pq.push(- 2);
        pq.push(  0); pq.push(  1); pq.push( 10);
        while (pq.size() > 0) {
            System.out.print(pq.pop());
            if (pq.size() > 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }
}