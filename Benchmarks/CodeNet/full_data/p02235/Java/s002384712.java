import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println(LCS(in.next().toCharArray(),in.next().toCharArray()));
		}
	}
	
	static int LCS(char[] A,char[] B) {
		int DP[][]=new int[B.length][A.length];
		
		for(int i=0;i<A.length;i++) {
			if(A[i]==B[0])DP[0][i]=1;
			else if(i>0)DP[0][i]=DP[0][i-1];
		}
		
		for(int i=1;i<B.length;i++) {
			for(int j=0;j<A.length;j++) {
				if(j==0) {
					if(B[i]==A[j])DP[i][j]=1;
					else DP[i][j]=DP[i-1][j];
				}
				else {
					if(B[i]==A[j])DP[i][j]=DP[i-1][j-1]+1;
					else DP[i][j]=Math.max(DP[i-1][j], DP[i][j-1]);
				}
			}
		}
		//print(DP);
		
		int res=0;
		for(int i=0;i<B.length;i++) {
			res=Math.max(res,DP[i][A.length-1]);
		}
		
		return res;
	}
	
	static void print(int[][] A) {
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[i].length;j++)System.out.print(A[i][j]+" ");
			System.out.println();
		}
	}

}

