import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int points[] = new int[N];

        for (int i = 0; i < N; i++) {
            points[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int cost = 0;
            int current = 0;

            for (int j = 0; j < N; j++) {
                if (i == j) { continue; }
                cost += Math.abs(points[j] - current);
                current = points[j];
            }

            cost += Math.abs(0 - current);

            System.out.println(cost);
        }

    }
}
