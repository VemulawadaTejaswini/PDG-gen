import java.util.Scanner;
// A - Number of Multiples
class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int R = sc.nextInt();
		int d = sc.nextInt();

		int X = (R/d - L/d);
		if (L%d==0) {
			X++;
		}
		System.out.println(X);
		return;


	}
}