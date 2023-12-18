import java.io.*;
import java.util.*;

/**
 * Created by tela on 2017/06/18.
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) a[i] = in.nextInt();

            int max = a[0];
            int min = a[0];
            for (int i = 0; i< n; i++){
                if(max < a[i])max = a[i];
                if(min > a[i])min = a[i];
            }

            int n0 = 0;
            int n1 = 0;
            for (int x : a){
                if (x == max) n0+=1;
                if (x == min) n1+=1;
            }

            if(max-min >= 2){
                out.println("No");
                return;
            }
            else if((max-min)==0){
                if(max == n - 1){
                    out.println("Yes");
                    return;
                }
                else if(2*max <= n){
                    out.println("Yes");
                    return;
                }else{
                    out.println("No");
                    return;
                }
            }else if(((max-min)==1)){
                if(max > n1 &&2*(max - n1) <= n0){
                    out.println("Yes");
                    return;
                }else{
                    out.println("No");
                    return;
                }
            }
        }
    }

    //input
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

    }
}
