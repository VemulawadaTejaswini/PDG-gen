import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a <= b) {
			if(b <= c) {
				System.out.println(a + " " + b + " " + c);
			} else if(a <= c)  {
				System.out.println(a + " " + c + " " + b);
			} else if(c <= a) {
				System.out.println(c + " " + a + " " + b);
			}
		} else if(b <= a) {
			if(a <= c) {
				System.out.println(b + " " + a + " " + c);
			} else if(b <= c) {
				System.out.println(b + " " + c + " " + a);
			} else if(c <= a) {
				System.out.println(c + " " + b + " " + a);
			}
		}
	}
}

