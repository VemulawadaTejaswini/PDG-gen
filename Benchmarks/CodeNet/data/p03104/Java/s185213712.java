import java.util.Scanner;

public class Main{

	public static void main (String[] args) {

		Main main = new Main();
		main.solve();
	}

	private void solve() {

		Scanner sc = new Scanner (System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();

		long kekka=A;
		for (long number=A+1; number<=B; number++) {
			kekka=kekka^number;
		}

		System.out.println(kekka);
	}
}