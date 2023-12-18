import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] P = new int[N];
        for (int i = 0; i < N; i++) P[i] = sc.nextInt();

        int sol = 0;
        for (int i = 0; i < N; i++) {
            if (i + K > N) break;
            int j = 0;
            while (i + K + j < N && P[i + j] <= P[i + j + 1] && P[i + K + j - 1] <= P[i + K + j]) j++;
            sol++;
            i = i + j;
        }

        System.out.println(sol);
    }
}