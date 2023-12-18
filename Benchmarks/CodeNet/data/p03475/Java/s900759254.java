
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        int[] C = new int[N];
        int[] S = new int[N];
        int[] F = new int[N];

        for (int i = 0; i < N - 1; i++) {
            C[i] = sc.nextInt();
            S[i] = sc.nextInt();
            F[i] = sc.nextInt();
        }
        for (int i = 0; i < N - 1; i++) {
            int sum = 0;
            sum += S[i];
            for (int j = i; j < N -1 ; j++) {
                if (sum < S[j]) sum = S[j];
                if (sum == S[j]) {
                    sum += C[j];

                } else {
                    int sum1 = S[j];
                    while (sum > sum1) {
                        sum1 += F[j];
                    }
                    sum = sum1;
                    sum += C[j];
                }
            }
            System.out.println(sum);

        }
        System.out.println("0");

    }


}