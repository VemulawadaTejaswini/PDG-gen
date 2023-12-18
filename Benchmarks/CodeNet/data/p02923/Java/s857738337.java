import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] H = new int[N];
        long ans = 0;
        long max = 0;
        for (int i=0;i<N;i++) {
            H[i] = sc.nextInt();
            if (i == 0) continue;
            if (H[i] > H[i-1]) {
                ans = max > ans ? max : ans;
                max = 0;
            } else {
                max++;
            }
        }
        ans = max > ans ? max : ans;
        System.out.println(ans);
    }
}
