import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int sum = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			int price = Integer.parseInt(sc.next());
			sum += price;
			if (max < price) {
				max = price;
			}
		}
		int ans = sum - (max / 2);
		System.out.println(ans);
		sc.close();
	}
}