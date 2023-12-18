import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int costLeft = 0;
		int costRight = 0;
		while (sc.hasNextInt()) {
			int i = sc.nextInt();
			if (i > X) {
				costRight++;
			}
			if (i < X) {
				costLeft++;
			}
		}
		
		System.out.println(Integer.min(costLeft, costRight));
	}
}