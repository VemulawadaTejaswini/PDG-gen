

import java.util.Scanner;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double[] p = IntStream.range(0, n).map(e -> sc.nextInt()).mapToDouble(e -> (e + 1d) / 2d).toArray();

        double[] kitai = new double[n];
        for (int i = 0; i < k; i++) {
            kitai[0] += p[i];
        }
        for (int i = 1; i < n - k + 1; i++) {
            kitai[i] = kitai[i - 1] + p[i + k - 1] - p[i - 1];
        }

        double max = DoubleStream.of(kitai).max().getAsDouble();

        System.out.println(max);
        sc.close();
    }
}