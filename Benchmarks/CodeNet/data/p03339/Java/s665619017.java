import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.nextLine();
        String S = sc.nextLine();

        int[] sumWester = new int[N];
        int[] sumEaster = new int[N];

        if (S.charAt(0) == 'W') {
            sumWester[0] += 1;
        }
        for (int i = 1; i < N; i++) {
            sumWester[i] = sumWester[i - 1];
            if (S.charAt(i) == 'W') {
                sumWester[i] += 1;
            }
        }

        if (S.charAt(N - 1) == 'E') {
            sumEaster[N - 1] += 1;
        }
        for (int i = N - 2; i >= 0; i--) {
            sumEaster[i] = sumEaster[i + 1];
            if (S.charAt(i) == 'E') {
                sumEaster[i] += 1;
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int sum = sumWester[i] + sumEaster[i] - 1;
            if (sum < min) {
                min = sum;
            }
        }

        System.out.println(min);

    }
}