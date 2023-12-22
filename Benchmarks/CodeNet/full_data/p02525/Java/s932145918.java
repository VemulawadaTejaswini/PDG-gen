
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if(n==0){
				break;
			}
			double ave=0;

			for (int i = 0; i < n; i++) {
				ave+=sc.nextInt();
			}
			System.out.println(ave/(double)n);

		}
		sc.close();
		System.out.println("\n");
	}
}