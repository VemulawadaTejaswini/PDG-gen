import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.util.PriorityQueue;
import java.io.InputStream;

/**
 * @author khokharnikunj8
 */

public class Main {
    public static void main(String[] args) {
        new Thread(null, new Runnable() {
            public void run() {
                new Main().solve();
            }
        }, "1", 1 << 26).start();
    }

    void solve() {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        ScanReader in = new ScanReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EGluttony solver = new EGluttony();
        solver.solve(1, in, out);
        out.close();
    }

    static class EGluttony {
        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            long k = in.scanLong();
            int[] ar = new int[n];
            in.scanInt(ar, n);
            int[] fi = new int[n];
            in.scanInt(fi, n);
            CodeHash.radixSort(ar);
            CodeHash.radixSort(fi);
            PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
            BSTCustom<Long> bst = new BSTCustom<Long>();
            for (int i = 0; i < n; i++) {
                Pair p = new Pair(ar[i], fi[n - i - 1]);
                pq.add(p);
                bst.insert(p.getValue());
            }
            bst.insert(0l);
            pq.add(new Pair(0, 0));
            while (pq.peek().getValue() > 0 && k > 0) {
                Pair p = pq.poll();
                long idx = bst.lower_bound(p.getValue());
                long smaller = bst.get(idx - 1);
                long where = smaller / p.y;
                bst.remove(p.getValue());
                if (k >= (p.x - where)) {
                    k -= (p.x - where);
                    p.x = (int) where;
                } else {
                    p.x -= k;
                    k = 0;
                }
                pq.add(p);
                bst.insert(p.getValue());
            }
            out.println(pq.peek().getValue());
        }

        class Pair implements Comparable<Pair> {
            int x;
            int y;

            public int compareTo(Pair o) {
                if (o.getValue() == this.getValue()) return (o.y - this.y);
                return Long.signum(o.getValue() - this.getValue());
            }

            public Pair(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public long getValue() {
                return ((long) this.x * this.y);
            }

        }

    }

    static class ScanReader {
        private byte[] buf = new byte[4 * 1024];
        private int index;
        private BufferedInputStream in;
        private int total;

        public ScanReader(InputStream inputStream) {
            in = new BufferedInputStream(inputStream);
        }

        private int scan() {
            if (index >= total) {
                index = 0;
                try {
                    total = in.read(buf);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (total <= 0) return -1;
            }
            return buf[index++];
        }

        public int scanInt() {
            int integer = 0;
            int n = scan();
            while (isWhiteSpace(n)) n = scan();
            int neg = 1;
            if (n == '-') {
                neg = -1;
                n = scan();
            }
            while (!isWhiteSpace(n)) {
                if (n >= '0' && n <= '9') {
                    integer *= 10;
                    integer += n - '0';
                    n = scan();
                }
            }
            return neg * integer;
        }

        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;
            else return false;
        }

        public long scanLong() {
            long integer = 0;
            int n = scan();
            while (isWhiteSpace(n)) n = scan();
            int neg = 1;
            if (n == '-') {
                neg = -1;
                n = scan();
            }
            while (!isWhiteSpace(n)) {
                if (n >= '0' && n <= '9') {
                    integer *= 10;
                    integer += n - '0';
                    n = scan();
                }
            }
            return neg * integer;
        }

        public void scanInt(int[] A, int size) {
            for (int i = 0; i < size; i++) A[i] = scanInt();
        }

    }

    static class CodeHash {
        public static int[] radixSort(int[] f) {
            int[] to = new int[f.length];
            {
                int[] b = new int[65537];
                for (int i = 0; i < f.length; i++) b[1 + (f[i] & 0xffff)]++;
                for (int i = 1; i <= 65536; i++) b[i] += b[i - 1];
                for (int i = 0; i < f.length; i++) to[b[f[i] & 0xffff]++] = f[i];
                int[] d = f;
                f = to;
                to = d;
            }
            {
                int[] b = new int[65537];
                for (int i = 0; i < f.length; i++) b[1 + (f[i] >>> 16)]++;
                for (int i = 1; i <= 65536; i++) b[i] += b[i - 1];
                for (int i = 0; i < f.length; i++) to[b[f[i] >>> 16]++] = f[i];
                int[] d = f;
                f = to;
                to = d;
            }
            return f;
        }

    }

