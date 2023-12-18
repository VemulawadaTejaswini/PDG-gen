
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String result = "Impossible";
		if((a * b) % 3 == 0 || (a + b) % 3 == 0) result = "Possible";
	}

}
