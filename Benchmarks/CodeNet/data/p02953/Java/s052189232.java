import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int N = scan.nextInt();
		long[] h = new long[N];
		for(int i = 0; i < N; i++) {
			h[i] = scan.nextLong();
		}
		scan.close();
		// 末尾から見ていく
		for(int i = N - 2; i >= 0; i--) {
			if(h[i] - h[i + 1] == 1) {
				h[i]--;
			}else if(h[i] - h[i + 1] <= 2 ) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

}
