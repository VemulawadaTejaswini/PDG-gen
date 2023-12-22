import java.util.*;
import java.io.*;

public class Main {

    static int[] sodArray;

    public static void main(String[] args)throws Exception {
        InputReader in = new InputReader(System.in);
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        // write your code here //
        long test = in.nextInt();
        long total = 0;
        for (int i = 1; i <= test; i++) {
            //int input = in.nextInt();
            //int sum = sumUsingSod(input);
            long count = sumUsingDivisor(i);
            total = total + (count * i);

        }
        pw.println(total);
        pw.close();
    }

    private static long sumUsingDivisor(int x) {
        long sum = 0;
        for (int i = 1; i * i <= x; i++) {
            if(x % i == 0) {
                long j = x / i;
                sum++;
                if(i != j) sum++;
            }
        }
        return sum;
    }


    private static int sumUsingSod(int n) {
        sodArray = new int[n + 1];
        int N = sodArray.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j < N; j += i) {
                if(i < n)
                    sodArray[j] += i;
            }
        }
        return sodArray[n];
    }


    /******************************
     ** IO STUFF STARTS FROM HERE**
     ******************************/

    static void debug(Object...obj) {
        System.err.println(Arrays.deepToString(obj));
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        //InputReader in = new InputReader(new FileReader("File_Name"));
        public InputReader(FileReader file) {
            reader = new BufferedReader(file);
            tokenizer = null;
        }

        public String next() {

            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens())
                    tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                return null;
            }

            return tokenizer.nextToken();
        }

        public String nextLine() {
            String line = null;
            try {
                tokenizer = null;
                line =  reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return line;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public boolean hasNext(){
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens())
                    tokenizer = new StringTokenizer(reader.readLine());
            }
            catch (Exception e) {
                return false;
            }
            return true;
        }
    }
}