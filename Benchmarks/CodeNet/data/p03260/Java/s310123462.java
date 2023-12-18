import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		int A = 0,B = 0,x = 0;

		A = sc.nextInt();
		B = sc.nextInt();
		x = A * B * 3;
		x = x % 2;

		if(x != 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
