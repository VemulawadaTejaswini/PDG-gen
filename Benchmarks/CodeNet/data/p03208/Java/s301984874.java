import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final int N = Integer.parseInt(sc.next());
        final int K = Integer.parseInt(sc.next());
        long[] h = new long[N];
        for (int i = 0; i < N; i++) {
            h[i] = Long.parseLong(sc.next());
        }
        
        Arrays.sort(h); 
        long ans = 1000000000;
        for (int i = 0; i < N - K + 1; i++) {
            long min = h[i];
            long max = h[i + K - 1];
            ans = Math.min(ans, max - min);
        }
        
        out.println(ans);
        
        out.flush();
    }
}