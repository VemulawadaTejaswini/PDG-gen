import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		if((a-b)%2==0) {
			System.out.print("Alice");
		}
		else {
			System.out.print("Borys");
		}
	}

}