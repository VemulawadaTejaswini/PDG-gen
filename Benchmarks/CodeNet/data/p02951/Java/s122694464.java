import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int z = 0;
		
		if (a-b >= c ) {
			z = 0;
			System.out.println(z);
		} else {
			z = c - (a-b);
			System.out.println(z);
		}
		
	}

}
