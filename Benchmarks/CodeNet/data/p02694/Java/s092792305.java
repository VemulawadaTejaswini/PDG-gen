import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long S = scanner.nextLong();
		long x = 100;
		long y = 0;
		int i = 1;

		while(x < S*100) {
			x *= 1.01;
			y = (long)x;
			//System.out.println(y);
			if (y >= S) {
				System.out.println(i);
				//System.out.println(y);
				break;
			}
			i++;
			//System.out.println(i);
		}
	}
}
