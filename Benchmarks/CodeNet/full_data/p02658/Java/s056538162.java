//code written by a living bruh moment
import java.io.*;
import java.lang.*;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
//change to Main
public class Main {
    static InputReader in = new InputReader(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int q = in.nextInt();
        BigInteger ans = BigInteger.ONE;
        boolean check = true;
        BigInteger limit = new BigInteger("1000000000000000000");
        for(int i = 0; i<q; i++){
            BigInteger val = in.nextBigInteger();
            ans = ans.multiply(val);
            if(ans.compareTo(limit)>0){
                for(int j = i; j<q; j++){
                    if(q-j>1){
                        int val2 = in.nextInt();
                        if(val2==0){
                            out.println("0");
                            check = false;
                            break;
                        }
                    }
                }
                if(check){
                    out.println("-1");
                    check = false;
                    break;
                }
            }
        }
        if(check){
            out.println(ans);
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
        public long nextLong()
        {
            return Long.parseLong(next());
        }
        public double nextDouble()
        {
            return Double.parseDouble(next());
        }
        public String nextLine()
        {
            try
            {
                return reader.readLine();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            return null;
        }
        public boolean hasNext()
        {
            String next=null;
            try
            {
                next=reader.readLine();
            }
            catch(Exception e)
            {
            }
            if(next==null)
            {
                return false;
            }
            tokenizer=new StringTokenizer(next);
            return true;
        }
        public BigInteger nextBigInteger() {
            return new BigInteger(next());
        }
    }
}