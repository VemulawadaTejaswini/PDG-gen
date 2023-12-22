import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws Exception{
		Scanner cin= new Scanner(System.in);
		final int n= cin.nextInt();
		int[]   A = new int[n];
		int[][] DP= new int[n][2];
		int[]   DPi=new int[n];
		
		A[0]= cin.nextInt();
		DP[0][0]= 1;
		DP[0][1]= 0;
		DPi[0]= 1;
		int min= A[0];
		
		int i,j;
		for(i=1;i<n;i++){
			A[i]= cin.nextInt();

			if( A[i]<=min ){
				DP[i][0]= DP[i-1][0];
				DP[i][1]= DP[i-1][1];
				DPi[i]= 1;
				min= A[i];
			}
			else{
				for(j=i-1;j>=0;j--){
					if( A[j]<A[i] ){
						if( DPi[i]< DPi[j]+1 ){
							DPi[i]= DPi[j]+1;
						}
						else{
							if( DPi[i]>DP[j][0] ) break;
						}
					}
				}
				
				if( DPi[i]>=DP[i-1][0] ){
					DP[i][0]= DPi[i];
					if( DPi[i]==DP[i-1][0] && A[DP[i-1][1]]<A[i] ){
						DP[i][1]= DP[i-1][1];
					}
					else{
						DP[i][1]= i;
					}
				}
				else{
					DP[i][0]= DP[i-1][0];
					DP[i][1]= DP[i-1][1];
				}
			}
		}
		
		System.out.println(DP[n-1][0]);
	}
}