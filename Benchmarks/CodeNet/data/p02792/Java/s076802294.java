import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int p[][]=new int [10][10];
		for(int i=1; i<=n; i++) {
			int t = i%10;
			int s = f(i);
			p[s][t]++;
		}
		long ans = 0;
		for(int i=1; i<=n; i++) {
			int t = i%10;
			int s = f(i);
			ans += p[t][s];
		}
		System.out.println(ans);
		sc.close();
	}

	private int f(int x) {
		int b=0;
		while(x != 0) {
			b=x;
			x/=10;
		}
		return b;
	}
}
