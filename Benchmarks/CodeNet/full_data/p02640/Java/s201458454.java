import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);

		int x = in.nextInt();
		int y = in.nextInt();

		if((y/2-x)+(2*x-y/2) == x && y <= x*4 && y > x) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}



	}

}
