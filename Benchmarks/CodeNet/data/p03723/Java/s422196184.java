import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int tmpA = 0;
		int tmpB = 0;
		int tmpC = 0;

		for (int i = 1; ;i++) {
			tmpA = A/2;
			tmpB = B/2;
			tmpC = C/2;
			
			A = tmpB + tmpC;
			B = tmpA + tmpC;
			C = tmpA + tmpB;
			
			if(A%2>0 || B%2>0 || C%2>0){
				System.out.println(i);
				System.exit(0);
			}
			
			if(A == B && B == C) {
				System.out.println(-1);
				System.exit(0);			
			}
			
		}
	}
 
}