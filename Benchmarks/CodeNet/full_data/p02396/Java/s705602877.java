import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i = 0, x;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			x = scan.nextInt();
			if (x == 0) break;
			i++;
			System.out.println("Case " + i + ": " + x);
		}
	}
}

