import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solve2();
	}

	void solve2() {
		Scanner sc = new Scanner(System.in);
		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		sc.close();
		long res = 0;
		for(long num =b; num>=a;num--) {
			res = num^res;
		}
		System.out.println(res);
	}
}