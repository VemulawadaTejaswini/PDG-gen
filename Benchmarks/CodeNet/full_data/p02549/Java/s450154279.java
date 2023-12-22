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
            int n = in.nextInt();
            int k = in.nextInt();
            long mod = 998244353;
            
            ArrayList<Integer> lArray = new ArrayList<>();
            ArrayList<Integer> rArray = new ArrayList<>();


            for(int i = 0; i < k; i++) {
                int l = in.nextInt();
                int r = in.nextInt();
                lArray.add(l);
                rArray.add(r);        
            }
            // 
            // 1 2 3 4 5
            // ?
            long[] count = new long[n+1];
            long [] sum = new long[n+1];

            for(int i = 1; i < n+1; i++) {
                if(i == 1) {
                    count[i] = 1;
                    sum[i] = 1;
                    continue;
                }

                for(int j = 0; j < lArray.size(); j++) {
                    for(int m = lArray.get(j); m <= rArray.get(j); m++) {
                        if(i-m >=1) {
                            count[i] = count[i] + count[i-m];
                        } else {
                            break;
                        }
                    }
                }
                sum[i] = sum[i-1]+count[i];
            }

            out.println(count[n]%mod);


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