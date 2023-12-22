import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        ArrayList<PointX> arrX = new ArrayList<>();
        ArrayList<PointY> arrY = new ArrayList<>();
        for(int i = 0; i < n; i++){
            long x = sc.nextLong();
            long y = sc.nextLong();
            arrX.add(new PointX(x,y));
            arrY.add(new PointY(x,y));
        }
        Collections.sort(arrX);
        Collections.sort(arrY);
        long ans = 0;
        PointX px = arrX.get(0);
        for(int i = 1; i < n; i++){
            PointX pi = arrX.get(i);
            ans = Math.max(ans,Math.abs(px.x-pi.x)+Math.abs(px.y-pi.y));
        }
        PointY py = arrY.get(0);
        for(int i = 1; i < n; i++){
            PointX pi = arrX.get(i);
            ans = Math.max(ans,Math.abs(py.x-pi.x)+Math.abs(py.y-pi.y));
        }
        pw.println(ans);
        pw.flush();
    }

    static class GeekInteger {
        public static void save_sort(int[] array) {
            shuffle(array);
            Arrays.sort(array);
        }
 
        public static int[] shuffle(int[] array) {
            int n = array.length;
            Random random = new Random();
            for (int i = 0, j; i < n; i++) {
                j = i + random.nextInt(n - i);
                int randomElement = array[j];
                array[j] = array[i];
                array[i] = randomElement;
            }
            return array;
        }
 
    }
}

class PointX implements Comparable<PointX>{
    long x,y;
    public PointX(long x, long y){
        this.x = x;
        this.y = y;
    }
    
    public int compareTo(PointX p){
        if(this.x < p.x){
            return -1;
        }else if(this.x > p.x){
            return 1;
        }else{
            if(this.y < p.y){
                return -1;
            }else if(this.y > p.y){
                return 1;
            }else{
                return 0;
            }
        }
    }
}

class PointY implements Comparable<PointY>{
    long x,y;
    public PointY(long x, long y){
        this.x = x;
        this.y = y;
    }
    
    public int compareTo(PointY p){
        if(this.y < p.y){
            return -1;
        }else if(this.y > p.y){
            return 1;
        }else{
            if(this.x < p.x){
                return -1;
            }else if(this.x > p.x){
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
