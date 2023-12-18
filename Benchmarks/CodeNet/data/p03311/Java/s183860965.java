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
		long b = 0,ans = 0;
		if( countP==0 || countM==0 ){
			if( countP==0 ){
				b = num*(-1);
			}
			if( countM==0 ){
				b = num;
			}
			if( countZ==N ){
				b = 0;
			}
		}else{
			if( countP>countM+countZ ){
				b = minP;
			}else if(countM>countP+countZ){
				b = minM*(-1);
			}else{
				b = 0;
			}
		}
		for( int i=1; i<=N; i++ ){
			dd++;
			ans += Math.abs( A[i]-(b+dd) );
		}
		System.out.println(ans);
	}
}
