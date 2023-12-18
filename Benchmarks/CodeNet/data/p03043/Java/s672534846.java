import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
        double N = sc.nextDouble();
        int K = sc.nextInt();
        double ans = 0;

        double p = 1;
        int t = 0;

        for (int i = 1; i <= N; i++) {
            t = i;
            p = 1;
            if (t >= K) {
                ans += 1/N;
                continue;
            }
            while (t <= K) {
                t = t * 2;
                p *= 2;
            }
            ans += 1/p * 1/N;
        }

        System.out.println(ans);
        

		sc.close();
	}
}
