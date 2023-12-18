
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }
    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out){
            int n = in.nextInt();
            int[] arr = new int[n];
            int[] mod1 = new int[100001];
            int[] mod2 = new int[100001];
            for (int i = 0; i <n ; i++) {
                arr[i]=in.nextInt();
            }
            for (int i = 0; i <n; i+=2){
                mod1[arr[i]]++;
            }
            for (int i = 1; i <n ; i+=2) {
                mod2[arr[i]]++;
            }
            int e1 = 0;
            int e2 = 0;
            int o1 = 0;
            int o2 = 0;
            for (int i = 1; i <mod1.length ; i++) {
                if (mod1[i] >= mod1[e1]) {
                    e2=e1;
                    e1=i;
                }
                else if (mod1[i] > mod1[e2]) e2=i;
            }
            for (int i = 1; i <mod1.length ; i++) {
                if (mod2[i] >= mod2[o1]) {
                    o2=o1;
                    o1=i;
                }
                else if (mod2[i] > mod2[o2]){
                    o2=i;
                }
            }
            if (e1!=o1) System.out.println((n/2-mod1[e1]) + (n/2-mod2[o1]));
            else {
                System.out.println(Math.min((n/2-mod1[e2])+(n/2-mod2[o1]) , (n/2-mod1[e1])+(n/2-mod2[o2])));
            }
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