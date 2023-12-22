import java.io.*;
import java.io.ioexception;
import java.util.*;


@suppresswarnings({"rawtypes", "unchecked"})
class main {
    final static int inf = 1 << 28;
    final static long lnf = 1l << 60;
    final static double eps = 1e-9;
    final static double golden_ratio = (1.0 + math.sqrt(5)) / 2.0;

    static final long mod = 1_000_000_007;

    public static void main(string[] args) throws exception {
        final myscanner sc = new myscanner();
        long k;
        k = sc.nextlong();
        long a;
        a = sc.nextlong();
        long b;
        b = sc.nextlong();
        solve(k, a, b);
    }

    static void solve(long k, long a, long b){
        long p = a; 
        while(p <= b) {
            if(p % k == 0) {
                system.out.println("ok");
                return;
            };
            p++;
        }
        system.out.println("ng");
    }


    static class myscanner {
 
        bufferedreader br;
        stringtokenizer st;
 
        myscanner(filereader filereader) {
            br = new bufferedreader(filereader);
        }
 
        myscanner() {
            br = new bufferedreader(new inputstreamreader(system.in));
        }
 
        string nn() {
            while (st == null || !st.hasmoreelements()) {
                try {
                    st = new stringtokenizer(br.readline());
                } catch (ioexception e) {
                    e.printstacktrace();
                }
            }
            return st.nexttoken();
        }
 
        string next() {
            return nn();
        }

        string nextline() {
            string ans = "";
            try {
                ans = br.readline();
            } catch (ioexception ex) {
                ex.printstacktrace();
            }
            return ans;
        }
 
        char nextchar() {
            return nn().charat(0);
        }
 
        int nextint() {
            return integer.parseint(nn());
        }
 
        long nextlong() {
            return long.parselong(nn());
        }
 
        double nextdouble() {
            return double.parsedouble(nn());
        }
 
        integer[] niarr0(int n) {
            integer[] ar = new integer[n];
            for (int i = 0; i < n; i++) {
                ar[i] = nextint();
            }
            return ar;
        }
 
        integer[] niarr1(int n) {
            integer[] ar = new integer[n + 1];
            for (int i = 1; i <= n; i++) {
                ar[i] = nextint();
            }
            return ar;
        }
 
        long[] nlarr0(int n) {
            long[] ar = new long[n];
            for (int i = 0; i < n; i++) {
                ar[i] = nextlong();
            }
            return ar;
        }
 
        long[] nlarr1(int n) {
            long[] ar = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                ar[i] = nextlong();
            }
            return ar;
        }
    }

}
