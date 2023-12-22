import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Long[] a = new Long[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextLong();
            if(a[i] == 0) {
                System.out.println(0);
                System.exit(0);
            }
        }
        sc.close();
        java.util.Arrays.sort(a, Collections.reverseOrder());

        long ans = 1;
                   //1000000000000000000
        long limit = 1000000000000000000L;
        boolean isIncludeLimit = false;
        for(int i=0; i<n; i++) {
            ans *= a[i];
            if(a[i] == limit) {
                isIncludeLimit = true;
                ans = a[i];
                continue;
            }
            if(isIncludeLimit && a[i] > 1) {
                System.out.println(-1);
                System.exit(0);
            }
            if(ans > limit) {
                System.out.println(-1);
                System.exit(0);
            }
        }
        System.out.println(ans);
    }
}
