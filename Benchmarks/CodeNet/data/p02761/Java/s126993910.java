import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        final int M = sc.nextInt();

        final int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = 999;
        }

        for (int i = 0; i < M; i++) {
            int s = sc.nextInt();
            int c = sc.nextInt();
            if (n[s-1] != 999 && n[s-1] != c) {
                System.out.println(-1);
                return;
            }
            n[s-1] = c;
        }

        if (n[0] == 999 || n[0] == 0) {
            System.out.println(-1);
            return;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(n[i] == 999 ? 0 : n[i]);
        }
        System.out.println();
    }
}
