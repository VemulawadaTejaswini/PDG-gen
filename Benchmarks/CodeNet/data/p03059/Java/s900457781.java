import java.util.Scanner;
public class Main{

	public static void main(String[] args){

		Main main = new Main();
		main.solve();
	}

	private void solve() {

		Scanner sc = new Scanner (System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int T = sc.nextInt();

		int time = T/A;
		System.out.println(time*B);
	}
}