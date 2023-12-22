
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// fizzbuzz

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		sc.close();

		for(int i=1; i<=n; i++) {
			// 3または3を含む数字を出力する
			if(i % 3 == 0) {
				System.out.print(" " + i);
			} else if(String.valueOf(i).indexOf("3") >= 0) {
				System.out.print(" " + i);
			}
		}
		System.out.println("");

	}

}

