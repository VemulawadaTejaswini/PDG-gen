//package atcoder;
 
import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int S[][] = new int [N][M+1]; 
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M+1;j++) {
				S[i][j] = sc.nextInt();
				//System.out.println(S[i][j]);
			}
		}
		
		long MAX = Long.MAX_VALUE;
		for(int i=0;i<Math.pow(2, N);i++) {
			long skill[] = new long[M+1];
			int cost=0;
			//int s = i;
				for(int j=0;j<N;j++) {
					if(((i>>j)&1) == 1) {
						cost += S[j][0];
						for(int k=0;k<M;k++) {
							skill[k] += S[j][k+1];	
						}
						//System.out.println(cost);
					}
					boolean ok = true;
					for(int l=0;l<M;l++) {
						if(skill[l]<X) {
							ok = false;	
						}
					}
						if(ok) {
							MAX = Math.min(MAX, cost);
						}
					
				}
		}
		if(MAX == Long.MAX_VALUE){
		System.out.println("-1");}
		else {
			System.out.println(MAX);
		}
	}
		
}
