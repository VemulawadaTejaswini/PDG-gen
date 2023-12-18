import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    public boolean alll(String s){
        for ( int i = 1 ; i < s.length() ; i++ ){
            if(s.charAt(i) != s.charAt(0)){
                return false;
            }
        }
        return true ;
    }

    void solve() {
        String s = in.next();
        int d = in.nextInt();
        long ans = 0l ;
        if( s.length() == 1 || alll(s)){
            ans = s.length()*d;
            if(ans==3){
                out.println(1);
            }else{
                out.println(ans/2);
            }
            return;
        }
        if(s.charAt(0) == s.charAt(s.length()-1)){
            long temp = 1l;
            int i = 0 , k = s.length()-1;
            while( s.charAt(i) == s.charAt(k) && s.charAt(0) == s.charAt(i) && i < k ){
                i++;k--;
            }
            for(int j = i+1 ; j< k ; j++ ){
                if(s.charAt(j) == s.charAt(j-1)){
                    temp++;
                }else{
                    if(temp==3){
                        ans++;
                    }else{
                        ans += temp /2;
                    }
                    temp = 1l;
                }
            }
            if(temp==3){
                ans++;
            }else{
                ans += temp /2;
            }
            ans *= d;
            temp = s.length()-1+i-k;
            if(temp==3){
                ans++;
            }else{
                ans += temp /2;
            }
            temp = i ;
            if(temp==3){
                ans++;
            }else{
                ans += temp /2;
            }
            temp = s.length()-1-k;
            if(temp==3){
                ans++;
            }else{
                ans += temp /2;
            }
        }else{
            long temp = 1l;
            for(int j = 1 ; j< s.length() ; j++ ){
                if(s.charAt(j) == s.charAt(j-1)){
                    temp++;
                }else{
                    if(temp==3){
                        ans++;
                    }else{
                        ans += temp /2;
                    }
                    temp = 1l;
                }
            }
            if(temp==3){
                ans++;
            }else{
                ans += temp /2;
            }
            ans *= d;
        }
        out.println(ans);
    }

    void run() {
        try {
            in = new FastScanner(new File("test.in"));
            out = new PrintWriter(new File("test2.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
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
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}