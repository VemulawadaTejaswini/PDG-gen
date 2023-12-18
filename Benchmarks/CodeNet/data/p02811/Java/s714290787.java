import java.util.Scanner;

//AtCoder Beginner Contest 150
//A - 500 Yen Coins
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long K = Long.parseLong(sc.next());
		long X = Long.parseLong(sc.next());
		sc.close();

		if (K * 500 >= X) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
