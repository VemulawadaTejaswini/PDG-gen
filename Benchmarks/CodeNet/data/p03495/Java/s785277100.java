import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        Integer[] A = new Integer[200001];
        Arrays.fill(A, 0);
        for (int i = 0; i < N; i++) {
            A[sc.nextInt()]++;
        }
        Arrays.sort(A, Collections.reverseOrder());

        int sum = 0;

        for (int i = K; i < 200000; i++) {
            sum += A[i];
        }

        System.out.printf("%d\n", sum);
        sc.close();
    }
}