import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		while(a<=0||c<=0) {
			if(a<=0||c<=0) {
				c = c-b;
			}
			if(a<=0||c<=0) {
				a = a-d;
			}
		}
		if(a<=0) {
			System.out.println("no");
		}
		else {
			System.out.println("yes");
		}
	}

}
