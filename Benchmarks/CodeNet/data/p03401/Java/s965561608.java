import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[]A = new int [N];
			for(int i = 0;i<N;i++)A[i] = scan.nextInt();
			
			long []s = new long[N+2];
			
			s[1] = s[0]+(long)Math.abs(A[0]-0);//1
			for(int i = 1;i<N;i++) {//Nー1
				s[i+1] = s[i]+(long)Math.abs(A[i]-A[i-1]);
			}
			s[N+1] = s[N]+(long)Math.abs(0-A[N-1]);
			
			for(int i = 0;i<N;i++) {
				long goukei = 0;
				goukei+=s[N+1]-s[i+2];
				//System.out.print(goukei);
				//System.out.print(" ");
				goukei+=s[i];
				//System.out.println(s[i]);
				
				if(i==0) goukei+=(long)Math.abs(A[i+1]);
				else if(i==N-1)goukei+=(long)Math.abs(A[i-1]);
				else goukei+=(long)Math.abs(A[i+1]-A[i-1]);
				
				System.out.println(goukei);
			}
			
			
			
			
			
		}
		
		
	}
		

}
