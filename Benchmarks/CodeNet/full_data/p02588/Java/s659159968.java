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
                if(isDecimal(A[i]) && isDecimal(A[j])) continue;
                if(!isDecimal(A[i]) && !isDecimal(A[j])) {
                    count++;
                    continue;
                }

                double x = A[i] * A[j];
                if(!isDecimal(x)) count++;
            }
        }
        System.out.println(count);
    }

    static boolean isDecimal (double x){
        return x != Math.floor(x);
    }
}