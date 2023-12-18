import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();

        int ans = 1000;
        boolean flag = false;
        for (int i = 0; i < N; i++) {
            int c = sc.nextInt();
            int t = sc.nextInt();

            if (t <= T) {
                if (c < ans) {
                    ans = c;
                    flag = true;
                }
            }
        }

        if (flag) {
            System.out.println(ans);
        } else {
            System.out.println("TLE");
        }
    }
}
