import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int A = sc.nextInt();
        double result = -1;
        int resultN = N;
        for (int i = 0; i<N; i++) {
            int h = sc.nextInt();
            double t = Math.abs(A - (T - (h * 0.006)));
            if (t < result || result < 0) {
                result = t;
                resultN = i + 1;
            }
        }

        System.out.println(resultN);
    }

}