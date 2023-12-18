import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int tw = 0;
        int fo = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 4 == 0) {
                fo++;
            } else if (a[i] % 2 == 0) {
                tw++;
            }
        }
        int ki = n - tw - fo;
        boolean ans = false;
        if (fo == n / 2) {
            ans = true;
        } else if (fo >= ki) {
            ans = true;
        }
        if (ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
