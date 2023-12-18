import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[] chars = new int[26];
        for(int i = 0; i < h; i++){
            char[] s = sc.next().toCharArray();
            for(char c : s){
                int index = c - 'a';
                chars[index]++;
            }
        }
        int g4 = (w/2)*(h/2);
        int g2 = (h*w-(g4*4))/2;
        int g = w%2 == 1 && h%2 == 1 ? 1 : 0;
        //System.out.println(g4 + " " + g2 + " " + g);
        for(int i = 0; i < 26; i++){
            if(g == 0) break;
            if(chars[i] % 2 == 1){
                chars[i]--;
                g--;
            }
        }
        if(g != 0){
            System.out.println("No");
            return;
        }
        for(int i = 0; i < 26; i++){
            if(g2 == 0) break;
            if(chars[i] % 4 == 2){
                chars[i] -= 2;
                g2--;
            }
        }
        if(g2 != 0){
            
            System.out.println("No");
            return;
        }
        for(int i = 0; i < 26; i++){
            if(chars[i] % 4 == 0 && chars[i] >= 4){
                int now = chars[i]/4;
                chars[i] -= 4*now;
                g4 -= now;
            }
        }
        if(g4 != 0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
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
