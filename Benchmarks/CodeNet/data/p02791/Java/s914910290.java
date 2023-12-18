
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLOutput;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static void bin(int n) {
        if (n > 1)
            bin(n/2);

        System.out.print(n % 2);
    }
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }
    static class Pair<a , b>{
        a v1;
        b v2;
        Pair(a v1 , b v2){
            this.v1 = v1;
            this.v2 = v2;
        }
    }
    static class TaskA {
        public void solve(int testNumber, InputReader in, PrintWriter out){
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i]= in.nextInt();
            }
            int small=arr[0];
            int ans = 0;
            for (int i = 0; i <n ; i++) {
                if (arr[i] <= small) {
                    ans++;
                    small = arr[i];
                }
            }
            System.out.println(ans);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public int nextInt(){return  Integer.parseInt(next());}
        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}