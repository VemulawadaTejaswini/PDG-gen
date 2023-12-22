import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        double[] A = new double[N];
        for (int i = 0; i < N; i++) {
            A[i] = s.nextDouble();
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                double x = A[i] * A[j];
                if(x == Math.floor(x)) count++;
            }
        }
        System.out.println(count);
    }
}