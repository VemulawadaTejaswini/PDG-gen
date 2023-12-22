import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		sc.close();

		// 処理
		if(N >= 30) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}