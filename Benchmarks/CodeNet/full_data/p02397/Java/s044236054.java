import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int x, y;
		
		while(true) {
			x = scan.nextInt();
			y = scan.nextInt();
			if (x == 0 && y == 0) break;
			
			if (x <= y) {
				System.out.println(x + " " + y);
			}
			else {
				System.out.println(y + " " + x);
			}
		}
	}
}

