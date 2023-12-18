import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] numP = new int[N+1];
		int[] numQ = new int[N+1];
		int ans1 = 0,ans2 = 0;
		int[] ff = new int[]{0,1,2,6,24,120,720,5040};
		for( int i=N; i>=1; i-- ){
			numP[i] = sc.nextInt();
		}
		for( int i=N; i>=1; i-- ){
			numQ[i] = sc.nextInt();
		}
		for( int i=N; i>=1; i-- ){
			int count1 = 0,count2 = 0;
			for( int j=N; j>=i; j-- ){
				if( numP[i] > numP[j] ){
					count1++;
				}
				if( numQ[i] > numQ[j] ){
					count2++;
				}
			}
			ans1 += (numP[i]-1-count1)*ff[i-1];
			ans2 += (numQ[i]-1-count2)*ff[i-1];
		}
		System.out.println(Math.abs(ans1-ans2));
	}
}
