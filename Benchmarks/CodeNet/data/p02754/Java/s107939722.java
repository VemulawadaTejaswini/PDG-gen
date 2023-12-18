import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
				
		int N = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();

		if(1<=N && N<=Math.pow(10,18)){
		
			if( A+B<= N){
			System.out.println( A + (N-(A+B)));
			}
			if( A+B > N){
			System.out.println( A );
			}
		}
	}
}