import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int totalAmount = 0;

	public static void solve() {
		int[] size = { 161, 160, 140, 120, 100, 80, 60 };
		int[] weight = { 26, 25, 20, 15, 10, 5, 2 };
		int[] fee = { 0, 1600, 1400, 1200, 1000, 800, 600 };
		int tempTotalAmount = fee[0];
		int vertical = sc.nextInt();
		int width = sc.nextInt();
		int height = sc.nextInt();
		int packWeight = sc.nextInt();
		int totalSize = vertical + width + height;
		if (totalSize >= size[0] || packWeight >= weight[0]) {
			return;
		}
		for (int i = 1; i < 7; i++) {
			if (totalSize <= size[i] && packWeight <= weight[i]) {
				tempTotalAmount = fee[i];
			}
		}
		totalAmount += tempTotalAmount;
	}

	public static void main(String[] args) {
		while (true) {
			int totalPackage = sc.nextInt();
			if (totalPackage == 0) {
				break;
			}
			int cnt = totalPackage;
			while (cnt > 0) {
				solve();
				cnt -= 1;
			}
			System.out.println(totalAmount);
			totalAmount = 0;
		}
	}

}