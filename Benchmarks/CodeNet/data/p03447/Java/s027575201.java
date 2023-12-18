import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int shojikin = scanner.nextInt();
		int cake_val = scanner.nextInt();
		int dounut_val = scanner.nextInt();
		int dounut_kosuu;
		shojikin -= cake_val;
		dounut_kosuu =shojikin / dounut_val;
		shojikin -= dounut_val * dounut_kosuu;
		System.out.println(shojikin);
	}
}