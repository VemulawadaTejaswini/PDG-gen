import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int x = scan.nextInt();
		
		if(x < a) {
			System.out.println("NO");
		}else if(x <= a + b) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}