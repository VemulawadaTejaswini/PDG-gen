import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        boolean found = false;
        for (int i = 0; i < Math.pow(2, n); i++) {
            found = true;
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                int b = 1;
                while (j * b <= n) {
                    cnt += i >> (j * b - 1) & 1;
                    b++;
                }
                //System.out.println("i = " + i + " cnt = " + cnt);
                if (cnt % 2 != a[j - 1]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                System.out.println(Integer.bitCount(i));
                for (int ii = 0; ii < n; ii++) {
                    if ((i >> ii & 1) == 1) {
                        System.out.print((ii + 1) + " ");
                    }
                }
                System.out.println();
                break;
            }
        }
        if (!found) {
            System.out.println("-1");
        }
    }
}