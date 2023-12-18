import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		int inputFirst = sc.nextInt();
		int inputSecond = sc.nextInt();
		sc.close();
		
		int dispInt = 1;

		for (int i=0; i < inputFirst; i++) {
			int x = dispInt * 2;
			int y = dispInt + inputSecond;
			if (x < y) {
				dispInt = x;
			} else {
				dispInt = y;
			}
		}
		
		System.out.println(dispInt);
	}
}