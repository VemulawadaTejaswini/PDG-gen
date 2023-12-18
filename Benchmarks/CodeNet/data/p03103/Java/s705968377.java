import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long M = sc.nextLong();
		int[] B = new int[100000001];
		int[] C = new int[N];
		for( int i=0; i<N; i++ ){
			int A = sc.nextInt();
			B[A] += sc.nextInt();
			C[i] = A;
		}
		Arrays.sort(C);
		long many = 0;
		long total = 0;
		for( int i=0; i<N; i++ ){
			many += (long)B[C[i]];
			if( many<M ){
				total += (long)B[C[i]]*(long)C[i];              
			}else{
				total += (M-(many-(long)B[C[i]]))*(long)C[i];               
				break;
			}         
		}
		System.out.println(total);
	}
}
