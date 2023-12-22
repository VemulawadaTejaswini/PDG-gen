import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        long [] powersOf26 = new long [20];
        powersOf26[0] = 1;
        for (int x=1; x<20; x++) {
            powersOf26[x] = powersOf26[x-1]*26;
        }
        long input = nextLong();

        boolean hasNotZAppearedBefore = false;
        for (int x=20-1; x>=0; x--) {
            long power = powersOf26[x];
            long cur = input / power;
            long prevInput = input;
            input -= power*cur;
            if (cur!=0) {
                if (cur==1 && input==0) {
                    input = prevInput;
                }
                else {
                    System.out.print((char)(cur-1+'a'));
                }
                hasNotZAppearedBefore = true;
            }
            else if (hasNotZAppearedBefore) {
                System.out.print('z');
            }
        }
    }
    public static long power (long base, long exponent) {
        if (exponent==1) {
            return base;
        }
        else if (exponent==0) {
            return 1;
        }
        if (exponent%2!=0) {
            long temp = power(base, exponent/2);
            return temp*temp*base;
        }
        else {
            long temp = power(base, exponent/2);
            return temp*temp;
        }
    }
    
    public static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
}


