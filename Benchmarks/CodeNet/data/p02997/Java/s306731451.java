import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int nMinus1C2 = 1;
        for (int i = n - 1; i >= n - 2; i--) {
            nMinus1C2 *= i;
        }
        nMinus1C2 /= 2;
        if (k > nMinus1C2) {
            System.out.println(-1);
            return;
        }
        
        int m = (n - 1) + (nMinus1C2 - k);
        System.out.println(m);
        for (int i = 1; i < n; i++) {
            System.out.println("1 " + (i + 1));
        }
        int l = nMinus1C2 - k;
        int p = 2;
        int q = 3;
        while (l-- > 0) {
            System.out.println(p + " " + q);
            q++;
            if (q > n) {
                p++;
                q = p + 1;
            }
        }
    }
}