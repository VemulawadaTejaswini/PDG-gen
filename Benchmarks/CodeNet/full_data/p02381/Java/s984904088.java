import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            while (true) {
                int n = input.nextInt();
                if (n == 0) {
                    break;
                }
                int[] scores = new int[n];
                double sum = 0;

                for (int i = 0; i < scores.length; i++) {
                    scores[i] = input.nextInt();
                    sum += scores[i];
                }
                double average = (double) sum / (double) n;
                double a2 = 0.0;
                for (int i = 0; i < scores.length; i++) {
                    a2 += (scores[i] - average) * (scores[i] - average) / n;
                }
                System.out.println(Math.sqrt(a2));
            }
        }
    }
}

