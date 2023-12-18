import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
        }
        int[] Y = new int[N];
        System.arraycopy(X,0,Y,0,N);
        Arrays.sort(Y);

        for (int i = 0; i < N; i++) {
            if (X[i] <= Y[(N / 2) - 1]) {
                System.out.println(Y[(N/2) ]);
            }else{
                System.out.println(Y[(N/2) - 1]);
            }
        }
    }
}
