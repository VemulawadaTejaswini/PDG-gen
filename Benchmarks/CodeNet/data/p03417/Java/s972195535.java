import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		long n = Integer.parseInt(sc.next());
		long m = Integer.parseInt(sc.next());
		sc.close();
		long res = 0;

		if(n==2||m==2)res = 0;
		else if(n>2&&m>2)res = n*m-(n*2+m*2-4);
		else if(n==1&&m==1)res = 1;
		else res = n*m-2;

		System.out.println(res);
	}

}
