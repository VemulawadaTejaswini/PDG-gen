import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int[]A = new int[N];
			for(int i = 0;i<N;i++)A[i] = scan.nextInt();
			
			
			
		
			
			
			int count = 0;
			
			int g = A[0];
			for(int i = 1;i<N;i++) {
				g = gcd(A[i],g);
				}
			
			
		
			
			System.out.println(g);
		}
		
		
	}
		
	private static int gcd(int A,int B){//最大公約数
		return B==0?A:gcd (B,A%B);
	}

}
