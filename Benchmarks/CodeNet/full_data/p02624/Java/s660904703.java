import java.util.*;
import java.io.*;

public class Main {
    static long[] sodArr;
    
    public static void main(String[] args)throws Exception {
        InputReader in = new InputReader(System.in);
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        // write your code here //
        int x = in.nextInt();
        genSOD(x);
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += sodArr[i] * i;
        }
        pw.println(sum);
        pw.close();
    }
    
    static void genSOD(long N) {
        sodArr = new long[10000000 + 1];
        for(int i = 1; i <= N; i++) {
            for(int j = i; j <= N; j += i) {
                sodArr[j] += i;
            }
        }
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