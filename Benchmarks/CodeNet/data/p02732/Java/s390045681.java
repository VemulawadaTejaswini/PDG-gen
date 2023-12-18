import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] A = new int[N];

        // kosu[3] := 3が全部でいくつあるか
        long[] kosu = new long[N + 1];

        for (int i = 0; i < N; i++) {
            int Ai = sc.nextInt();
            A[i] = Ai;
            kosu[Ai]++;
        }

        long allSum = 0;
        for (int i = 1; i <= N; i++) {
            allSum += kosu[i] * (kosu[i] - 1) / 2;
        }

        for (int i = 0; i < N; i++) {
            long herasu = kosu[A[i]] * (kosu[A[i]] - 1) / 2;
            long tasu = (kosu[A[i]] - 1) * (kosu[A[i]] - 2) / 2;
            System.out.println(allSum - herasu + tasu);
        }

    }

}
