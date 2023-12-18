
import java.util.*;


public class Main{ 
	   public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int one=0;
		int two=0;
		int three=0;
		for(int i=1;i<=n;i++) {
			int num=s.nextInt();
			if(num==1)
				one++;
			else if(num==2)
				two++;
			else
				three++;
		}
		
		
		double dp[][][]=new double[n+1][n+1][n+1];
		
		for(int i=0;i<=n;i++) {
			 	for(int j=0;j<=n;j++) {
			 		for(int k=0;k<=n;k++) {
			         dp[i][j][k]=-1;
			        }
		        }
	    }

    double ans=f(dp,one,two,three,n);
		System.out.print(ans);
	   }
	   
   public static double f(double dp[][][],int x,int y,int z,int n) {
	  if(x==0 && y==0 && z==0) {
		  return 0;
	  }
	  if(x<0 || y<0 || z<0) {
		  return 0;
	  }
	  if(dp[x][y][z]>-0.9) {
		  return dp[x][y][z];
	  }
	   
	   double exp=n + x*f(dp,x-1,y,z,n)+ y*f(dp,x+1,y-1,z,n)+z*f(dp,x,y+1,z-1,n);
	   return dp[x][y][z]=exp/(x+y+z);
   }
}