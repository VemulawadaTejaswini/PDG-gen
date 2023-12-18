import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    final long DEVIDE = 1000000007;


    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n+2];
        for (int i = 1; i <= n+1; i++) {
            int max = i*(2*n-i+1)/2 ;
            int min = i*(i-1)/2;
            arr[i] = max - min + 1;
        }

        int ans = 0;
        for (int i = k; i <= n+1; i++) {
            ans += arr[i];
        }
        System.out.println(ans);
    }
}
