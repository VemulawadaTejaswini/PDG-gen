
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=0;i<n;i++){
			String s1=scanner.next();
			String s2=scanner.next();
			System.out.println(lcs(s1,s2));
		}
	}

	private static int  lcs(String s1, String s2) {
		// TODO Auto-generated method stub
		int[][] c=new int[1001][1001];
		int m=s1.length();
		int n=s2.length();
		for(int i=1;i<=m;i++)
			c[i][0]=0;
		for(int i=1;i<=n;i++)
			c[0][i]=0;
		s1=" "+s1;
		s2=" "+s2;
		int max=0;
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(s1.charAt(i)==s2.charAt(j))
					c[i][j]=c[i-1][j-1]+1;
				else c[i][j]=Math.max(c[i-1][j], c[i][j-1]);
				max=Math.max(max, c[i][j]);
			}
		}
		
		return max;
	}
}
