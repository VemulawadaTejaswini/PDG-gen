import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ここにコードを挿入
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int price;
		if (A >= 13) {
			price = B;
		} else if (6 <= A) {
			price = B / 2;
		} else {
			price = 0;
		}
		System.out.println(price);
	}

}