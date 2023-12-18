import java.util.*;

class Main{
	public static void main(String[] $){
		final Scanner s=new Scanner(System.in);
		int h=s.nextInt();
		int w=s.nextInt();
		int[][] a=new int[h+1][w+1];
		int[][] c=new char[h+1][w+1];

		Arrays.fill(a[0], 99999);
		for(int i=2;i<=h;++i)
			a[i][0]=99999;
		c[1][0]='.';

		for(int i=1;i<=h;++i){
			String t=s.next();
			for(int j=1;j<=w;++j){
				c[i][j]=t.charAt(j-1);

				int u=(c[i][j]!=c[i-1][j]?1:0)+a[i-1][j];
				int l=(c[i][j]!=c[i][j-1]?1:0)+a[i][j-1];
				a[i][j]=Math.min(u,l);
			}
		}
		System.out.println((a[h][w]+1)/2);
	}
}
