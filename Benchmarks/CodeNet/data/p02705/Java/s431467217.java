import java.util.Scanner;
 
class Main {
	int r;
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}
 
	Main(Scanner sc) {
		r = sc.nextInt();
	}
 
	void solve() {
		System.out.println(2*Math.PI*r);
	}
}