import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    class Reader {
        BufferedReader in;

        Reader() throws IOException {
            in = new BufferedReader(new InputStreamReader(System.in));
        }

        Reader(String name) throws IOException {
            in = new BufferedReader(new FileReader(name));
        }

        StringTokenizer tokin = new StringTokenizer("");

        String next() throws IOException {
            if (!tokin.hasMoreTokens()) {
                tokin = new StringTokenizer(in.readLine());
            }
            return tokin.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        boolean hasNext() throws IOException {
            if (tokin.hasMoreTokens()) {
                return true;
            } else {
                String s = in.readLine();
                while (s != null && s.length() == 0) {
                    s = in.readLine();
                }
                if (s == null) {
                    return false;
                } else {
                    tokin = new StringTokenizer(s);
                    return true;
                }
            }
        }
    }

    class Writer {
        PrintWriter cout;

        Writer() throws IOException {
            cout = new PrintWriter(System.out);
        }

        Writer(String name) throws IOException {
            cout = new PrintWriter(new FileWriter(name));
        }

        StringBuilder out = new StringBuilder();

        void print(Object a) {
            out.append(a);
        }

        void close() {
            cout.print(out.toString());
            cout.close();
        }
    }

    class Pair {
        int a;
        LinkedList<Integer> ind;

        Pair(int a1) {
            a = a1;
            ind = new LinkedList<>();
        }
    }

    void run() throws Exception {
        Reader in = new Reader();
        Writer out = new Writer();
        int n = in.nextInt();
        int A[] = new int[n];
        int B[] = new int[n];
        LinkedList<Pair> a = new LinkedList<>();
        LinkedList<Pair> b = new LinkedList<>();
        int countA[] = new int[n + 1];
        int countB[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
            if (a.size() == 0 || a.get(a.size() - 1).a != A[i]) {
                a.add(new Pair(A[i]));
            }
            a.get(a.size() - 1).ind.add(i);
            countA[A[i]]++;
        }
        for (int i = 0; i < n; i++) {
            B[i] = in.nextInt();
            if (b.size() == 0 || b.get(b.size() - 1).a != B[i]) {
                b.add(new Pair(B[i]));
            }
            b.get(b.size() - 1).ind.add(i);
            countB[B[i]]++;
        }
        boolean must = true;
        for (int i = 1; i < n + 1; i++) {
            if (countA[i] + countB[i] > n) {
                must = false;
                break;
            }
        }
        Collections.sort(a, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o2.ind.size() - o1.ind.size();
            }
        });
        Collections.sort(b, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o2.ind.size() - o1.ind.size();
            }
        });
        if (must) {
            int B1[] = new int[n];
            for (int i = 0; i < b.size(); i++) {
                Pair bi = b.get(i);
                int size = bi.ind.size();
                int bn = bi.a;
                while (size > 0) {
                    int id = 0;
                    if (a.get(0).a == bn) {
                        id = 1;
                    } else {
                        id = 0;
                    }
                    while (size > 0 && a.get(id).ind.size() > 0) {
                        int j = a.get(id).ind.removeFirst();
                        B1[j] = bn;
                        size--;
                    }
                    if (a.get(id).ind.size() == 0) {
                        a.remove(id);
                    }
                }
            }
            out.print("Yes\n");
            for (int i = 0; i < n; i++) {
                out.print(B1[i] + " ");
            }
        } else {
            out.print("No");
        }
        out.close();
    }

    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}