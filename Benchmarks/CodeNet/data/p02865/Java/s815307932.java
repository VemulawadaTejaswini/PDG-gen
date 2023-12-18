import java.util.Scanner;

//第二回全国統一プログラミング王決定戦予選
//A	Sum of Two Integers
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();

		if (N <= 2) {
			System.out.println(0);
		}

		long ans = (N / 2);
		if (N % 2 == 0) {
			ans--;
		}
		System.out.println(ans);
	}
}
