import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		boolean[][] s=new boolean[h+2][w+2]; 
		int all=0;
		for(int i=1;i<=h;i++) {
			String S=sc.next();
			for(int j=1;j<=w;j++) {
				s[i][j]=S.charAt(j-1)=='.';
				if(s[i][j])all++;
			}
		}
		boolean dp[][]=new boolean[h+2][w+2];
		dp[1][1]=true;
		for(int t=1;t<h*w;t++) {
			boolean next[][]=new boolean[h+2][w+2];
			for(int i=1;i<=h;i++) {
				for(int j=1;j<=w;j++) {
					next[i][j]=s[i][j]&&
							   (dp[i-1][j]||
							    dp[i+1][j]||
							    dp[i][j-1]||
							    dp[i][j+1]);
				}
			}
			
			if(next[h][w]) {
				System.out.println(all-t-1);
				return;
				}
			dp=next;
		}
		System.out.println(-1);
		}
}
