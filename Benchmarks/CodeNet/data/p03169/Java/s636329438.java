import java.util.*;
public class Main {
	static int n;
	static boolean[][][] vis=new boolean[301][301][301];
	static double[][][] dp=new double[301][301][301];
	public static double DP(int x,int y,int z) {
		if (vis[x][y][z]) return dp[x][y][z];
		vis[x][y][z]=true;
		double tot=x+y+z,lucky=n/tot;
		if (x>0) dp[x][y][z]+=x/tot*(lucky+DP(x-1,y,z));
		if (y>0) dp[x][y][z]+=y/tot*(lucky+DP(x+1,y-1,z));
		if (z>0) dp[x][y][z]+=z/tot*(lucky+DP(x,y+1,z-1));
		return dp[x][y][z];
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int[] c=new int[3];
		for (int i=0;i<n;++i) {
			int x=in.nextInt();
			--x;
			++c[x];
		}
		System.out.printf("%.12f\n",DP(c[0],c[1],c[2]));
	}
}