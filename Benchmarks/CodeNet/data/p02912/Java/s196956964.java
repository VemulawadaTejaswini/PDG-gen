import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int M = scan.nextInt();
			int count = 0;
			int []A =new int[N];
			for(int i = 0;i<N;i++)A[i]=scan.nextInt();
			
			Arrays.sort(A);
			
			while(count!=M) {
				A[N-1]/=2;
				count++;
				Arrays.sort(A);
			}
			
			long goukei = 0;
			
			for(int i:A) goukei+=i;
			
			System.out.println(goukei);
			
		}
		
		
	}
		

}
