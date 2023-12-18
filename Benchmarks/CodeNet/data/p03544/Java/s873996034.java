import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int N = Integer.parseInt(sc.next());
        long[] ar = new long[N + 1];
        
        out.println(lucasNumber(N, ar));
        
        out.flush();
    }
    
    public static long lucasNumber(int n, long[] memo) {
        memo[0] = 2;
        memo[1] = 1;
        if (memo[n] != 0) return memo[n];
        return memo[n] = lucasNumber(n - 1, memo) + lucasNumber(n - 2, memo);
    }
}