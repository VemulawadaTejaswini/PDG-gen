import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int N = S.length();
		int[] count = new int[N];
		int a = 0;
		for( int i=0; i<N; i++ ){
			char cc = S.charAt(i);
			if( cc=='<' ){
				count[a]++;
				if( i<=N-2 && S.charAt(i+1)!=cc ){
					a++;
				}
			}else{
				count[a] += -1;
				if( i<=N-2 && S.charAt(i+1)!=cc ){
					a++;
				}
			}
		}
		int start=0,end=0,ans=0;
		for( int i=0; i<a; i++ ){
			if( count[i]>0 && count[i+1]<0 ){
				if( i==0 ){
					start = 1;
				}
				if( i==a-1 ){
					end = 1;
				}
				int A = count[i];
				int B = Math.abs(count[i+1]);
				int C = Math.max(A,B);
				int D = Math.min(A,B);
				ans += C*(C+1)/2 + D*(D-1)/2;              
			}             
		}
		if( a==0 ){
			start = 1;
			end = 1;
			ans = Math.abs(count[0])*(Math.abs(count[0])+1)/2;          
        }          
		if( start==0 ){
			int A = Math.abs(count[0]);
			ans += A*(A+1)/2;
		}
		if( end==0 ){
			ans += count[a]*(count[a]+1)/2;
		}              
		System.out.println(ans);
	}
}
