
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();
		String[] lines = line.split(" ");

		double A = Double.parseDouble(lines[0]);
		double B = Double.parseDouble(lines[1]);

		System.out.println((long)(A*B));
	}
}
