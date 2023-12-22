
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();

		int attackNumA = (int) Math.ceil((double)A/D);
		//System.out.println(attackNumA);
		int attackNumT = (int) Math.ceil((double)C/B);
		//System.out.println(attackNumT);
		if(attackNumA >= attackNumT) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		scan.close();
	}
}
