import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int A = 1;
		int B = N;
		for( int i=1; i<=M; i++ ){
			System.out.println(A+" "+B);
			A++;
			B--;
		}
	}
}