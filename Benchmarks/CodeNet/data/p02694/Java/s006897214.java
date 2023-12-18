import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var x = sc.nextLong();
		sc.close();

		var m = 100L;
		var y = 0;
		while (m < x) {
			y++;
			m = (long)(m * 1.01);
		}

		System.out.println(y);
	}
}