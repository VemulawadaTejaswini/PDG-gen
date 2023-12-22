
import java.util.Scanner;

 class Main {
	public void main(String[] args) {
		int ans = 0;
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		int t = Integer.parseInt(sc.next());

		while (n > 0) {
			n -= x;
			ans += t;
		}

		System.out.print(ans);
		sc.close();
	}
}
