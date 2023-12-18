import java.util.Scanner;

public class Main {

    private static Scanner sc;

    public Main() {
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();
    }

    private void solve() {
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans += Math.min(arr[i] * 2, (K - arr[i]) * 2);
        }
        
        System.out.println(ans);
    }

}