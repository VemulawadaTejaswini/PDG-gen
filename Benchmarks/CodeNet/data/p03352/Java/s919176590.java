import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		
		int a = 0;
		
		for(int i = 2; i <= 32; i++) {
			for(int j =2; j <=10; j++) {
				double b = Math.pow(i, j);
				if(b <= X) {
					a = (int)Math.min(X - a, X - b);
				} else {
					break;
				}
			}
		}
		if(X < 4) {
			System.out.println(X);
		} else {
			System.out.println(X - a);
		}
	}
}
