import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[]a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		int cnt = 0;
		int[]b = new int[N + 1];
		for(int i = 0; i < N; i++) {
			if(a[i] > N) {
				cnt++;
			}else {
				b[a[i]]++;
			}
		}
		for(int i = 1; i <= N; i++) {
			if(b[i] >= i) {
				cnt += b[i] - i;
			}else {
				cnt += b[i];
			}
		}
		System.out.println(cnt);
	}
}