import java.util.Scanner;

public class Main {

	public static final int MAX = 3500;

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for(int h=1;h<=MAX;h++) {
			for(int n=1;n<=MAX;n++) {
				int child = N*h*n;
				int mother = 4*h*n - N*n - N*h;

				if(mother != 0 && child%mother == 0 && child/mother > 0) {
					System.out.println(h + " " + n + " " + (child/mother));
					return;
				}

			}
		}
	}
}
