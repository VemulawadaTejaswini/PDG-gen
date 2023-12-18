import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if(b - a < 0){
			System.out.println("delicious");
		}else if (b-a < x) {
			System.out.println("safe");
		}else {
			System.out.println("dengerous");
		}
	}
}
