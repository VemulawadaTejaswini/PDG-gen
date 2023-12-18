import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int K = sc.nextInt();
        int[][] wc = new int[h+1][w+1];
        char[][] choco = new char[h][w];
        for(int i = 1; i <= h; i++){
            choco[i-1] = sc.next().toCharArray();
            int j = 1;
            for(char c : choco[i-1]){
                wc[i][j] += wc[i][j-1] + (c - '0');
                j++;
            }
        }
        for(int i = 1; i <= h; i++){
            for(int j = 0; j <= w; j++){
                wc[i][j] += wc[i-1][j];
            }
        }
        /*
        for(int i = 0; i <= h; i++){
            for(int j = 0; j <= w; j++){
                System.out.print(wc[i][j]);
            }
            System.out.println();
        }
        */
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < (1 << h); i++){
            int tmp = 0;
            ArrayList<Integer> divide = new ArrayList<>();
            divide.add(h);
            for(int j = 0; j < (h-1); j++){
                if((i >> j) % 2 == 1){
                    divide.add(h-j-1);
                    tmp++;
                }
            }
            divide.add(0);
            int size = divide.size();
            int[] minus = new int[size];
            for(int j = 1; j <= w; j++){
                boolean div = false;
                for(int k = 0; k < size-1; k++){
                    if(wc[divide.get(k)][j]-wc[divide.get(k+1)][j]-minus[k] > K){
                        tmp++;
                        div = true;
                        break;
                    }
                }
                if(div){
                    for(int k = 0; k < size-1; k++){
                        minus[k] = wc[divide.get(k)][j-1]-wc[divide.get(k+1)][j-1];
                    }
                }
            }
            /*
            System.out.println(divide);
            System.out.println(tmp);
            */
            ans = Math.min(ans,tmp);
        }
        System.out.println(ans);
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
    
    public String[] nextArray(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = next();
        return a;
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
