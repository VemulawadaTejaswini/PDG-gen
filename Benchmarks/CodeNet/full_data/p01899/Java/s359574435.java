import java.util.Scanner;

public class Main {
	Scanner cin;
	int N,d;
	public void solve() {
		cin = new Scanner(System.in);
		N = cin.nextInt();
		d = cin.nextInt();
		int sum = 0;
		for(int i = 0;i < N;i++){
			int p = cin.nextInt() - d;
			sum += Math.max(0, p);
		}
		System.out.println(sum == 0 ? "kusoge" : sum);
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}