import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = Integer.parseInt(sc.next());
        }

        int[] higher = new int[N];
        for (int i = 0; i < N - 1; i++) {
            if (H[i + 1] <= H[i]) {
                higher[i]++;
            }
        }

        int ans = 0;
        int tmp = 0;
        for (int i = 0; i < N; i++) {
            if (higher[i] == 0) {
                ans = Math.max(ans, tmp);
                tmp = 0;
            } else {
                tmp++;
            }
        }
        System.out.println(ans);
    }

}
