import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum1, sum2;
        double m, v, s;
        int[] score;
        while(n != 0) {
            sum1 = 0;
            sum2 = 0;
            score = new int[n];
            for (int j = 0; j < n; j++) {
                score[j] = sc.nextInt();
                sum1 += score[j];
            }
            m = (double) sum1 / n;
            for (int j = 0; j < n; j++) {
                sum2 += score[j] * score[j];
            }
            v = (double) sum2 / n - m * m;
            s = Math.sqrt(v);
            System.out.printf("%f\n", s);
            n = sc.nextInt();
        }
    }
}
