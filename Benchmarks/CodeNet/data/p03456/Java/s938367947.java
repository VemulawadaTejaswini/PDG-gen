import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));

		for(int i = 1; i < 318; i++) {
			if(i*i == ab) {
				System.out.println("Yes");
				break;
			} else if(i*i > ab) {
				System.out.println("No");
				break;
			}
		}
	}
}