import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		String ans = "Impossible";
		
		if (a%3==0||b%3==0||(a+b)%3==0) {
			ans = "Possible";
		}
		System.out.println(ans);
		scanner.close();

	}

}