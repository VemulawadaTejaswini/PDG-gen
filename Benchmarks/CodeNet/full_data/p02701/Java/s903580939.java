import java.io.*;
import java.util.*;

//Main class start
public class Main {
    // solution starts here!!!
    public void solve() throws IOException {
        int n = in.ni();
        Set<String> a = new HashSet<>();
        for(int i=0 ; i<n ; i++)
        {
           a.add(in.next());
        }
        out.println(a.size());





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
