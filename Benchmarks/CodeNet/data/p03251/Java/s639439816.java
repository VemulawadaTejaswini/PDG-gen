//code written by a living bruh moment
import java.io.*;
import java.lang.*;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static InputReader in = new InputReader(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = in.nextInt();
        int m = in.nextInt();
        int x = in.nextInt()+1;
        int y = in.nextInt();
        int[] xa = new int[n];
        int[] ya = new int[m];
        for(int i = 0; i<n; i++){
            xa[i] = in.nextInt();
        }
        for(int i = 0; i<m; i++){
            ya[i] = in.nextInt();
        }
        Arrays.sort(xa);
        boolean check = true;
        Arrays.sort(ya);
        if(xa[n-1]<ya[0]){
            while(x<=y){
                if(xa[n-1] < x && x <= ya[0]){
                    out.println("No War");
                    check = false;
                    break;
                }
                ++x;
            }
            if(check){
                out.println("War");
            }
        }
        else{
            out.println("War");
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
    }
}