import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		final int B = sc.nextInt();
		int C = sc.nextInt();
		final int D = sc.nextInt();
		while(true) {
			C -= B;
			if(C<=0) {
				System.out.println("YES");
				break;
			}
			A -= D;
			if(A<=0) {
				System.out.println("NO");
				break;
			}
			
		}
	}
}
