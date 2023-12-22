import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		while (stdIn.hasNext()) {
			int m = stdIn.nextInt();
			int a = 0;
			int cou = 0;
			int h = 0;
			a: for (int i = 0; i < 12; i++) {
				int s = stdIn.nextInt();
				int l = stdIn.nextInt();
				a += s - l;
				if (m <= a && h == 0) {
					h++;
					cou += i + 1;

				}
			}
			if (m <= a)
				System.out.println(cou);
			else
				System.out.println("NA");
		}
	}
}