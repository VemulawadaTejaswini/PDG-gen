import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
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
            int n , j=0 ,sum=0;
            n = in.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i <n ; i++) {
                arr[i] = in.nextInt();
            }
            int temp=(int)Math.pow(2,j);
            Arrays.sort(arr ,Collections.reverseOrder() );
            n--;
            while(true){
                sum+=arr[j]*temp;
                n-=temp;
                if(n==0)
                    break;
                j++;
                if(n<Math.pow(2,j)){
                    temp=n;
                }
            }

            out.println(sum);


            
                              

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