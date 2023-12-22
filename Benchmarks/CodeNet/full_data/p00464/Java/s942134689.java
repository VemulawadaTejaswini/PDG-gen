import java.util.Scanner;

//Walk
public class Main{

	int h, w, n;

	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			h = sc.nextInt();
			w = sc.nextInt();
			n = sc.nextInt();
			if((h|w|n)==0)break;
			int[][] m = new int[h][w];
			for(int i=0;i<h;i++)for(int j=0;j<w;j++)m[i][j]=sc.nextInt();
			int[][] dp = new int[h][w];
			dp[0][0] = n-1;
			for(int j=1;j<w;j++)dp[0][j]=(dp[0][j-1]+m[0][j-1])/2;
			for(int i=1;i<h;i++)dp[i][0]=(dp[i-1][0]+(m[i-1][0]+1)%2)/2;
			for(int i=1;i<h;i++){
				for(int j=1;j<w;j++){
					dp[i][j] = (dp[i-1][j]+(m[i-1][j]+1)%2)/2 + (dp[i][j-1]+m[i][j-1])/2;
				}
			}
			int x = 0;
			int y = 0;
			while(!(x==w||y==h)){
				if((dp[y][x]+m[y][x])%2==0)y++;
				else x++;
			}
			System.out.println(++y+" "+ ++x);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}