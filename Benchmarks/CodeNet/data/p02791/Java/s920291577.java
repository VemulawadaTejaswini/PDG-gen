import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] P = new int[N];
            for (int i = 0; i < N; i++) {
                P[i] = sc.nextInt();
            }

            int count = 0;
            int min = (int) 1e9;
            for (int i = 0; i < N; i++) {
                if (P[i] < min) {
                    min = P[i];
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}