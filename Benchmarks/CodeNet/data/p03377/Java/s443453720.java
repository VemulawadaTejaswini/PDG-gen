import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		// 入力
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int x = scanner.nextInt();
		
		if(check(a, 100) && check(b, 100) && check(x, 200)) {
			if( a <= x && x <= (a+b) ) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} else {
			System.out.println("NO");
		}
	}
	
	static boolean check(int input, int max) {
		return (0 <= input && input <=  max);
	}
}
