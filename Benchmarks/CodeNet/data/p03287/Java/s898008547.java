import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long M = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        long count = 0;
        for (int l = 0; l < N; l++) {
            for (int r = l; r < N; r++) {
                long sumCandy = 0;
                for (int i = l; i <= r; i++) {
                    sumCandy += A[i];
                }
                if (sumCandy % M == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}