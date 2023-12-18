import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int[] a = sc.nextIntArray(n);
        int max = 0;
        int maxi = 1;
        int min = 0;
        int mini = 1;
        for(int i = 0; i < n; i++){
            if(a[i] < 0){
                if(min < Math.abs(a[i])){
                    min = Math.abs(a[i]);
                    mini = i+1;
                }
            }else{
                if(max < a[i]){
                    max = a[i];
                    maxi = i+1;
                }
            }
        }
        if(max >= min){
            int cnt = n;
            for(int i = 0; i < n; i++){
                if(maxi == i+1){
                    continue;
                }
                a[i] += max;
                sb.append(maxi).append(" ").append(i+1).append("\n");
            }
            a[maxi-1] += max;
            sb.append(maxi).append(" ").append(maxi).append("\n");
            for(int i = 0; i < n-1; i++){
                if(a[i] > a[i+1]){
                    cnt++;
                    a[i+1] += a[i];
                    sb.append(i+1).append(" ").append(i+2).append("\n");
                }
            }
            pw.println(cnt);
            pw.print(sb.toString());
            /*
            sb.setLength(0);
            for(int v : a){
                sb.append(v + " ");
            }
            pw.println(sb.toString());
            */
        }else{
            int cnt = n;
            for(int i = 0; i < n; i++){
                if(mini == i+1){
                    continue;
                }
                a[i] -= min;
                sb.append(mini).append(" ").append(i+1).append("\n");
            }
            a[mini-1] -= min;
            sb.append(mini).append(" ").append(mini).append("\n");
            for(int i = 0; i < n-1; i++){
                if(a[i] > a[i+1]){
                    cnt++;
                    a[i+1] += a[i];
                    sb.append(i+1).append(" ").append(i+2).append("\n");
                }
            }
            pw.println(cnt);
            pw.print(sb.toString());
            /*
            sb.setLength(0);
            for(int v : a){
                sb.append(v + " ");
            }
            pw.println(sb.toString());
            */
        }
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

class Point{
    int now,cnt;
    public Point(int n, int c){
        this.now = n;
        this.cnt = c;
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
