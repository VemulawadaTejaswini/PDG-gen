import java.util.*;
import java.io.*;

public class Main {
    static class Reader {
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

    }
    static class Writer {
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

        void println(Object a) {
            out.append(a + "\n");
        }

        void close() {
            cout.print(out.toString());
            cout.close();
        }
    }

    //a > b
    static int gcd(int a, int b){
        if(b == 0){
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String args[]) throws IOException {
        Reader in = new Reader();
        Writer out = new Writer();
        int n = in.nextInt();
        int x0 = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n + 1);
        for (int i = 0; i < n; i++) {
            arr.add(in.nextInt());
        }
        arr.add(x0);
        Collections.sort(arr);
        int gc = 0;
        for (int i = 0; i < n; i++) {
            int d = arr.get(i + 1) - arr.get(i);
            gc = gcd(Math.max(gc, d), Math.min(gc, d));
        }
        out.print(gc);
        out.close();
    }
}