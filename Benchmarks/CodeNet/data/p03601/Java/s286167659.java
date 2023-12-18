import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int a = sc.nextInt()*100;
        int b = sc.nextInt()*100;
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        HashSet<Integer> w = new HashSet<>();
        HashSet<Integer> s = new HashSet<>();
        for(int i = 1; i <= f; i++){
            if(a*i > f) break;
            for(int j = 0; j <= f; j++){
                if(a*i+b*j > f) break;
                w.add(a*i+b*j);
            }
        }
        int smax = f/100 * e;
        for(int i = 1; i <= smax; i++){
            if(c*i > smax) break;
            for(int j = 0; j <= smax; j++){
                if(c*i+d*j > f) break;
                s.add(c*i+d*j);
            }
        }
        ArrayList<Integer> wl = new ArrayList<>(w);
        ArrayList<Integer> sl = new ArrayList<>(s);
        Collections.sort(wl);
        Collections.sort(sl);
        int answ = wl.get(0);
        int anss = 0;
        for(int ww : wl){
            for(int ss : sl){
                if((ww+ss)*e == ss*(e+100)){
                    System.out.println((ww+ss)+" "+ss);
                    return;
                }else if((ww+ss)*e > ss*(e+100) && (ww+ss)*anss < ss*answ){
                    answ = ww+ss;
                    anss = ss;
                }
            }
        }
        System.out.println(answ + " " + anss);
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
