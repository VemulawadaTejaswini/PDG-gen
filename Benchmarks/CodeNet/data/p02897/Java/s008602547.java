
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer n = Integer.valueOf(scanner.nextInt());
		Integer oddNum = (n / 2) + (n % 2);
		System.out.println((float)oddNum / (float)n);
	}

}
