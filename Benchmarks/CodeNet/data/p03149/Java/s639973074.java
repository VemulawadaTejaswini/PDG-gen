import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);
		int[] n = new int[4];

		for ( int i = 0 ; i < 4 ; i++) {
			n[i] = sc1.nextInt();
		}

		Arrays.sort(n);

		if(n[0] == 1 && n[1] == 4 && n[2] == 7 && n[3] == 9	) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

		sc1.close();

	}

}