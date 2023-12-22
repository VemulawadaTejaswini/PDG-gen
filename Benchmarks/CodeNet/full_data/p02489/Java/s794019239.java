import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while (true) {
			int in = sc.nextInt();
			if (in == 0)
				break;
			System.out.println("Case " + i + ": " + in);
			i++;
		}
	}
}