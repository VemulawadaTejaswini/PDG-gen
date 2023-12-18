import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int lots[] = new int[N];
		Arrays.sort(lots);
		int ans = 0;
		for(int i = N;i > N - K;i--) {
			ans += lots[i];
		}
		System.out.println(ans);
	}
}
