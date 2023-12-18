import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int a = n;
		int sn = 0;
		while(a != 0) {
			sn += a % 10;
			a /= 10;
		}
		if(n % sn == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
