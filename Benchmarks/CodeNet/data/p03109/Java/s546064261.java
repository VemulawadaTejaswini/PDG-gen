import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		String res = "TBD";
		if(s.substring(5, 7).equals("04")||s.substring(5, 7).equals("03")
				||s.substring(5, 7).equals("02")||s.substring(5, 7).equals("01")) {
			res = "Heisei";
		}
		System.out.println(res);
	}
}

