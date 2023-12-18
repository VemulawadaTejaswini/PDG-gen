import java.math.BigDecimal;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String[] aStr = sc.nextLine().split(" ");
        String[] bStr = sc.nextLine().split(" ");

        long[] a = new long[n + 1];
        long[] b = new long[n];
        for (int i = 0; i < n + 1; i++) {
            a[i] = Long.parseLong(aStr[i]);
        }

        for (int i = 0; i < n; i++) {
            b[i] = Long.parseLong(bStr[i]);
        }


        long ans = 0;

        for (int i = 0; i < n; i++) {
            if (b[i] > a[i]) {
                ans += a[i];
                b[i] -= a[i];
            } else {
                ans += b[i];
                continue;
            }

            if(b[i] > a[i + 1]){
                ans += a[i + 1];
                a[i + 1] = 0;
            } else {
                ans += b[i];
                a[i + 1] -= b[i];
            }

        }

        System.out.println(ans);
    }


}
