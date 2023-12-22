import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws Exception{
		Scanner cin= new Scanner(System.in);
		final int n= cin.nextInt();
		int[]   A = new int[n];
		int[][] DP= new int[n][2]; //A[0]-A[i]での最長増加列の [0]長さ/ [1]最後の要素のindex
		int[]   DPi=new int[n];    //A[0]-A[i](A[i]を必ず含む)での最長増加列の長さ
		
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
				//DPi[i]の更新
				DPi[i] =0;
				for(j=i-1;j>=0;j--){
					if( A[j]<A[i] && DPi[j]+1>DPi[i] ){
						DPi[i]= DPi[j]+1;
					}
				}
				//DP[i][*]の更新
				if( DPi[i]>DP[i-1][0] ){
					DP[i][0]= DPi[i];
					DP[i][1]= i;
				}
				else if( DPi[i]==DP[i-1][0] ){
					if( A[DP[i-1][1]]>A[i] ){
						DP[i][0]= DPi[i];
						DP[i][1]= i;
					}
					else{
						DP[i][0]= DPi[i];
						DP[i][1]= DP[i-1][1];
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