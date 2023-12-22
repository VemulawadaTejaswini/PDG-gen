import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        StringBuilder sb = new StringBuilder();
        sb.append("Yes").append("\n");
        String[] sl = new String[n];
        for(int i = 0; i < n; i++){
            sl[i] = sc.next();
        }
        for(int i = 0; i < n; i++){
            String s = sl[i];
            if(s.equals("AB")){
                if(a <= 0 && b <= 0){
                    System.out.println("No");
                    return;
                }else if(a <= 0){
                    sb.append("A").append("\n");
                    a++;
                    b--;
                }else if(b <= 0){
                    sb.append("B").append("\n");
                    a--;
                    b++;
                }else{
                    if(i == n-1  || (sl[i+1].equals("AB") && a < b) || !sl[i+1].equals("BC")){
                        sb.append("A").append("\n");
                        a++;
                        b--;
                    }else{
                        sb.append("B").append("\n");
                        a--;
                        b++;
                    }
                }
            }else if(s.equals("BC")){
                if(b <= 0 && c <= 0){
                    System.out.println("No");
                    return;
                }else if(b <= 0){
                    sb.append("B").append("\n");
                    b++;
                    c--;
                }else if(c <= 0){
                    sb.append("C").append("\n");
                    b--;
                    c++;
                }else{
                    if(i == n-1 || (sl[i+1].equals("BC") && a < b) || !sl[i+1].equals("AC")){
                        sb.append("B").append("\n");
                        b++;
                        c--;
                    }else{
                        sb.append("C").append("\n");
                        b--;
                        c++;
                    }
                }
            }else{
                if(c <= 0 && a <= 0){
                    System.out.println("No");
                    return;
                }else if(c <= 0){
                    sb.append("C").append("\n");
                    c++;
                    a--;
                }else if(a <= 0){
                    sb.append("A").append("\n");
                    c--;
                    a++;
                }else{
                    if(i == n-1 || (sl[i+1].equals("AC") && a < b) || !sl[i+1].equals("AB")){
                        sb.append("C").append("\n");
                        c++;
                        a--;
                    }else{
                        sb.append("A").append("\n");
                        c--;
                        a++;
                    }
                }
            }
        }
        System.out.println(sb.toString());
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
