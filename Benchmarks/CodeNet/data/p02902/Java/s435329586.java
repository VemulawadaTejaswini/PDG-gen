import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedInputStream;
import java.util.Iterator;
import java.util.ArrayList;
import java.io.FilterInputStream;
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
        FPure solver = new FPure();
        solver.solve(1, in, out);
        out.close();
    }

    static class FPure {
        int[][] G;
        LinkedListCustom<Integer> ln;
        boolean[] visited;
        boolean[] stack;
        int nd;

        public void findIt(int node) {
            if (nd != -1) return;
            if (stack[node]) {
                nd = node;
                return;
            }
            if (visited[node]) return;
            stack[node] = true;
            visited[node] = true;
            ln.add(node);
            for (int i : G[node]) {
                if (nd != -1) return;
                findIt(i);
            }
            if (nd != -1) return;
            ln.removeLast();
            stack[node] = false;
        }

        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            int m = in.scanInt();
            int[] from = new int[m];
            int[] to = new int[m];
            for (int i = 0; i < m; i++) {
                from[i] = in.scanInt();
                to[i] = in.scanInt();
            }
            visited = new boolean[n + 1];
            stack = new boolean[n + 1];
            G = CodeHash.packGraphdirected(from, to, n, m);
            ln = new LinkedListCustom<Integer>();
            nd = -1;
            ArrayList<Integer> ans = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                nd = -1;
                findIt(i);
                if (nd != -1) {
                    boolean flag = false;
                    Iterator<Integer> it = ln.iterator();
                    while (it.hasNext()) {
                        int temp = it.next();
                        if (temp == nd) flag = true;
                        if (flag) ans.add(temp);
                    }
                    if (ans.size() != 0) {
                        out.println(ans.size());
                        for (int j : ans) out.println(j);
                        return;
                    }

                }
            }
            out.println(-1);

        }

    }

    static class LinkedListCustom<T extends Comparable<? super T>> {
        private Node<T> __tempnode;
        private Node<T> __first;
        private Node<T> __last;
        private Node<T> __mid;
        private int __size;

        public LinkedListCustom() {
            __first = null;
            __last = null;
            __mid = null;
            __size = 0;
        }

        public void add(T data) {
            __tempnode = new Node<>(data);
            if (__size == 0) {
                __first = __last = __mid = __tempnode;
            } else {
                __tempnode.previous = __last;
                __last.next = __tempnode;
                __last = __tempnode;
                if ((__size & 1) == 0) __mid = __mid.next;
            }
            __size++;
        }

        public T removeLast() {
            if (__last == null)
                throw new ArrayIndexOutOfBoundsException("LinkedList ERROR :: removeLast Already Empty");
            __tempnode = __last;
            if (__size == 1) {
                __first = __last = __mid = null;
            } else {
                __last = __last.previous;
                __last.next = null;
                if ((__size & 1) == 1) __mid = __mid.previous;
            }
            __size--;
            return __tempnode.data;
        }

        public Iterator<T> iterator() {
            return new Iterator<T>() {
                private int currentIndex = 0;
                private Node<T> iterate = __first;


                public boolean hasNext() {
                    return currentIndex < __size;
                }


                public T next() {
                    currentIndex++;
                    __tempnode = iterate;
                    iterate = iterate.next;
                    return __tempnode.data;
                }


                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
        }

        private class Node<T> {
            Node<T> previous;
            Node<T> next;
            T data;

            public Node(T data) {
                this.data = data;
                previous = null;
                next = null;
            }

        }

    }

    static class CodeHash {
        public static int[][] packGraphdirected(int[] from, int[] to, int n, int m) {
            int[][] g = new int[n + 1][];
            int p[] = new int[n + 1];
            for (int i = 0; i < m; i++) p[from[i]]++;
            for (int i = 0; i <= n; i++) g[i] = new int[p[i]];
            for (int i = 0; i < m; i++) g[from[i]][--p[from[i]]] = to[i];
            return g;
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

    }
}

