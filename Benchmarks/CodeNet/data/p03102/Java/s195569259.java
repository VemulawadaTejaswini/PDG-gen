import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        int b[] = new int[m];
        int cnt = 0;
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int tmp = 0;
            for (int k = 0; k < m; k++) {
                int tm = sc.nextInt();
                tmp += (tm * b[k]);
            }
            if (tmp + c > 0)
                cnt++;
        }
        System.out.println(cnt);
    }
}
