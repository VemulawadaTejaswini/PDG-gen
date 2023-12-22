import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double D = sc.nextDouble();
        double X[] = new double[N];
        double Y[] = new double[N];
        for (int i = 0; i < N; i++) {
            X[i] = sc.nextDouble();
            Y[i] = sc.nextDouble();
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (Math.sqrt(X[i]*X[i] + Y[i]*Y[i]) <= D) {
                ans++;
            }
        }

        System.out.println(ans);
        
    }
}
