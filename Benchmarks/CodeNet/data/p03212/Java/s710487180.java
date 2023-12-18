import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(solve());
	}

	public static int solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			boolean ns = true;
			boolean n3 = false, n5 = false, n7 = false;
			int t = i;
			while (t > 0) {
				if ((t % 10 != 3) && (t % 10 != 5) && (t % 10 != 7)) {
					ns = false;
					break;
				}
				if (t % 10 == 3)
					n3 = true;
				if (t % 10 == 5)
					n5 = true;
				if (t % 10 == 7)
					n7 = true;
				
				t = t / 10;
			}
			if (ns && n3 && n5 && n7)
				sum++;
		}
		
		return sum;
	}
}
