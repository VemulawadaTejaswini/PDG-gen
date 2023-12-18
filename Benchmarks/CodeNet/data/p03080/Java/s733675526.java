import java.util.Scanner;
public class Main{

	public static void main (String [] args) {

		Main main = new Main ();
		main.solve();
	}

	private void solve() {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String s = scanner.next();

		String [] list = new String [N];
		list=s.split("");

		int countR = 0;
		int countB = 0;

		for (int index=0; index<N; index++) {
		if (list[index].equals("R")) {
			countR++;
		} else {
			countB++;
		}
		}
		if (countR>countB) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}