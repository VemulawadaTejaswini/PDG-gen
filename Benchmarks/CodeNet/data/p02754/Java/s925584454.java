import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
				
		int N = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		int k = 0;

		if(1<=N && N<=Math.pow(10,18)){
			k = N/(A+B);
			
			if( (A+B)* k <= N){
			System.out.println( A*k + (N-k*(A+B)));
			}
			else{
			System.out.println(A*k);
			}

		}
	}
}