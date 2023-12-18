import java.util.*;
import java.io.*;
 
public class Main {
    static boolean[][] used;
    static int[] ans;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        boolean isLeftOnly = false;
        boolean isRightOnly = false;
        boolean isBoth = false;
        int lc = 0;
        int rc = 0;
        for(int i = 0 ; i < n; i++){
            char[] s = sc.next().toCharArray();
            int cnt = 0;
            int cntl = 0;
            boolean left = false;
            boolean right = false;
            for(char c : s){
                if(c == ')'){
                    cnt--;
                    if(cnt < 0){
                        cntl = Math.min(cntl,cnt);
                        left = true;
                    }
                }else{
                    cnt++;
                }
            }
            StringBuilder sb = new StringBuilder(new String(s));
            s = sb.reverse().toString().toCharArray();
            cnt = 0;
            int cntr = 0;
            for(char c : s){
                if(c == '('){
                    cnt--;
                    if(cnt < 0){
                        cntr = Math.min(cntr,cnt);
                        right = true;
                    }
                }else{
                    cnt++;
                }
            }
            if(left && right){
                //System.out.println("type1");
                isBoth = true;
            }else if(left){
                //System.out.println("type2");
                isLeftOnly = true;
            }else if(right){
                //System.out.println("type3");
                isRightOnly = true;
            }
            //System.out.println((0-cntl)+" "+(0-cntr));
            lc += (0-cntl);
            rc += 0-cntr;
        }
        if((isLeftOnly && isRightOnly) || ((!isLeftOnly) && (!isRightOnly) && (!isBoth))){
            if(lc == rc){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("No");
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
