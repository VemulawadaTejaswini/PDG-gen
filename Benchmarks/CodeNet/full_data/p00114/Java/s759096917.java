import java.awt.geom.Point2D;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class Main {	
	Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){		
		new AOJ0114();
	}
	
	class AOJ0114{
		public AOJ0114() {
			while(true){
				Bug bug = new Bug(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
				if(bug.all_zero())break;
				System.out.println(bug.movement());
			}
		}
		class Bug{
			int x,y,z;
			int kaisu;
			int a1,a2,a3,m1,m2,m3;
			public Bug(int a1,int m1,int a2,int m2,int a3,int m3) {
				this.x = 1;
				this.y = 1;
				this.z = 1;
				kaisu=0;
				this.a1 = a1;
				this.a2 = a2;
				this.a3 = a3;
				this.m1 = m1;
				this.m2 = m2;
				this.m3 = m3;
			}
			
			boolean all_zero(){
				return a1+a2+a3+m1+m2+m3==0;
			}
			
			long movement(){
				int a = move(a1,x,m1);
				int b = move(a2, y, m2);
				int c = move(a3, z, m3);
				return lcm(lcm(a,b), c);
			}
			
			long lcm(long a,long b){
				return a/gcd(a,b)*b;
			}
			long gcd(long a,long b){
				long r;
				while(a%b!=0){
					r=a%b;
					a=b;
					b=r;
				}
				return b;
			}
			int move(int a,int xyz,int m){
				int kaisu=0;
				while(true){
					xyz = (a*xyz)%m;
					kaisu++;
					if(xyz==1)return kaisu;
				}
			}
			
			
			int gcd(int a,int b){
				int r;
				int kaisu = 0;
				while(a%b!=0){
					kaisu++;
					r=a%b;
					a=b;
					b=r;
				}
				return kaisu;
			}
			
		}
	}


	class AOJ2503{
		int MAX = 0;
		public AOJ2503() {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int m = in.nextInt();

			int[][] cost = new int[n][n];

			int[] dp = new int[n];
			for(int i=0;i<n*n;i++){
				cost[i/n][i%n]=MAX;
			}
			for(int i=0;i<m;i++){
				int a = in.nextInt();
				int b = in.nextInt();
				cost[a][b]=in.nextInt();
			}	
			//			TODO 一番大きいパスを0のポイントからn-1のポイントまでの

			for(int s=1;s<n;s++){
				for(int i=0;i<=s;i++){
					if(cost[i][s]==MAX)continue;
					dp[s]=Math.max(dp[s],dp[i]+cost[i][s]);
				}
			}
			for(int s=0;s<n;s++)for(int i=0;i<n;i++){
				if(cost[s][i]==MAX)continue;
				dp[i]=Math.max(dp[s]+cost[s][i],dp[i]);
			}
			for(int i=0;i<n;i++)System.out.print(dp[i]+" ");
			System.out.println();
			System.out.println(dp[n-1]);
		}
	}
}