import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
                while (true) {
                    int n = sc.nextInt();
                    if (n == 0) { break; }
                    int[] scores = new int[n];
                    for (int i = 0; i < scores.length; i++) {
                        scores[i] = sc.nextInt();
                    }
                    double average = 0.0, variance = 0.0;

                    double sum = 0.0;
                    n = scores.length;

                    for(int j = 0; j < n;j++){
                        sum += (double)scores[j];
                    }
                    average =  sum/n;

                   double sum1 = 0.0;
                    for(int k = 0; k < n;k++){
                        sum1 += (double)((scores[k] - average)*(scores[k] - average));
                    }
                    variance = sum1/ n;
                    System.out.println(Math.sqrt(variance));
                }
            }
    }
}
