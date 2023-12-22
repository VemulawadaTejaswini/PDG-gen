import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nedan = {6000,4000,3000,2000};
		int i, s, mai;

		Scanner sc = new Scanner(System.in);
		for ( i = 0; i <= 3; i++) {
			s = sc.nextInt();
			mai = sc.nextInt();
			System.out.println(nedan[s-1] * mai);

		}

		// TODO 自動生成されたメソッド・スタブ

	}

}