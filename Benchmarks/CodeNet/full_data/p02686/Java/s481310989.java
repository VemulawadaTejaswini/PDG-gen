import java.util.*;
import java.io.*;
 
public class Main {
    static boolean[][] used;
    static int[] ans;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        ArrayList<St> liL = new ArrayList<St>();
        ArrayList<St> liR = new ArrayList<St>();
        int total = 0;
        for(int i = 0 ; i < n; i++){
            int h = 0;
            int b = 0;
            char[] s = sc.next().toCharArray();
            for(char c : s){
                if(c == '('){
                    h++;
                }else{
                    h--;
                    b = Math.min(b,h);
                }
            }
            total += h;
            if(h > 0){
                liL.add(new St(h,b));
            }else{
                liR.add(new St(-h,b-h));
            }
        }
        int now = 0;
        Collections.sort(liL);
        for(St s : liL){
            //System.out.println(s.cnt+" "+s.min+" "+now);
            if(now-s.min < 0){
                System.out.println("No");
                return;
            }
            now += s.cnt;
        }
        now = 0;
        Collections.sort(liR);
        for(St s : liR){
            //System.out.println(s.cnt+" "+s.min+" "+now);
            if(now-s.min < 0){
                System.out.println("No");
                return;
            }
            now += s.cnt;
        }
        if(total == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
class St implements Comparable<St>{
    int cnt,min;
    public St(int cnt, int min){
        this.cnt = cnt;
        this.min = min;
    }
    
    public int compareTo(St s){
        if(this.min > s.min){
            return -1;
        }else if(this.min < s.min){
            return 1;
        }else{
            if(this.cnt > s.cnt){
                return -1;
            }else if(this.cnt < s.cnt){
                return 1;
            }else{
                return 0;
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
