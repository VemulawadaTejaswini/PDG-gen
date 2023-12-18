import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Long a = scan.nextLong();
		Long b = scan.nextLong();
		Long x = scan.nextLong();
		Long count = b / x + 1;
		Long i = (long) 0;
		for(; i < a; i = i + x) {
			count--;
		}
		System.out.println(count);
	}
}