import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int value = 1, i = 1;
		
		while (value != 0) {
			System.out.printf("Case %d: ", i++);
			value = scan.nextInt();
		}
	}
}