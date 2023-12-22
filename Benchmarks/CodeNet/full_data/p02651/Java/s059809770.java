import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] ans = new int[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            Long[] a = new Long[n];
            for (int j = 0; j < n; j++) {
                a[j] =  sc.nextLong();
            }
            String s = sc.next();

            long x = 0;
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == '1') {
                    if ((a[j]^x) != 0) x = (a[j]^x);
                } else {
                    if (x != 0) x = (a[j]^x);
                }
            }

            if (x == 0) ans[i] = 0;
            else ans[i] = 1;
        }

        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}
