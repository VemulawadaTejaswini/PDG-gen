import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();

		long max = Long.MIN_VALUE;
		int ans = -1;
		for(int x=1; x<=n; x++) {
			long tmp = (a*x/b) - a*(x/b);
			if(tmp>max) {
				max = tmp;
				ans = x;
			}
		}
		System.out.println(max);
		sc.close();
	}


}