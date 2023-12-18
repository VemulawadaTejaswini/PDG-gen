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

        double tmp =0;
        for (int i = 0; i < K; i++) {
            tmp += expe(p[i]);
        }
        calc[0] = tmp;

        for (int i = 1; i < calc.length; i++) {
            calc[i] = calc[i-1] + expe(p[i+K-1]) - expe(p[i-1]);
        }

        Arrays.sort(calc);
        System.out.println(calc[calc.length-1]);
    }

    static double expe(double n){
        return (n+1)/2;
    }
}
