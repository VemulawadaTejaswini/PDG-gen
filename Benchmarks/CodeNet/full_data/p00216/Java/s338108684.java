import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	private void doit() {
		while(true){
			int n = sc.nextInt();
			if(n == -1) break;
			int now = calc(n);
			System.out.println(4280 - now);
		}
	}

	private int calc(int n) {
		int res = 1150;
		if(n <= 10){
			return res;
		}
		if(n <= 20){
			return res + (n - 10) * 125;
		}
		if(n <= 30){
			return res + 1250 + (n - 20) * 140;
		}
		else {
			return res + 1250 + 1400 + (n - 30) * 160;
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}