import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[101];
        for (int i = 2 ; i <= n; i++) {
            int d = i;
            for (int j = 2 ; j <= i ; j++) {
                if (d == 1) {
                    break;
                }
                while (d > 1) {
                    if (d % j == 0) {
                        a[j]++;
                        d /= j;
                    } else {
                        break;
                    }
                }
            }
        }

        int over2 = 0;
        for (int i = 0 ; i < 101; i++) {
            if (a[i] >=  2) {
                over2++;
            }
        }
        int over4 = 0;
        for (int i = 0 ; i < 101; i++) {
            if (a[i] >=  4) {
                over4++;
            }
        }
        int over14 = 0;
        for (int i = 0 ; i < 101; i++) {
            if (a[i] >=  14) {
                over14++;
            }
        }
        int over24 = 0;
        for (int i = 0 ; i < 101; i++) {
            if (a[i] >=  24) {
                over24++;
            }
        }
        int over74 = 0;
        for (int i = 0 ; i < 101; i++) {
            if (a[i] >=  74) {
                over74++;
            }
        }
        int ans = 0;
        //3*5*5
        ans += over4 * (over4 - 1)/ 2 * (over2 - 2);
         //5*15
        ans += over14 * (over4 - 1);
        //3*25
        ans += over24 * (over2 - 1);
        //75
        ans += over74;

        System.out.println(ans);


    }

}