import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c = 0;

		for(int i = 1; i <= n; i++)
			if((int)Math.log10((double)i) % 2 == 0)
				c++;

		System.out.println(c);
	}
}