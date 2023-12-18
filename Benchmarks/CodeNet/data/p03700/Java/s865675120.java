import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final PrintStream so = System.out;
    static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int N = ni();
        int A = ni();
        int B = ni();
        int[] h = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = ni();
        }
        Arrays.sort(h);
        so.println(solve(h, A, B));
    } 

    public static int solve(int[] h, int A, int B) {
        int[] copy = h.clone();
        int ng = 0;
        int ok = (int) (1E9);
        
        while (Math.abs(ok - ng) > 1) {
            int mid = (ok + ng) / 2;
            
            if (canErase(copy, A, B, mid))
                ok = mid;
            else
                ng = mid;
        }
        return ok;
    }
    
    static boolean canErase(int[] h, int A, int B, int times) {
        int[] copy = h.clone();
        for (int i = 0; i < copy.length; i++) {
            copy[i] -= B * times;
        }
        
        int diff = A - B;
        long count = 0;
        for (int i = 0; i < copy.length; i++) {
            if (copy[i] <= 0)
                continue;
            
            count += (copy[i] + diff - 1) / diff;
        }
        return count <= times;
    }
    
    static int ni() {
        return sc.nextInt();
    }
    
    static long nl() {
        return sc.nextLong();
    }

    static char[] nsToChars() {
        return sc.next().toCharArray();
    }
}
