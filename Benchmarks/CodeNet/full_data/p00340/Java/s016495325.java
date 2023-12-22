import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		int a = stdin.nextInt();
		int b = stdin.nextInt();
		int c = stdin.nextInt();
		int d = stdin.nextInt();
		
		if(a == b && c == d) {
			System.out.println("Yes");
		} else if (a == c && b == d) {
			System.out.println("Yes");
		}  else if (a == d && b == c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}