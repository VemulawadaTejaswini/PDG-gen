import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		int len = 0;
		while(x  <= y) {
			len++;
			x *= 2;
		}
		System.out.println(len);
	}

}
