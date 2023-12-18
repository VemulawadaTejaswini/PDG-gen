import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        long w = sc.nextLong();
        long m1 = 0;
        ArrayList<ArrayList<Long>> map = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            map.add(new ArrayList<>());
        }
        m1 = sc.nextLong();
        map.get(0).add(sc.nextLong());
        for(int i = 0; i < n-1; i++){
            long m = sc.nextLong();
            long v = sc.nextLong();
            map.get((int)(m-m1)).add(v);
        }
        long[][] cum = new long[4][n+1];
        for(int i = 0; i < 4; i++){
            Collections.sort(map.get(i),Comparator.reverseOrder());
            for(int j = 0; j < map.get(i).size(); j++){
                cum[i][j+1] = cum[i][j] + map.get(i).get(j);
            }
        }
        long ans = 0;
        int imax = map.get(0).size();
        int jmax = map.get(1).size();
        int kmax = map.get(2).size();
        int lmax = map.get(3).size();
        for(int i = 0; i <= imax; i++){
            for(int j = 0; j <= jmax; j++){
                for(int k = 0; k <= kmax; k++){
                    for(int l = 0; l <= lmax; l++){
                        if(m1*i + (m1+1)*j + (m1+2)*k + (m1+3)*l > w){
                            break;
                        }
                        ans = Math.max(ans,cum[0][i]+cum[1][j]+cum[2][k]+cum[3][l]);  
                    }
                }
            }
        }
        System.out.println(ans);
    }
    
}

class Point{
    long x,y;
    public Point(long x, long y){
        this.x = x;
        this.y = y;
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
