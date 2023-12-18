import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.OutputStream;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.math.BigDecimal;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long K = in.nextLong();
            if(K==0){
                out.println(2);
                out.println(1+" "+1);
                return;
            }
            if(K==1){
                out.println(2);
                out.println(0+" "+2);
                return;
            }
            if(K<=50){
                out.println(K);
                for(int i=0; i<K; i++){
                    out.print(K+" ");
                }
                out.println();
                return;
            }
            long s = K/50;
            long t = K%50;
            long a[] = new long[50];
            for(int i=0; i<50; i++){
                a[i] = 50+s-1;
            }
            for(int h=0; h<t; h++){
                for(int i=0; i<50; i++){
                    if(i==0){
                        a[0] = a[0] + 50;
                    }
                    else{
                        a[i] = a[i] - 1;
                    }
                }
                Arrays.sort(a);
            }   
            out.println(50);
            for(int i=0; i<50; i++){
                out.print(a[i]+" ");
            }
            out.println();
            
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