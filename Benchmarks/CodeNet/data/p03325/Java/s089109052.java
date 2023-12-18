import java.util.stream.IntStream;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int N = Integer.parseInt(sc.next());
        int[] a = IntStream.range(0, N).map(i -> Integer.parseInt(sc.next())).toArray();
        int ans = 0;
        boolean firstEven = true;
        
        while (!isAllOdd(a)) {
            ans++;
            for (int i = 0; i < N; i++) {
                if (a[i] % 2 == 0 && firstEven) {
                    a[i] /= 2;
                    firstEven = false;
                } else {
                    a[i] *= 3;
                }
            }
            firstEven = true;
        }
        
        out.println(ans);
        
        out.flush();
    }
    
    public static boolean isAllOdd(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}