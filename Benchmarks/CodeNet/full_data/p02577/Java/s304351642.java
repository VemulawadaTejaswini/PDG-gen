import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		if(n/9 == 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
