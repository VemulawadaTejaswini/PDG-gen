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
            Scanner in = new Scanner(System.in);  
            BigInteger n = in.nextBigInteger();  

            /*
            BigInteger sum = BigInteger.ZERO;
            while ((n.compareTo(new BigInteger("0"))) == 1) {
                BigInteger mod = n.mod(new BigInteger("10")); 
                sum = sum.add(mod);
                n = n.divide(new BigInteger("10"));
            }
            //out.println(sum);
            //out.println(sum.mod(new BigInteger("9")));

            if((sum.mod(new BigInteger("9"))).equals(new BigInteger("0"))) {
                out.println("Yes");
            } else {
                out.println("No");
            }*/

            if((n.mod(new BigInteger("9"))).equals(new BigInteger("0"))) {
                out.println("Yes");
            } else {
                out.println("No");
            }








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
