import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        System.out.println(solve(N, K));
    }

    public static double solve(int N, int K) {
        double sum = 0;

        for (int i=1; i<=N; i++) {
            double prob = (double)1/N;
            if (i>= K) {
                sum += prob;
                continue;
            }

            int count = (int)Math.ceil((Math.log(K) - Math.log(i)) / Math.log(2.0));

            sum += prob * Math.pow(0.5, count);
        }


        return sum;
   }
}