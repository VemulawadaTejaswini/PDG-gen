import java.io.*;
import java.util.*;

public class Main {
    public static PrintWriter out;
    public static FastScanner in;

    String s;
    int n;
    private void solve(){
        n = in.nextInt();
        s = in.nextLine();

        String ans = checkExist("SS");
        if(!ans.isEmpty()){
            out.print(ans);
            return;
        }
        //out.print(ans);

        ans = checkExist("SW");
        if(!ans.isEmpty()){
            out.print(ans);
            return;
        }
        //out.print(ans);

        ans = checkExist("WS");
        if(!ans.isEmpty()){
            out.print(ans);
            return;
        }
        //out.print(ans);

        ans = checkExist("WW");
        if(!ans.isEmpty()){
            out.print(ans);
            return;
        }
        //out.print(ans);

        out.print(-1);

    }

    private String checkExist(String c){
        for(int i=1;i<n-1;i++){
            if(c.charAt(i) == 'W'){
                if(s.charAt(i) == 'o'){
                    if(c.charAt(i-1) == 'S') c+='W';
                    else c+='S';
                }else{
                    if(c.charAt(i-1) == 'S') c+='S';
                    else c+='W';
                }
            }else{
                if(s.charAt(i) == 'o'){
                    if(c.charAt(i-1) == 'S') c+='S';
                    else c+='W';
                }else {
                    if (c.charAt(i - 1) == 'S') c += 'W';
                    else c += 'S';
                }
            }
        }

        if(s.charAt(0) == 'o'){
            if(c.charAt(0) == 'S'){
                if(c.charAt(n-1) != c.charAt(1)) return "";
            }
            if(c.charAt(0) == 'W'){
                if(c.charAt(n-1) == c.charAt(1)) return "";
            }
        }else{
            if(c.charAt(0) == 'S'){
                if(c.charAt(n-1) == c.charAt(1)) return "";
            }
            if(c.charAt(0) == 'W'){
                if(c.charAt(n-1) != c.charAt(1)) return "";
            }
        }

        if(s.charAt(n-1) == 'o'){
            if(c.charAt(n-1) == 'S'){
                if(c.charAt(n-2) != c.charAt(0)) return "";
            }
            if(c.charAt(n-1) == 'W'){
                if(c.charAt(n-2) == c.charAt(0)) return "";
            }
        }else{
            if(c.charAt(n-1) == 'S'){
                if(c.charAt(n-2) == c.charAt(0)) return "";
            }
            if(c.charAt(n-1) == 'W'){
                if(c.charAt(n-2) != c.charAt(0)) return "";
            }
        }
        return c;
    }

    private int gcd(int a ,int b){
        if(b==0) return a;
        return gcd(b,a%b);
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
