import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int res = 0;
        if(k<a) System.out.println(k);
        else {
            res+=a;
            k-=a;
            if (k<b) System.out.println(res);
            else {
                k-=b;
                System.out.println(res-k);
            }
        }
        //x+a*t == y - b * t
        //a*t+b*t == y - x
        //(a+b)*t == y - x
        // a + (a*2(k-1) = n*2/k
        // a+(a+2k-2)=2a+2k-2=n*2/k
    }

    private static int[] prefix_function(String s) {
        int n = s.length();
        int[] res = new int[n];
        for (int i = 1; i < n; i++) {
            int j = res[i-1];
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = res[j-1];
            }
            if (s.charAt(i)==s.charAt(j)) {
                j++;
            }
            res[i] = j;
        }
        return res;
    }

    private static boolean check(String s) {
        char cc = s.charAt(0);
        for (char c : s.toCharArray()) {
            if (c!=cc) return false;
        }
        return true;
    }

    private static int[] isPrime(int num) {
        for (int i = 2; i <= (int)Math.sqrt(num); i++) {
            if (num % i == 0) return new int[]{i, num/i};
        }
        return null;
    }

    private static int sign(long num) {
        if (num < 0) return -1;
        return 1;
    }

    private static class Pair {
        int x;
        int y;
        public Pair(int x, int y) {
            this.x=x;
            this.y=y;
        }
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

/**
 * 7 3
 * 3 1 5
 * 9 6 5
 *
 * i = 1: 1
 * i = 2: 2
 * i = 3: 3
 *
 *
 * 1 2 3 3 3 3 3
 */


/**
 *
 *  1+1
 **/