import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[1000000];

        for (int i = 0; i < M; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            for (int j = L; j <= R; j++) {
                A[j] += 1;
            }
        }

        int count = 0;
        for (int i = 0; i < 1000000; i++) {
            if (A[i] == M) {
                count++;
            }
        }

        System.out.println(count);
    }
}
