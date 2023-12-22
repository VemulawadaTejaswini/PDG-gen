import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.call(in,out);
        out.close();
    }

    static class TaskA {
        public void call(InputReader in, PrintWriter out) {
            int n,m,k;
            int sum=0 , count=0;
            n = in.nextInt();
            m = in.nextInt();
            k = in.nextInt();
            int[] arr = new int[n+m];
            for (int i = 0; i <arr.length ; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i <arr.length ; i++) {
                sum+=arr[i];
                if(sum<=k)
                    count++;
                else
                    break;
            }
            out.println(count);






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

        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
            return Long.parseLong(next());
        }


    }
}