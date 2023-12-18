import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        char[] ans = new char[n];
        for(int i = 0; i < 4; i++){
            ans[0] = i / 2 <= 0 ? 'S' : 'W';
            ans[1] = i % 2 == 0 ? 'S' : 'W';
            String tmp = getAns(n,s,ans);
            if(!tmp.isEmpty()){
                System.out.println(tmp);
                return;
            }
        }
        System.out.println(-1);
    }
    
    public static String getAns(int n, char[] s, char[] ans){
        for(int i = 2; i < n; i++){
            if(ans[i-2] == 'S' && ans[i-1] == 'S'){
                if(s[i-1] == 'o'){
                    ans[i] = 'S';
                }else{
                    ans[i] = 'W';
                }
            }else if(ans[i-2] == 'S' && ans[i-1] == 'W'){
                if(s[i-1] != 'o'){
                    ans[i] = 'S';
                }else{
                    ans[i] = 'W';
                }
            }else if(ans[i-2] == 'W' && ans[i-1] == 'S'){
                if(s[i-1] != 'o'){
                    ans[i] = 'S';
                }else{
                    ans[i] = 'W';
                }
            }else{
                if(s[i-1] == 'o'){
                    ans[i] = 'S';
                }else{
                    ans[i] = 'W';
                }
            }
        }
        if(ans[0] == 'S'){
            if(s[0] == 'o'){
                if(ans[n-1] != ans[1]){
                    return "";
                }
            }else{
                if(ans[n-1] == ans[1]){
                    return "";
                }
            }
        }else{
            if(s[0] == 'o'){
                if(ans[n-1] == ans[1]){
                    return "";
                }
            }else{
                if(ans[n-1] != ans[1]){
                    return "";
                }
            }
        }
        
        if(ans[n-1] == 'S'){
            if(s[n-1] == 'o'){
                if(ans[0] != ans[n-2]){
                    return "";
                }
            }else{
                if(ans[0] == ans[n-2]){
                    return "";
                }
            }
        }else{
            if(s[n-1] == 'o'){
                if(ans[0] == ans[n-2]){
                    return "";
                }
            }else{
                if(ans[0] != ans[n-2]){
                    return "";
                }
            }
        }
        return new String(ans);
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }
    
    public void close() throws Exception{
        this.reader.close();
        return;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    } 
}