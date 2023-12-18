import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			b[i] = sc.nextInt();
		}
		sc.close();
		long A = 0;
		long B = 0;
		long cnt = 0;
		for(int i = 0; i < N; i++) {
			A += a[i];
			B += b[i];
			if(a[i] >= b[i]) {
				cnt += (a[i] - b[i]);
			}else {
				int t = b[i] - a[i];
				if(t % 2 == 0) {
					cnt += t / 2;
				}else {
					cnt += t / 2 + 1;
				}
			}
		}
		if(cnt <= B - A) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}