import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		Long x = sc.nextLong();
		Long y = sc.nextLong();
		Long count = 0L;
		for(long l = x; l <= y; count++) {
			l *= 2;
		}
		System.out.println(count);
	}
}