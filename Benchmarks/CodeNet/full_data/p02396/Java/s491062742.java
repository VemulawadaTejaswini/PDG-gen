import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int x = 0;
		int i = 1;
		while (flag) {
			x = sc.nextInt();
			System.out.println("Case " + i + ": " + x);
			i++;
			if (x == 0) {
				flag = false;
			}
		}
	}
}