    static class BSTCustom<T extends Comparable<? super T>> {
        private Node<T> __root;
        private Node<T> __tempnode;
        private Node<T> __tempnode1;
        private long __size;
        private boolean __multi;

        public BSTCustom() {
            __root = null;
            __size = 0;
            __multi = false;

        }

        public BSTCustom(boolean __multi) {
            __root = null;
            __size = 0;
            this.__multi = __multi;
        }

        public long lower_bound(T data) {
            __tempnode = __root;
            long index = 0;
            while (__tempnode != null) {
                int _comparator = data.compareTo(__tempnode.data);
                if (_comparator < 0) {
                    __tempnode = __tempnode._left;
                } else if (_comparator > 0) {
                    index += (__tempnode.count + __tempnode._leftside);
                    __tempnode = __tempnode._right;
                } else {
                    index += (__tempnode._leftside);
                    break;
                }
            }
            return index;
        }

        private Node<T> remove(Node<T> temp, T data, long count) {
            if (temp == null) return temp;
            int _comparator = data.compareTo(temp.data);
            if (_comparator < 0) temp._left = remove(temp._left, data, count);
            else if (_comparator > 0) temp._right = remove(temp._right, data, count);
            else {
                if (__multi && count < temp.count && temp.count > 1) {
                    __size -= count;
                    temp.count -= count;
                } else {
                    __size -= temp.count;
                    if (temp._left == null && temp._right == null) return null;
                    else if (temp._left == null) return temp._right;
                    else if (temp._right == null) return temp._left;
                    else {
                        __tempnode = minValue(temp._right);
                        temp.data = __tempnode.data;
                        temp.count = __tempnode.count;
                        temp._right = remove(temp._right, __tempnode.data, __tempnode.count);
                        __size += temp.count;
                    }
                }
            }
            // for __leftside and _rightside count
            if (temp._left != null)
                temp._leftside = temp._left._leftside + temp._left._rightside + temp._left.count;
            else temp._leftside = 0;
            if (temp._right != null)
                temp._rightside = temp._right._leftside + temp._right._rightside + temp._right.count;
            else temp._rightside = 0;

            temp._height = Math.max(getheight(temp._left), getheight(temp._right)) + 1;
            //Balancing

            long diff = getDiff(temp);
            if (diff > 1) {
                if (getDiff(temp._left) >= 0) {
                    temp = rightRotate(temp);
                } else {
                    temp._left = leftRotate(temp._left);
                    temp = rightRotate(temp);
                }
            } else if (diff < -1) {
                if (getDiff(temp._right) <= 0) {
                    temp = leftRotate(temp);
                } else {
                    temp._right = rightRotate(temp._right);
                    temp = leftRotate(temp);
                }
            }
            return temp;
        }

        public T get(long index) {
            __tempnode = __root;
            long current = 0;
            while (__tempnode != null) {
                if (__tempnode._left == null) {
                    if (__tempnode.count + current > index) return __tempnode.data;
                    else {
                        current += __tempnode.count;
                        __tempnode = __tempnode._right;
                    }
                } else {
                    if (current + __tempnode._leftside > index) __tempnode = __tempnode._left;
                    else if (current + __tempnode._leftside + __tempnode.count > index)
                        return __tempnode.data;
                    else {
                        current += __tempnode.count + __tempnode._leftside;
                        __tempnode = __tempnode._right;
                    }

                }
            }
            return null;
        }

        private Node<T> minValue(Node<T> temp) {
            __tempnode = temp;
            while (__tempnode._left != null) __tempnode = __tempnode._left;
            return __tempnode;
        }

        public void insert(T data, long... count) {
            if (count.length == 0) __root = insert(__root, data, 1);
            else if (count[0] > 0) __root = insert(__root, data, count[0]);

        }

        public void remove(T data, long... count) {
            if (count.length == 0) __root = remove(__root, data, 1);
            else if (count[0] > 0) __root = remove(__root, data, count[0]);

        }

