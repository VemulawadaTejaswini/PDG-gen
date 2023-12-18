import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 10000007;
		for(int i = 1 ; i * i <= N ; i++) {
			if(N % i == 0) {
				int j = N / i;
				ans = Math.min(ans, funk(j));
			}
		}
		System.out.println(ans);
	}

	public static int funk(int N) {
		return String.valueOf(N).length();
	}
}
