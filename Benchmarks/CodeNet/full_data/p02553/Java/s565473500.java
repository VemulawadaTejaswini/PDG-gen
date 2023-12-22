import java.util.*;
import java.io.*;
import java.util.Arrays; 
import java.util.ArrayList; 
import java.util.Collections; 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        try (PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {
            FastScanner in = new FastScanner(System.in);
            
            String x = in.next();
            String y = in.next();
            String w = in.next();
            String z = in.next();

            BigInteger a = new BigInteger(x);
            BigInteger b = new BigInteger(y);
            BigInteger c = new BigInteger(w);
            BigInteger d = new BigInteger(z);

            BigInteger one = a.multiply(c);
            BigInteger two = a.multiply(d);
            BigInteger three = b.multiply(c);
            BigInteger four = b.multiply(d);

            BigInteger biggerInteger1 = one.max(two);
            BigInteger biggerInteger2 = three.max(four);

            out.println(biggerInteger1.max(biggerInteger2));

        } finally {
            //out.close();
        }
        
           
    }
}

class FastScanner {
   private final BufferedReader br;
   private StringTokenizer st;
 
    FastScanner(InputStream InputStream) {
        br = new BufferedReader(new InputStreamReader(InputStream));
    }
    
    String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return st.nextToken();
    }
    
    int nextInt() {
        return Integer.parseInt(next());
    }
    
    long nextLong() {
        return Long.parseLong(next());
    }
    
    double nextDouble() {
        return Double.parseDouble(next());
    }


    
    ArrayList<Integer> nextIntList(int count) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int n = 0; n < count; n++) {
            int number = nextInt();
            array.add(number);
        }
        return array;
    }
    
    int[] nextIntArray(int count) {
        int[] array = new int[count];
        for (int n = 0; n < count; n++) {
            array[n] = nextInt();
        }
        return array;
    }
}