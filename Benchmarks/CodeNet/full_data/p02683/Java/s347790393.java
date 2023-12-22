//package ABC167;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		int x=sc.nextInt();
		int[][] b=new int[n][m+1];
		int[] u=new int[m];
		
		int ans=-1;
		int cost=0;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m+1;j++){
				b[i][j]=sc.nextInt();
				if(j!=0)u[j-1]+=b[i][j];
			}
			cost+=b[i][0];
			//System.out.println(cost);
		}
		
		for(int i=0;i<m;i++){
			if(u[i]<x){
				System.out.println(ans);
				System.exit(0);
			}
		}

        ans=cost;
       
		for(int i=0;i<(1<<n);i++){
			int cc=cost;
			int[] sk=u;
			loop1:for(int j=0;j<n;j++){
				if((1&(i>>j))==0){
	                cc -= b[j][0];
	                for(int k = 0;k<m;k++){
	                    sk[k]-=b[j][k+1];
	                    if(sk[k]<x)break loop1;
	                }
	                ans=Math.min(cc,ans);
	            }
		     }
		}
		System.out.println(ans);
	}

}
