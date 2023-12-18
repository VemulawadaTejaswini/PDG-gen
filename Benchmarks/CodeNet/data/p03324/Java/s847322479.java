import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		int d = Integer.parseInt(sc.next());
		int n = Integer.parseInt(sc.next());
		sc.close();

		long res = 0;
		if(d==0) {
			res = n;
		}else if(d==1) {
			res = 100*n;
		}else if(d==2) {
			res =  100*100*n;
		}
		System.out.println(res);
	}
}

