import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int[] nc = new int[n];
        for(int i = 0; i < n-1; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            nc[a]++;
            nc[b]++;
        }
        ArrayList<Point> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new Point(i,nc[i]));
        }
        Collections.sort(arr);
        int[] ans = new int[n];
        int[] point = sc.nextIntArray(n);
        Arrays.sort(point);
        long total = 0;
        for(int i = 0; i < n; i++){
            ans[arr.get(i).i] = point[i];
            if(i < n-1) total += point[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append(total).append("\n");
        for(int a : ans){
            sb.append(a).append(" ");
        }
        sb.append("\n");
        System.out.print(sb.toString());
    }
}

class Point implements Comparable<Point>{
    int i,e;
    public Point(int i, int e){
        this.i = i;
        this.e = e;
    }
    
    public int compareTo(Point p){
        if(this.e < p.e){
            return -1;
        }else if(this.e > p.e){
            return 1;
        }else if(this.i < p.i){
            return -1;
        }else{
            return 1;
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
