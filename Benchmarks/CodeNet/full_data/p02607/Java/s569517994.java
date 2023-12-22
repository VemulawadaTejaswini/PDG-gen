import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            final int a = sc.nextInt();
            if (((i % 2) != 0) && ((a % 2) != 0)) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
