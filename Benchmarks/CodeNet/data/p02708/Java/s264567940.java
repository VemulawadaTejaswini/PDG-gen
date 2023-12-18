import java.util.Scanner;

public class Main {

	void run() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			long ans = 0;
			long sumAll = (long) (n + 1) * n / 2;
			for (int i=k;i<=n+1;i++) {
				long min = (long) i * (i - 1) / 2;
				int z = n - i;
				long max = sumAll;
				if (z >=0) {
					long zz = (long) (z + 1) * z / 2;
					max = sumAll - zz;
				}

				// System.err.println(z + " " + min + " " + max);
				
				ans += (max - min + 1);
			}

			ans %= 1000000007;
			
			System.out.print(ans);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
