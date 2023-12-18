import java.util.Scanner;
public class Main {
	public static long stairs(int a) {
		if(a == 0) {
			return 1;
		}
		else if(a == 1) {
			return 1;
		}
		else if(a == 2) {
			return 2;
		}
		else {
			return (stairs(a-1)+stairs(a-2));
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = Integer.parseInt(stdIn.next());
		int M = Integer.parseInt(stdIn.next());
		if(M == 0) {
			System.out.println(stairs(N));
			System.exit(0);
		}
		int[] a = new int[M];
		long ans = 1;
		for(int i = 0; i < M; i++) {
			a[i] = Integer.parseInt(stdIn.next());
			if(i >= 1 && a[i]-a[i-1] == 1) {
				System.out.println(0);
				System.exit(0);
			}
			if(i == 0) {
				ans *= (stairs(a[i]-1)%1000000007);
			}
			else {
				ans *= (stairs(a[i]-a[i-1]-2)%1000000007);
			}
		}
		ans *= (stairs(N-a[M-1]-1)%1000000007);
		System.out.println(ans%1000000007);

	}

}