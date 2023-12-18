import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] vO = new int[100001];
		int[] vE = new int[100001];
		int maxO=0,maxE=0,maxNumO=0,maxNumE=0;
		for( int i=1; i<=N/2; i++ ){
			vO[sc.nextInt()]++;
			vE[sc.nextInt()]++;
		}
		for( int i=1; i<=100000; i++ ){
			if( vO[i]>maxO ){
				maxO = vO[i];
				maxNumO = i;
			}
			if( vE[i]>maxE ){
				maxE = vE[i];
				maxNumE = i;
			}
		}
		Arrays.sort(vO);
		Arrays.sort(vE);
		int ans = 0;
		if( maxNumO!=maxNumE ){
			ans = N - vO[100000] - vE[100000];
		}
		if( maxNumO==maxNumE ){
			int a = N - vO[100000] - vE[99999];
			int b = N - vE[100000] - vO[99999];
			ans = Math.min(a,b);          
		} 
		System.out.println(ans);     
	}
}
