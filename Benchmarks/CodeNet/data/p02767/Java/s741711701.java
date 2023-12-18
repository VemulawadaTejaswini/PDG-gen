import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int x[] = new int[N];
            for (int i = 0; i < N; i++) {
                x[i] = sc.nextInt();
            }

            long result = 0;

            int P = 0;
            for (int i = 0; i < x.length; i++) {
                P += x[i];
            }

            P = Math.round((float) P / x.length);

            for (int i = 0; i < x.length; i++) {
                result += Math.pow(x[i] - P, 2);
            }

            System.out.println(result);

        }
    }

}