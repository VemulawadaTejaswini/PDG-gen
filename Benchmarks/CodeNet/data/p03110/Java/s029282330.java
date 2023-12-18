import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] values = new double[N];
        double sum = 0.0;

        for (int i = 0; i < N; i++) {
            values[i] = sc.nextDouble();
            if (sc.next().equals("BTC")) {
                values[i] *= 380000;
            }
        }

        for (int i = 0; i < N; i++) {
            sum += values[i];
        }

        System.out.println(sum);

    }

}



