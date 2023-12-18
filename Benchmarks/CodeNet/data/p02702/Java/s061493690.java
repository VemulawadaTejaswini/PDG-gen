import java.io.*;
import java.math.BigInteger;
import java.util.*;

//Main class start
public class Main {
    // solution starts here!!!
    public void solve() throws IOException {

        String s = in.next();
        StringBuilder sb =new StringBuilder(s);
        long c=0;
        for(int i=0; i<s.length()-4; i++)
        {

            for(int j=i+3 ; j<=s.length() ; j++)
            {
                StringBuilder sub =new StringBuilder(sb.substring(i,j));
                BigInteger b = new BigInteger(sub.toString());
                if(b.remainder(BigInteger.valueOf(2019))==BigInteger.ZERO) c++;
            }

        }

    out.println(c);

    } //Solution ENDS Here !!!

    FastScanner in;
    FastWriter out;
    long maxLong = Long.MAX_VALUE  ,  minlong = Long.MIN_VALUE;
    int maxInt = Integer.MAX_VALUE ,  minInt = Integer.MIN_VALUE;
    double PI = 3.141592653589793238462643383279502884197169399;
    int digit(long s){int ans = 0;while(s>0){s/=10;ans++;}return ans;}
    long gcd(long a, long b){return (b==0)?a:gcd(b,a%b);}
    int gcd(int a, int b){return (b==0)?a:gcd(b,a%b);}
    int bit(long n){return (n==0)?0:(1+bit(n&(n-1)));}

    public void run() {
        try {
            in = new FastScanner();
            out = new FastWriter();

            solve();

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    class FastWriter extends PrintWriter {
        FastWriter() throws FileNotFoundException {
            super(System.out);
        }

        void printNext(int i) {
            print(i);
            print(' ');
        }

        void printNext(long i) {
            print(i);
            print(' ');
        }

        void printNext(char ch) {
            print(ch);
            print(' ');
        }


        <T extends Iterable<Integer>> void printIterable(T o) {
            for (Integer t : o) {
                printNext(t);
            }
        }

        void printlnArray(int[] a) {
            for (int i : a) {
                printNext(i);
            }
            println();
        }

        void printlnArray(long[] a) {
            for (long i : a) {
                printNext(i);
            }
            println();
        }


    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;


        boolean ready() throws IOException {
            return (br.ready() || st.hasMoreTokens());
        }

        FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        char nc(){
            return next().charAt(0);
        }

        double nd(){
            return Double.parseDouble(next());
        }

        int ni() {
            return Integer.parseInt(next());
        }

        long nl() {
            return Long.parseLong(next());
        }

    }

    public static void main(String[] arg) {
        new Main().run();
    }
}
