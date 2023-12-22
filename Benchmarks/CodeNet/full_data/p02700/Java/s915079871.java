import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		while(A > 0) {
			C -= B;
			if(C <= 0) {
				System.out.println("Yes");
				return;
			}
			A -= D;
		}
		System.out.println("No");
	}
}
