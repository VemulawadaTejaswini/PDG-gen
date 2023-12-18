import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[][]a=new int[scn.nextInt()][3];
		for(int i=0;i<a.length;i++)for(int j=0;j<3;j++)a[i][j]=scn.nextInt();
		System.out.println(solve(a));
	}
	
	public static int solve(int[][]a) {
		int ans=Integer.MIN_VALUE;
		for(int i=1;i<a.length;i++) {
			for(int j=0;j<3;j++) {
				int max=Integer.MIN_VALUE;
				for(int k=0;k<3;k++)if(k!=j)max=Math.max(max, a[i-1][k]);
				a[i][j]+=max;
				ans=Math.max(a[i][j], ans);
			}
		}
		return ans;
	}

}
