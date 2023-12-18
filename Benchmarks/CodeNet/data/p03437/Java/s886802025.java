import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		if(y % x == 0) {
			System.out.println(-1);
		} else {
			System.out.println(x);
		}
	}
}
