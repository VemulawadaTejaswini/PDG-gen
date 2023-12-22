import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp1 = 0;
        int tmp2 = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            tmp1 = tmp2;
            tmp2 = sc.nextInt();
            int x = tmp1 - tmp2;
            if (x > 0) {
                ans += x;
                tmp2 += x;
            }
        }
        System.out.println(ans);
    }
}
