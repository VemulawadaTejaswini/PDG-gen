//package BeginnerContest142;

import java.util.*;
import java.io.*;

public class Main {
    static long MODULO = (long)1e9+7;

    public static long factors(long n, long m){ // returns a list of the prime factors of the number n
        HashSet<Long> fact = new HashSet<>();
        fact.add(1L);
        long temp = n;
        for(long i = 2; i*i <= n; i++){
            while(n % i == 0){
                if(m % i == 0)
                    fact.add(i);
                n/=i;
            }
        }
        for(long i = 2; i*i <= m; i++){
            while(m % i == 0){
                if(temp % i == 0)
                    fact.add(i);
                m/=i;
            }
        }
        //System.out.println(fact);
        return fact.size();
    }
    // can also use sieve of eratosthenes for precomputing prime

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        long a = sc.nextLong();
        long b = sc.nextLong();
        pw.println(factors(a,b));
        pw.close();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
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

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}