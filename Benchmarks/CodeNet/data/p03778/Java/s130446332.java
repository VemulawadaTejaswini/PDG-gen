import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a < b && b < a + w) {
			System.out.println(0);
		}else if(a + w < b) {
			int x = b - (a + w);
			System.out.println(x);
		}else if(b + w < a) {
			int x = a - (b + w);
			System.out.println(x);
		}

	}

}
