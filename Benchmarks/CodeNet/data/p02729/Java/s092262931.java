import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int even = sc.nextInt();  //偶数の個数
		int odd = sc.nextInt();  //奇数の個数

		System.out.print(even / 2 + odd / 2);

	}
}