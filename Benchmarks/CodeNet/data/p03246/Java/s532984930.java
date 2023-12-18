import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] vOdd = new int[100001];
		int[] vEven = new int[100001];
		int maxOdd=0,maxEven=0,maxNumOdd=0,maxNumEven=0;
		for( int i=1; i<=N/2; i++ ){
			vOdd[sc.nextInt()]++;
			vEven[sc.nextInt()]++;
		}
		for( int i=1; i<=100000; i++ ){
			if( vOdd[i]>maxOdd ){
				maxOdd = vOdd[i];
				maxNumOdd = i;
			}
			if( vEven[i]>maxEven ){
				maxEven = vEven[i];
				maxNumEven = i;
			}
		}
		int ans = 0;      
		if( maxNumOdd!=maxNumEven ){
			ans = N - maxOdd - maxEven;
		}else{
			Arrays.sort(vOdd);
			Arrays.sort(vEven);
			ans = N - Math.max(maxOdd,maxEven) - Math.max(vOdd[N-1],vEven[N-1]);
		}
		System.out.println(ans);
	}
}
