import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        int W = sc.nextInt();
        //        int[] X = new int[N];
        //        for (int i = 0; i < N; i++) {
        //            X[i] = sc.nextInt();
        //        }
        System.out.println((N - H + 1) * (N - W + 1));
        sc.close();
    }
}