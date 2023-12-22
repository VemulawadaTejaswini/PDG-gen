import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long ans = 1;

        for (int i = 0; i < N; i++) {
            Long tmp = sc.nextLong();
            if (tmp == 0) {
                ans = 0;
                break;
            }
            ans *= tmp;
        }
        sc.close();

        if (ans > (long) Math.pow(10, 18)) {
            ans = -1;
        }
        System.out.println(ans);
    }
}
