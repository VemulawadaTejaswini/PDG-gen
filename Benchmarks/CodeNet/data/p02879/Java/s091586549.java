
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Scannerで値取得。
		 */
		Scanner sint = new Scanner(System.in);

		//値取得
		int numA = sint.nextInt();
		int numB = sint.nextInt();

		sint.close();

		final int KEISANKANOU = 10;

		int keisan = 0;
		if (numA < KEISANKANOU) {
			if (numB < KEISANKANOU) {
				keisan = numA * numB;
			}else {
				keisan = -1;
			}
		}else {
			keisan = -1;
		}
		System.out.println(keisan);

	}

}