        private Node<T> insert(Node<T> temp, T data, long count) {
            if (temp == null) {
                if (__multi) {
                    __size += count;
                    return new Node<>(data, count);
                } else {
                    __size++;
                    return new Node<>(data);
                }
            }
            int _comparator = data.compareTo(temp.data);
            if (_comparator < 0) temp._left = insert(temp._left, data, count);
            else if (_comparator > 0) temp._right = insert(temp._right, data, count);
            else if (__multi) {
                __size += count;
                temp.count += count;
            }


            // for __leftside and _rightside count
            if (temp._left != null)
                temp._leftside = temp._left._leftside + temp._left._rightside + temp._left.count;
            else temp._leftside = 0;
            if (temp._right != null)
                temp._rightside = temp._right._leftside + temp._right._rightside + temp._right.count;
            else temp._rightside = 0;

            temp._height = Math.max(getheight(temp._left), getheight(temp._right)) + 1;
            //Balancing

            long diff = getDiff(temp);
            if (diff > 1) {
                if (data.compareTo(temp._left.data) < 0) {
                    temp = rightRotate(temp);
                } else if (data.compareTo(temp._left.data) > 0) {
                    temp._left = leftRotate(temp._left);
                    temp = rightRotate(temp);
                }
            } else if (diff < -1) {
                if (data.compareTo(temp._right.data) > 0) {

                    temp = leftRotate(temp);
                } else if (data.compareTo(temp._right.data) < 0) {
                    temp._right = rightRotate(temp._right);
                    temp = leftRotate(temp);
                }
            }
            return temp;

        }

        private Node<T> rightRotate(Node<T> temp) {
            __tempnode = temp._left;
            __tempnode1 = __tempnode._right;

            __tempnode._right = temp;
            temp._left = __tempnode1;

            //height updation
            temp._height = Math.max(getheight(temp._left), getheight(temp._right)) + 1;
            __tempnode._height = Math.max(getheight(__tempnode._left), getheight(__tempnode._right)) + 1;
            //count updation

            if (temp._left != null)
                temp._leftside = temp._left._leftside + temp._left._rightside + temp._left.count;
            else temp._leftside = 0;
            if (temp._right != null)
                temp._rightside = temp._right._leftside + temp._right._rightside + temp._right.count;
            else temp._rightside = 0;

            if (__tempnode._left != null)
                __tempnode._leftside = __tempnode._left._leftside + __tempnode._left._rightside + __tempnode._left.count;
            else __tempnode._leftside = 0;
            if (__tempnode._right != null)
                __tempnode._rightside = __tempnode._right._leftside + __tempnode._right._rightside + __tempnode._right.count;
            else __tempnode._rightside = 0;


            return __tempnode;
        }

        private Node<T> leftRotate(Node<T> temp) {
            __tempnode = temp._right;
            __tempnode1 = __tempnode._left;

            __tempnode._left = temp;
            temp._right = __tempnode1;

            //height updation
            temp._height = Math.max(getheight(temp._left), getheight(temp._right)) + 1;
            __tempnode._height = Math.max(getheight(__tempnode._left), getheight(__tempnode._right)) + 1;
            //count updation

            if (temp._left != null)
                temp._leftside = temp._left._leftside + temp._left._rightside + temp._left.count;
            else temp._leftside = 0;
            if (temp._right != null)
                temp._rightside = temp._right._leftside + temp._right._rightside + temp._right.count;
            else temp._rightside = 0;


            if (__tempnode._left != null)
                __tempnode._leftside = __tempnode._left._leftside + __tempnode._left._rightside + __tempnode._left.count;
            else __tempnode._leftside = 0;
            if (__tempnode._right != null)
                __tempnode._rightside = __tempnode._right._leftside + __tempnode._right._rightside + __tempnode._right.count;
            else __tempnode._rightside = 0;

            return __tempnode;
        }

        private long getDiff(Node<T> temp) {
            if (temp == null) return 0;
            return getheight(temp._left) - getheight(temp._right);
        }

        public long getheight(Node<T> temp) {
            if (temp == null) return 0;
            return temp._height;
        }

        private class Node<T> {
            T data;
            Node<T> _left;
            Node<T> _right;
            long _leftside;
            long _rightside;
            long _height;
            long count;

            public Node(T data) {
                this.data = data;
                this._left = null;
                this._right = null;
                this._leftside = 0;
                this._rightside = 0;
                this._height = 1;
                this.count = 1;
            }

            public Node(T data, long count) {
                this.data = data;
                this._left = null;
                this._right = null;
                this._leftside = 0;
                this._rightside = 0;
                this._height = 1;
                this.count = count;
            }

        }

    }
}

