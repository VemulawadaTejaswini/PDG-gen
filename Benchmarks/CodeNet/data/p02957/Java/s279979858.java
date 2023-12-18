import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();

		if(Math.abs(a-b)%2==0) {
			System.out.println((a>b)? Math.abs(a-Math.abs(a-b)/2) : Math.abs(a+Math.abs(a-b)/2));
		}else {
			System.out.println("IMPOSSIBLE");
		}

	}
}
