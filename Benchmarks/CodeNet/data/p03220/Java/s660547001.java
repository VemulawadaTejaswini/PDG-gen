import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int A = sc.nextInt();
        int H[] = new int[N];

        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }

        int ans = 0;
        int tmp = 100000;
        for (int i = 0; i < N; i++) {
            int at = (int)(T - H[i] * 0.006);
            if (Math.abs(A - at) < tmp) {
                tmp = Math.abs(A - at);
                ans = i + 1;
            }
        }

        System.out.println(ans);
    }
}
