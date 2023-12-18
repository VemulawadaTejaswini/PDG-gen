import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int x = scanner.nextInt();
		if(a / x == 0){
			System.out.println(b/x - a/x + 1);
		}else {
			System.out.println(b/x - a/x);
		}
	}
}