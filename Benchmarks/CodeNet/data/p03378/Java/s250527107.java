import java.math.BigInteger;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int a[] = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        int max = -1;
        for (int i = 0; i < m; i++) {
            if (a[i] < x) {
                max = i;
            } else {
                break;
            }
        }
        System.out.println(Math.min(max + 1, m - (max + 1)));
    }

}