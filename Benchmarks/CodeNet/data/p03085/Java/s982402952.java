import java.util.Scanner;

public class Main{

	public static void main (String[] args) {

		Main main = new Main();
		main.solve();
	}

	private void solve() {

		Scanner sc = new Scanner (System.in);

		String A = sc.next();

		switch (A) {

		case "A":
			System.out.println("T");
			break;
		case "C":
			System.out.println("G");
			break;
		case "T":
			System.out.println("A");
			break;
		case "G":
			System.out.println("C");
			break;
		}
	}
}