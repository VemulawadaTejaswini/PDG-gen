import java.io.*;
import java.util.*;

public class Main {
    public static PrintWriter out;
    public static FastScanner in;

    private void solve() {
        long n = in.nextLong();
        long s = in.nextLong();

        List<Long> lst = new ArrayList<>();

        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(calC(i,n) == s){
                out.print(i);
                return;
            }
        }

        long a = n-s;
        for(int i=2;i<=(int)Math.sqrt(a);i++){
            if(n%i == 0){
                lst.add((long)i);
                if(i != a/i) lst.add(a/i);
            }
        }
        lst.add(a);

        Collections.sort(lst);
        for(long i:lst){
            if(calC(i+1,n) == s){
                out.print(i+1);
                return;
            }
        }
        out.print(-1);
    }

    private long calC(long b, long n){
        long cnt = 0;
        while (n>0){
            cnt+= n%b;
            n = n/b;
        }
        return cnt;
    }


    private void runIO() {
        in = new FastScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        solve();
        out.close();
    }
    private static class FastScanner {
        BufferedReader bufferedReader;
        StringTokenizer stringTokenizer;

        private FastScanner() {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        }

        private String next() {
            if (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return stringTokenizer.nextToken();
        }

        private int nextInt() {
            return Integer.parseInt(next());
        }

        private long nextLong() {
            return Long.parseLong(next());
        }

        private String nextLine() {
            String ret = "";
            try {
                ret = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return ret;
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}
