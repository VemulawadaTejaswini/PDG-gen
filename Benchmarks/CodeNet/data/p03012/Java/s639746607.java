import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] w = new int[n];

        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }


        int min = Integer.MAX_VALUE;
        for (int t = 0; t < n; t++) {
            int sum1=0, sum2=0;

            for (int i = 0; i < t; i++) {
                sum1 += w[i];
            }
            for (int i = t; i < n; i++) {
                sum2 += w[i];
            }

            min = Math.min(min, (sum1 > sum2) ? sum1 - sum2 : sum2 - sum1);
        }

        System.out.println(min);
    }

}