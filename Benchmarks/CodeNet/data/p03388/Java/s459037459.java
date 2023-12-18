
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int q = sc.nextInt();
        
        for (int i = 0; i < q; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long r = (long) Math.sqrt(a * b);
            long r2 = a*b / r;
            long ans = f(a, b, r, r2) + f(a, b, r2, r);
            ans /= 2;
            System.out.println(ans);
        }
    }
    
    static long f(long a, long b, long r, long r2) {
        long ans;
        
        if (r * r2 == a * b) {
            ans = (r-1) * 2;
        } else {
            ans = r + r2 - 1;
        }
        if (a < r) {
            ans--;
        }
        if (b < r2) {
            ans--;
        }
        if ((a == r || b == r) && !(r * r2 == a * b)) {
            ans--;
        }
        return ans;
    }
}
