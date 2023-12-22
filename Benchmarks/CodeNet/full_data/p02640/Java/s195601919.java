import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);

		int x = in.nextInt();
		int y = in.nextInt();
		double crane = y/2-x;
		double trtle = 2*x-y/2;

		if(crane % 1 == 0 && trtle % 1 == 0) {
			if(crane + trtle == x && x*4 > y && x < y) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}else {
			System.out.println("No");
		}


	}

}
