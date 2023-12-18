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

		if(n == 100) n++;
		if(d==0)System.out.println(n);
		else if(d==1)System.out.println(100*n);
		else if(d==2)System.out.println(10000*n);
	}
}

