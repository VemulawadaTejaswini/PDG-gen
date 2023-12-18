import java.util.Scanner;
public class Main {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
		int n = 0;

		n = sc.nextInt();

		for(int a = 1;a <= 9;a++) {
			for(int b = 1; b <= 9;b++) {
				if(n == a * b) {
					System.out.println("Yes");
				}
			}
		}
		System.out.println("No");
	}
}
