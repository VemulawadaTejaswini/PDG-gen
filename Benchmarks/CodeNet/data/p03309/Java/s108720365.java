import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        long[] B = new long[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
            B[i] = A[i] - (i + 1);
        }
        Arrays.sort(B);
        long mid = B[N / 2];
        long sum = 0;
        for (int i = 0; i < B.length; i++) {
            sum += Math.abs(B[i] - mid);
        }
        System.out.println(sum);
        sc.close();
    }
}