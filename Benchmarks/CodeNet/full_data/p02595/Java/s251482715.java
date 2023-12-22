import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        Long[] X = new Long[N];
        Long[] Y = new Long[N];
        for (int i = 0; i < N; i++) {
            X[i] = sc.nextLong();
            Y[i] = sc.nextLong();
        }

        int count = 0;

        for (int i = 0; i < N; i++) {
            Long p2 = X[i] * X[i];
            Long q2 = Y[i] * Y[i];
            double length = Math.sqrt(p2 + q2);

            if (length <= D){
                count++;
            }
        }

        System.out.println(count);
    }
}
