import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];

        boolean flg = false;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if (a[i] == 0) {
                flg = true;
            }
        }
        if (flg) {
            System.out.println(0);
            return;
        }
        long ans = a[0];
        long temp = a[0];
        long std = 1000000000000000000L;
        for (int i = 1; i < n; i++) {
            ans = ans * a[i];
            temp = std / a[i];

            if (temp < a[i]) {
                System.out.println("-1");
                return;
            }        }

        System.out.println(ans);

    }
}