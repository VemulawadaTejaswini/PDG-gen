import java.util.ArrayList;
import java.util.Scanner;
// A - Number of Multiples
class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int C = 0;

		ArrayList<Integer> lstA;

		lstA = new ArrayList<Integer>();

		for (int i=1; i <= N; i++) {
			int x = sc.nextInt();

			if (i%2!=0 && x%2!=0) {
				C++;
			}
		}
		System.out.println(C);
		return;


	}
}