import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		long a=sc.nextLong(), b=sc.nextLong(), x=sc.nextLong();
		long count = b / x - a / x;
		if(a % x == 0) {
			count++;
		}
		System.out.println(count);
	}
}