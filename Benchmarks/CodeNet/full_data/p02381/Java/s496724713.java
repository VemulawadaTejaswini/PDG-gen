import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                int n = sc.nextInt();
                if (n == 0) {
                    break;
                }
                int[] scores = new int[n];
                double sum = 0, sum2 = 0;
                for (int i = 0; i < scores.length; i++) {
                    scores[i] = sc.nextInt();
                    sum += scores[i];
                }
                double average = 0, variance = 0;
                average = sum / n;
                for (int i = 0; i < scores.length; i++) {
                    sum2 += (scores[i] - average) * (scores[i] - average);
                }
                variance = sum2 / n;
                System.out.println(String.format("%.8f", Math.sqrt(variance)));
            }
        }
    }
}
