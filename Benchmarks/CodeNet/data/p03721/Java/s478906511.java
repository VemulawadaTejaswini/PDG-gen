import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[]k = new long[100001];
		int N = sc.nextInt();
		long K = sc.nextLong();
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			k[a] += b;
		}
		sc.close();
		long cnt = 0;
		for(int i = 1; i <= N; i++) {
			cnt += k[i];
			if(cnt >= K) {
				System.out.println(i);
				System.exit(0);
			}
		}
	}
}