import java.util.Scanner;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int r = sc.nextInt();
			int d = sc.nextInt();
			int x = sc.nextInt();
			for(int i = 0; i<10;i++) {
				int x1 = r*x - d;
				System.out.println(x1);
				x = x1;
			}
			sc.close();
		}
	public static void main(String[] args) {
		solve();

	}

}
