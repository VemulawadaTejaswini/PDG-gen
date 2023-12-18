import java.io.*;
import java.lang.*;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
import java.math.BigInteger;

public class Main {
    static InputReader in = new InputReader(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int count = 0;
        int[] a = {n,m,k};
        Arrays.sort(a);
        if(a[0]%2==0 && a[1]%2==0 && a[2]%2==0 || a[0]%2==1 && a[1]%2==1 && a[2]%2==1 ){
            out.print((a[2]-a[1])/2 + (a[2]-a[0])/2);
        }
        else{
            int evencount = 0;
            int oddcount = 0;
            for(int i = 0; i<3; i++){
                if(a[i]%2==0) ++evencount;
                else ++oddcount;
            }
            if(evencount>oddcount){
                for(int i = 0; i<3; i++){
                    if(a[i]%2==0) ++a[i];
                }
            }
            else{
                for(int i = 0; i<3; i++){
                    if(a[i]%2==1) ++a[i];
                }
            }
            out.print((a[2]-a[1])/2 + (a[2]-a[0])/2 + 1);
        }
        out.close();
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

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
            try {
                return reader.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        public boolean hasNext() {
            String next = null;
            try {
                next = reader.readLine();
            } catch (Exception e) {
            }
            if (next == null) {
                return false;
            }
            tokenizer = new StringTokenizer(next);
            return true;
        }

        public BigInteger nextBigInteger() {
            return new BigInteger(next());
        }
    }
}

