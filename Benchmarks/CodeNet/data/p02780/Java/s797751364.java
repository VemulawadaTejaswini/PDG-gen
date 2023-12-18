
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
        static int[] visited ;
        static ArrayList<Integer>[] graph;
        public static void sol(int n , StringBuilder s , int[][] arr){
            



        }
        public void solve(int testNumber, InputReader in, PrintWriter out){
            int n = in.nextInt();
            int k = in.nextInt();
            double[] ex = new double[n];
            for (int i = 0; i <n; i++){
                ex[i] = (((double) (in.nextInt()+1))/2);
            }
            double[] sum = new double[n];
            sum[0]=ex[0];
            for (int i = 1; i <n ; i++) {
                sum[i]=sum[i-1]+ex[i];
            }
            double ans = sum[k-1];
            for (int i = 1; i+k-1 <n; i++){
                if (sum[i+k-1]-sum[i-1] > ans) ans=sum[i+k-1]-sum[i-1];
            }
            System.out.printf("%.12f", ans);







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