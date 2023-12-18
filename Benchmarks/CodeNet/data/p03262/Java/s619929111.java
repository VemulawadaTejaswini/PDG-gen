import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int X = scan.nextInt();
			int[]x = new int [N+1];
			for(int i = 0;i<N;i++)x[i] = scan.nextInt();
			x[N] = X;
			Arrays.sort(x);
			
			int g = x[1]-x[0];
			for(int i = 2;i<N+1;i++) {
				g = gcd(x[i]-x[i-1],g);
			}
			
			System.out.println(g);
			
			/*
			int xmin = x[0];
			int xmax = x[N-1];
			
			if(X<xmin) {
				int g = x[0]-X;
				for(int i = 1;i<N;i++) {
					g = gcd(x[i]-x[i-1],g);
				}
			}else if(X>xmax) {
				int g = X-x[N-1];
				for(int i = N-1;i>0;i--) {
					g = gcd(x[i]-x[i-1],g);
				}
			}else {
				
			}
			*/
			
		}
		
		
	}
	
	private static int gcd(int A,int B){//最大公約数
		return B==0?A:gcd (B,A%B);
	}
		

}
