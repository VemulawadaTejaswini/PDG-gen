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
		int ans1 = 0,ans2 = 0,ans3 = 0;
		Arrays.sort(vOdd);
		Arrays.sort(vEven);      
		ans1 = N - vOdd[N] - vEven[N];
		ans2 = N - vOdd[N] - vEven[N-1];
		ans3 = N - vOdd[N-1] - vEven[N];
		System.out.println(Math.min(ans1,Math.min(ans2,ans3)));
	}
}
