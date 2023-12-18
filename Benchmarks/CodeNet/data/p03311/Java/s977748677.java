import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] A = new long[N+1];
		long[] dis = new long[N+1];
		int countP=0,countM=0,countZ=0;
		long minP = 1000000000L,minM = 1000000000L;
		long cc = 0,dd = 0;
		for( int i=1; i<=N; i++ ){
			cc++;
			A[i] = sc.nextLong();
			dis[i] = Math.abs(A[i]-cc);
			if( A[i]>cc ){
				countP++;
				minP = Math.min(minP,dis[i]);
			}
			if( A[i]<cc ){
				countM++;
				minM = Math.min(minM,dis[i]);
			}
			if( A[i]==cc ){
				countZ++;
			}
		}
		Arrays.sort(dis);
		int count = 1,maxium = 0;
		long num = 0;
		for( int i=1; i<=N-1; i++ ){
			if( dis[i]==dis[i+1] ){
				count++;
				if( count>maxium ){
					maxium = count;
					num = dis[i];
				}
			}else{
				count = 1;
			}			
		}
		long ans1 = 0,ans2 = 0,ans3 = 0;
		long b1 = 0,b2 = 0,b3 = 0;
		if( countP>=countM ){
			b1 = num;
			b2 = minP;
			b3 = 0;			
			for( int i=1; i<=N; i++ ){
				dd++;
				ans1 += Math.abs( A[i]-(b1+dd) );
				ans2 += Math.abs( A[i]-(b2+dd) );
				ans3 += Math.abs( A[i]-(b3+dd) );
			}
		}else{
			b1 = num*(-1);
			b2 = minM;
			b3 = 0;			
			for( int i=1; i<=N; i++ ){
				dd++;
				ans1 += Math.abs( A[i]-(b1+dd) );
				ans2 += Math.abs( A[i]-(b2+dd) );
				ans3 += Math.abs( A[i]-(b3+dd) );
			}						
		}
		System.out.println( Math.min(ans1,Math.min(ans2,ans3)) );
	}
}
