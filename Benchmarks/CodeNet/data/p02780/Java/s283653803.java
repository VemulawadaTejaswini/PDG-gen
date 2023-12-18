import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        double[] p = new double[N];
        for (int i = 0; i < N; i++) {
            p[i] = sc.nextDouble();
        }

        double[] calc = new double[N-(K-1)];

        for (int i = 0; i <= N-K; i++) {
            double tmp = 0;
            for (int j = i; j < i + K; j++) {
                tmp += expe(p[j]);
            }
            calc[i] = tmp;
        }

        System.out.println(Arrays.toString(calc));
        Arrays.sort(calc);
        System.out.println(calc[calc.length-1]);
    }

    static double expe(double n){
        return (n+1)/2;
    }
}
