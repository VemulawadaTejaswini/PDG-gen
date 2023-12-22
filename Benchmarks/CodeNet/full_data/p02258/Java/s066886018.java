import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// Scanner sc = new Scanner(new File("in1.txt"));
		// Scanner sc = new Scanner(new File("in2.txt"));
		sc.nextInt();
		
		int r0 = sc.nextInt();
		int r1 = sc.nextInt();
		int max_profit = r1 - r0;
		int min_r = Math.min(r0, r1);
		while (sc.hasNextInt()) {
			int r = sc.nextInt();
			max_profit = Math.max(max_profit, r - min_r);
			min_r = Math.min(min_r, r);
		}
		System.out.println(max_profit);
	}
}