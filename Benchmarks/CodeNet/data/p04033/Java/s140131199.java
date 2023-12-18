import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		if(a > 0) {
			System.out.println("Positive");
			return;
		}else if(a <= 0 && b >= 0) {
			System.out.println("Zero");
			return;
		}else {
			int cnt = -a - (-b)+1;
			if(cnt%2==0) {
				System.out.println("Positive");
			}else {
				System.out.println("Negative");
			}
		}
	}
}