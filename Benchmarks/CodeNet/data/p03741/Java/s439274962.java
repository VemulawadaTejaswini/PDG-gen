import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] sumA = new long[N+1];
		long[] sumB = new long[N+1];
		long countA = 0,countB = 0;
		for( int i=1; i<=N; i++ ){
			long a = sc.nextLong();
			sumA[i] = a + sumA[i-1];
			sumB[i] = a + sumB[i-1];
			if( sumA[i]<=0 && i%2!=0 ){
				countA += 1 - sumA[i];
				sumA[i] += 1 - sumA[i];
			}
			if( sumA[i]>=0 && i%2==0 ){
				countA += sumA[i] + 1;
				sumA[i] += (-1) - sumA[i];
			}
			if( sumB[i]<=0 && i%2==0 ){
				countB += 1 - sumB[i];
				sumB[i] += 1 - sumB[i];
			}
			if( sumB[i]>=0 && i%2!=0 ){
				countB += sumB[i] + 1;
				sumB[i] += (-1) - sumB[i];
			}
		}
		System.out.println(Math.min(countA,countB));
	}
}
