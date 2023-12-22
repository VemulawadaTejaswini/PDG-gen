import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int i = 0;

		while(true) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			if((x == 0 && y == 0) || i > 3000) {
				break;
			}
			if(x < y) {
				System.out.println(x + " " + y);
			} else {
				System.out.println(y + " " + x);
			}
			i++;
		}
	}

}
