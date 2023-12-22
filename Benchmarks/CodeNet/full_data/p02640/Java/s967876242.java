import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		double a = x / 3;
		double b = y / 8;
		
		double c = 2*x /3;
		double d = y / 4;
		
		if(a == b || c == d) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}
		
	}

}
