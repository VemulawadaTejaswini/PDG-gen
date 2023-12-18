import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main main = new Main();
		main.exec();

	}

	private void exec() {

		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		double ans = 0d;
		double wa = 0d;
		for(int i = 0 ; i < n ; i++) {
			wa += 1d / (double)a[i];
		}
		ans = 1 / wa;
		System.out.println(ans);
		sc.close();

	}

}
