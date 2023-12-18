import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC157C - Guess The Number

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] s = new int[m];
        int[] c = new int[m];

        for (int i = 0; i < m; i++) {
            s[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = 10;
            for (int j = 0; j < m; j++) {
                if (s[j] == i + 1) {
                    if (i == 0) {   // 1桁目
                        if (n == 1) {   // 1桁のとき
                            if (ans[i] > c[j]) {
                                ans[i] = c[j];
                            }
                        } else {    // 2桁以上のとき
                            if (ans[i] > c[j]) {
                                if (c[j] > 0) {
                                    ans[i] = c[j];
                                }
                            }
                        }
                    } else { //1桁目でない
                        if (c[j] < ans[i]) {
                            ans[i] = c[j];
                        }
                    }
                }
            }
        }

        String a = "";
        if (n == 1 || (n > 1 && ans[0] > 0 && ans[0] < 10)) {
            for (int i = 0; i < n; i++) {
                if (ans[i] >= 0 && ans[i] < 10) {
                    a += ans[i];
                } else {
                    a += "0";
                }
            }
        } else {
            a = "-1";
        }

        System.out.println(a);
    }
}