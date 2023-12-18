import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] a = new String[n];
        String[] b = new String[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.next();
        }
        for (int i = 0; i <= n - m; i++) {
            for (int j = 0; j <= n - m; j++) {
                if (a[i].charAt(j) == b[0].charAt(0)) {
                    boolean flag = true;
                    for (int k = 0; k < m; k++) {
                        if (a[i+k].charAt(j+k) != b[k].charAt(k)) {
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("Yes");
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println("No");
    }

}
