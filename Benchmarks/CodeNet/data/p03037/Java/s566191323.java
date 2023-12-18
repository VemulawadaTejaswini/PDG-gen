import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] key = new int[N];

        for (int i = 0; i < M; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            for (int j = L - 1; j < R; j++) {
                key[j]++;
            }
        }

        int count = 0;

        for (int i = 0; i < N; i++) {
            if (key[i] == M) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();

    }
}