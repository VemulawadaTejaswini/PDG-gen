import java.util.Scanner;

public class Main {
static int r;
static int c;
static char[][]grid;
static long[][]memo;

public static long cnt(int i,int j) {
	if(i>r-1||j>c-1||grid[i][j]=='#')
		return 0;
	if(i==r-1&&j==c-1)
		return 1;
	if(memo[i][j]!=-1)
		return memo[i][j];
	return memo[i][j]=cnt(i+1,j)+cnt(i,j+1);
	
	
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		c=sc.nextInt();
		grid=new char[r][c];
		for(int i=0;i<r;i++) {
			String row=sc.next();
			for(int j=0;j<c;j++) {
				grid[i][j]=row.charAt(j);
			}
		}	
		memo=new long[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				memo[i][j]=-1;
			}
		}	
		
		System.out.println(cnt(0,0)%((10^9)+7));
		
		
		sc.close();
	}

}
