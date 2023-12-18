import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		sc.close();

		int coin = 0;
		for(int i=0;i<2;i++) {
			if(a>b) { coin +=a ;a--;}
			else {coin += b;b--; }
		}
		System.out.println(coin);

	}

}