import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] D = new int[N+1];
        int X = sc.nextInt();

        D[0] = 0;

        for (int i = 0; i < N; i++) {
            int Li = sc.nextInt();
            D[i + 1] = D[i] + Li;
        }

        int cnt = 0;

        for (int d : D) {
            if (d <= X)
                cnt++;
        }

        System.out.println(cnt);
    }
}
