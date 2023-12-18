import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        int d1 = d%10;
        int d10 = d/10;
        int ans = 0;
        for (int i = 4; i <= m; i++) {
            OUTER:for (int j = 2; j <= d10; j++) {
                for (int k = 2; k <= 9; k++) {
                    if(j == d10 && d1 < k) break OUTER;
                    if(i == j * k) ans++;
                }
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
