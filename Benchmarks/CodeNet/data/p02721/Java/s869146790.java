import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int c = sc.nextInt();
        char[] s = sc.next().toCharArray();
        ArrayList<Integer> work = new ArrayList<Integer>();
        int works = 0;
        for(int i = 0; i < n; i++){
            if(s[i] == 'o'){
                works++;
                work.add(i+1);
                if(works == k){
                    break;
                }else{
                    i += c;
                }
            }
        }
        //System.out.println(work);
        if(works != k) return;
        TreeSet<Integer> ans = new TreeSet<Integer>();
        for(int i = n-1; i >= 0; i--){
            if(s[i] == 'o'){
                int chk = work.indexOf(i+1);
                if(chk == works-1){
                    ans.add(i+1);
                }
                works--;
                if(works == 0){
                    break;
                }else{
                    i -= c;
                }
            }
        }
        for(int d : ans){
            System.out.println(d);
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
    
    public double[] nextDoubleArray(int n) {
        double[] a = new double[n];
        for (int i = 0; i < n; i++)
            a[i] = nextDouble();
        return a;
    } 
}
