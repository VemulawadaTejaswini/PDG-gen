import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String S = sc.next();
		sc.close();
        S = S.replaceAll("B", "");
       	System.out.println(n/2<S.length()?"Yes":"No");
	}

}
