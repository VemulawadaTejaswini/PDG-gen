import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] X = new int[M];
        for(int i = 0; i < M; i++) {
            X[i] = sc.nextInt();
        }
        Arrays.sort(X);
        int[] Y = new int[M-1];
        for(int i = 0; i < M-1; i++) {
            Y[i] = X[i+1] - X[i];
        }
        Arrays.sort(Y);
        int ans = 0;
        for(int i = 0; i < (M-1)-(N-1); i++) {
            ans += Y[i];
        }
        System.out.println(ans);
    }
}