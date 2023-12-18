import java.io.*;
import java.util.*;

public class Main {
    public static PrintWriter out;
    public static FastScanner in;

    int[] a;
    int n;
    private void solve(){
        String s = in.nextLine();
        a= new int[s.length()];
        n = s.length();
        for(int i=0;i<s.length();i++){
            a[i] =s.charAt(i)-'0';
        }
        long ret = 0;
        for(int i=0;i<(1<<n-1);i++){
            int st = 0;
            for(int j=0;j<n-1;j++){
                if((i & (1<<j))!=0){
                    ret+= calculate(st,j);
                    st = j+1;
                }
            }
            ret+=calculate(st,n-1);
            //out.println(ret + " "+i);
        }

        out.print(ret);
    }

    private long calculate(int s, int e){
        //out.println(s+" "+e);
        long v = 0;
        for(int i=s;i<=e;i++){
            v = v*10+a[i];
        }
        return v;
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
