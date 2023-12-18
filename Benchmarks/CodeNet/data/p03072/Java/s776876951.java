import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] h = new int[n];
		for(int i=0;i<n;i++)h[i] = Integer.parseInt(sc.next());
		sc.close();

		int max = 0;int cnt = 0;
		for(int i=0;i<n;i++) {
			if(h[i]>=max) {
				cnt ++;
				max = h[i];
			}
		}

		System.out.println(cnt);
	}

}