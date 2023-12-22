import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ1020().doIt();
	}

	class AOJ1020{
		int[][][] dp;
		void print(int b){
			System.out.println();
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++)System.out.print(dp[i][j][b]+" ");
				System.out.println();
			}
			System.out.println();
		}

		void doIt(){
			HashMap<Character,Point> map = new HashMap<Character,Point>();
			map.put('A',new Point(0, 0));
			map.put('B',new Point(1, 0));
			map.put('C',new Point(2, 0));
			map.put('D',new Point(0, 1));
			map.put('E',new Point(1, 1));
			map.put('F',new Point(2, 1));
			map.put('G',new Point(0, 2));
			map.put('H',new Point(1, 2));
			map.put('J',new Point(2, 2));
			int sx[] = {1,0,-1,0};
			int sy[] = {0,1,0,-1};
			while(true){
				int n = in.nextInt();
				if(n==0)break;
				char s = in.next().charAt(0);
				char t = in.next().charAt(0);
				char b = in.next().charAt(0);
				Point bad = map.get(b);
				dp = new int[3][3][n+2];
				dp[map.get(s).y][map.get(s).x][0] = 1;
				for(int i=0;i<=n;i++){
					for(int y=0;y<3;y++)for(int x=0;x<3;x++)if(dp[y][x][i]>0){
						for(int j=0;j<4;j++){
							int nx = x+sx[j];
							int ny = y+sy[j];
							if(nx<0||nx>=3||ny<0||ny>=3)dp[y][x][i+1]++;
							else if(bad.x==nx&&bad.y==ny)dp[y][x][i+1]++;
							else{
								dp[ny][nx][i+1]++;
							}
						}
					}
//					print(i);
				}
				
				double sum = 0;
				double goal = dp[map.get(t).y][map.get(t).x][n];
				for(int i=0;i<3;i++)for(int k=0;k<3;k++)sum+=dp[i][k][n];
				if(sum==0||goal==0)System.out.println("0.00000000");
				else System.out.printf("%.8f\n",goal/sum);
			}
		}
		class Point{
			int x,y;
			public Point(int x,int y) {
				this.x = x;
				this.y = y;
			}
		}

	}


}