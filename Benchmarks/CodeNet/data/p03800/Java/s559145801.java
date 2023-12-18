import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        char[] ans = new char[n];
        ans[0] = s[0] == 'o' ? 'S' : 'W';
        boolean nowS = s[0] == 'o' ? true : false;
        for(int i = 1; i < n; i++){
            if(nowS && s[i] == 'o'){
                ans[i] = 'S';
                if(ans[i-1] != 'S'){
                    nowS = false;
                }
            }else if(nowS && s[i] == 'x'){
                ans[i] = 'S';
                if(ans[i-1] == 'S'){
                    nowS = false;
                }
            }else if(!nowS && s[i] == 'o'){
                ans[i] = 'W';
                if(ans[i-1] == 'W'){
                    nowS = true;
                }
            }else{
                ans[i] = 'W';
                if(ans[i-1] != 'W'){
                    nowS = true;
                }
            }
        }
        //System.out.println(new String(ans));
        if(ans[1] == ans[n-1]
        && 
        ((ans[n-1] == 'S' && s[n-1] == 'o') || (ans[n-1] == 'W' && s[n-1] == 'x')) && ans[0] == ans[n-2]
        || ((ans[n-1] == 'W' && s[n-1] == 'o') || (ans[n-1] == 'S' && s[n-1] == 'x')) && ans[0] != ans[n-2]){
            System.out.println(new String(ans));
        }else{
            ans[0] = s[0] == 'o' ? 'W' : 'S';
            nowS = s[0] == 'o' ? false : true;
            for(int i = 1; i < n; i++){
                if(nowS && s[i] == 'o'){
                    ans[i] = 'S';
                    if(ans[i-1] != 'S'){
                        nowS = false;
                    }
                }else if(nowS && s[i] == 'x'){
                    ans[i] = 'S';
                    if(ans[i-1] == 'S'){
                        nowS = false;
                    }
                }else if(!nowS && s[i] == 'o'){
                    ans[i] = 'W';
                    if(ans[i-1] == 'W'){
                        nowS = true;
                    }
                }else{
                    ans[i] = 'W';
                    if(ans[i-1] != 'W'){
                        nowS = true;
                    }
                }
            }
            if(ans[1] != ans[n-1]
            && 
            ((ans[n-1] == 'S' && s[n-1] == 'o') || (ans[n-1] == 'W' && s[n-1] == 'x')) && ans[0] == ans[n-2]
            || ((ans[n-1] == 'W' && s[n-1] == 'o') || (ans[n-1] == 'S' && s[n-1] == 'x')) && ans[0] != ans[n-2]){
                System.out.println(new String(ans));
            }else{
                System.out.println(-1);
            }
        }
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