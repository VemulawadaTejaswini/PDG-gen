import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] D = new int[N];
        for (int i = 0; i < N; i++)
            D[i] = sc.nextInt();
        int[] count = new int[N];
        int ans = 1;

        if (D[0] != 0) {
            System.out.println(0);
            return;
        }

        for (int i = 0; i < N; i++)
            count[D[i]]++;

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < count[i]; j++) {
                ans *= i;
            }
        }

        System.out.println(ans % 998244353);

    }
}