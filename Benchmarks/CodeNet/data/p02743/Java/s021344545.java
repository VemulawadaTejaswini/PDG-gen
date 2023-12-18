
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();

		double ansA = Math.sqrt(A);
		double ansB = Math.sqrt(B);
		double ansC = Math.sqrt(C);

		double AB = ansA + ansB;

		if (AB <ansC) {
			System.out.print("Yes");

		}else {
			System.out.print("No");
		}
	}
}



