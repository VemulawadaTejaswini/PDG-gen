import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int ansA = 0;
		int ansB = 0;
		int ansC = 0;

		ansA = A + B;
		ansB = A - B;
		ansC = A * B;

		System.out.println(Math.max(ansC, Math.max(ansA, ansB)));

	}
}