import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        if (n < 111) {
            ans = 99;
        } else {
            for (int i = 1; i < 10; i++) {
                int tmp = 111 * i;
                if (tmp > n) {
                    ans = 111 * (i - 1);
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}