import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		sB();
	}

	void sB() {
		int N = sc.nextInt();
		int jpy = 0;
		double btc = 0.0;
		for(int i = 0; i < N; i++) {
			String xs = sc.next();
			if(sc.next().equals("JPY")) {
				jpy += Integer.parseInt(xs);
			}
			else btc += Double.parseDouble(xs);
		}
		double ans = jpy + btc * 380000;
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
