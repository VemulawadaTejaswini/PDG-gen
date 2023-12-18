
import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Integer[] c = new Integer[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[n - 1 - i];
        }

        long ans = 0;
        int l = a[0];
        int r = a[n - 1];
        ans += r - l;
        int aa = 1;
        int cc = 1;
        for (int i = 1; i < n - 1; i++) {

            if (i % 2 == 1) {
                int b = a[aa];
                if (Math.abs(l - b) > Math.abs(r - b)) {
                    ans += Math.abs(l - b);
                    l = b;
                } else {
                    ans += Math.abs(r - b);
                    r = b;
                }
                aa++;
            } else {
                int b = c[cc];
                if (Math.abs(l - b) > Math.abs(r - b)) {
                    ans += Math.abs(l - b);
                    l = b;
                } else {
                    ans += Math.abs(r - b);
                    r = b;
                }
                cc++;
            }
        }
        System.out.println(ans);

    }

}
