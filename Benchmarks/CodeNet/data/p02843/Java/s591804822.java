import java.util.Scanner;

public class Main {
	static int[] con = new int[6];
	static int[] price = new int[] {100,101,102,103,104,105};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		Main main = new Main();
		if (main.DP(X, 0)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

	public boolean DP(int X,int sum) {
		if (sum > X) {
			return false;
		}
		if (sum == X ) {
			return true;
		}

		for (int i = 0; i < 6; i++) {
			if (con[i] < 1000001) {
				con[i]++;
				if (DP(X, sum + price[i])) {
					return true;
				}
				con[i]--;
			}
		}
		return false;
	}
}