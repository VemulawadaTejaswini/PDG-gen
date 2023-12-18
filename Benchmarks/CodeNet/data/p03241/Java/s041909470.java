import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	static boolean prime[];
	void doIt() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(getGcd(n, m));
	}

	int getGcd(int n, int m) {
		int num = 1;
		for(int i = m / n; i >= 1; i--) {
			if(m % i == 0) {
				if(m / i >= n) {
					return i;
				}
			}
		}
		return num;
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}
