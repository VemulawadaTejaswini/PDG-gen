import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		sc.close();

		//テストケースの総数とACされたテストケースが等しいかどうか
		if(N == M) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}