import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int[][] white = new int[k][k];
		int[][] black = new int[k][k];

		int whiteTotal = 0;
		int blackTotal = 0;

		int[][] whiteLeftBelow = new int[k][k];
		int[][] blackLeftBelow = new int[k][k];
		int[][] whiteRightAbove = new int[k][k];
		int[][] blackRightAbove = new int[k][k];

		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			boolean isWhite = sc.next().equals("W");
			int xmod = x%k;
			int ymod = y%k;
			if((x/k)%2==0 ^ (y/k)%2==0) {
				isWhite = !isWhite;
			}

			if(isWhite) {
				white[xmod][ymod]++;
				whiteTotal++;
			} else {
				black[xmod][ymod]++;
				blackTotal++;
			}
		}

		whiteLeftBelow[0][0]=white[0][0];
		blackLeftBelow[0][0]=black[0][0];
		for(int i=0;i<k;i++) {
			for(int j=0;j<k-1;j++) {
				if(i==0) {
					whiteLeftBelow[i][j+1]=whiteLeftBelow[i][j]+white[i][j+1];
					blackLeftBelow[i][j+1]=blackLeftBelow[i][j]+black[i][j+1];
				} else {
					whiteLeftBelow[i][j+1]=whiteLeftBelow[i][j]+whiteLeftBelow[i-1][j+1]-whiteLeftBelow[i-1][j]+white[i][j+1];
					blackLeftBelow[i][j+1]=blackLeftBelow[i][j]+blackLeftBelow[i-1][j+1]-blackLeftBelow[i-1][j]+black[i][j+1];
				}
			}
			if(i<k-1) {
				whiteLeftBelow[i+1][0]=whiteLeftBelow[i][0]+white[i+1][0];
				blackLeftBelow[i+1][0]=blackLeftBelow[i][0]+black[i+1][0];
			}
		}

		whiteRightAbove[k-1][k-1]=white[k-1][k-1];
		blackRightAbove[k-1][k-1]=black[k-1][k-1];
		for(int i=k-1;i>=0;i--) {
			for(int j=k-1;j>=1;j--) {
				if(i==k-1) {
					whiteRightAbove[i][j-1]=whiteRightAbove[i][j]+white[i][j-1];
					blackRightAbove[i][j-1]=blackRightAbove[i][j]+black[i][j-1];
				} else {
					whiteRightAbove[i][j-1]=whiteRightAbove[i][j]+whiteRightAbove[i+1][j-1]-whiteRightAbove[i+1][j]+white[i][j-1];
					blackRightAbove[i][j-1]=blackRightAbove[i][j]+blackRightAbove[i+1][j-1]-blackRightAbove[i+1][j]+black[i][j-1];
				}
			}
			if(i>0) {
				whiteRightAbove[i-1][k-1]=whiteRightAbove[i][k-1]+white[i-1][k-1];
				blackRightAbove[i-1][k-1]=blackRightAbove[i][k-1]+black[i-1][k-1];
			}
		}

		//count total hopes

		int ans = 0;
		for (int i=0;i<k;i++) {
			for(int j=0;j<k;j++) {
				int tmp = whiteLeftBelow[i][j] + (i+1<k && j+1<k ? whiteRightAbove[i+1][j+1] : 0) + blackTotal
						- blackLeftBelow[i][j] - (i+1<k &&  j+1<k ? blackRightAbove[(i+1)%k][(j+1)%k] : 0);
				if(ans < tmp) {
					ans = tmp;
				}

				tmp = blackLeftBelow[i][j] + (i+1<k && j+1<k ? blackRightAbove[i+1][j+1] : 0 ) + whiteTotal
						-  whiteLeftBelow[i][j] - (i+1<k && j+1<k ? whiteRightAbove[i+1][j+1] : 0);

				if(ans < tmp) {
					ans = tmp;
				}
			}
		}

		System.out.println(ans);

	}

}
