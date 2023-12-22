import java.util.Scanner;

public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int k = sc.nextInt();
			if(k==0)break;
			char[] str = sc.next().toCharArray();
			int[] s = new int[k];
			int[] d = new int[k];
			for(int i=0;i<k;i++)s[i]=str[i]-'0';
			str = sc.next().toCharArray();
			for(int i=0;i<k;i++)d[i]=str[i]-'0';
			int[] r = new int[k];
			for(int i=0;i<k;i++)r[i] = (d[i]-s[i]+10)%10;
			int[][][] dp = new int[k][k][10];
			for(int i=0;i<k;i++){
				for(int x=0;x<10;x++){
					dp[i][i][x] = r[i]==x?0:1;
//					System.out.println("I:" + i + " X:" + x + " R:" + r[i] + " DP:" + dp[i][i][x]);
				}

			}
			for(int w=1;w<k;w++){
				for(int i=0;i+w<k;i++){
					int j = i+w;
					for(int x=0;x<10;x++){
						int min = 1<<28;
						for(int m=i;m+1<=j;m++){
//							System.out.println(i+"-"+m + " " + (m+1)+"-"+j);
							for(int x1=0;x1<10;x1++){
								for(int x2=0;x2<10;x2++){
									int step = 0;
									if(x1==x2){
										if(x1==x)step = dp[i][m][x1]+dp[m+1][j][x2];
										else step = dp[i][m][x1]+dp[m+1][j][x2]+1;
									}
									else{
										if(x1==x||x2==x)step = dp[i][m][x1]+dp[m+1][j][x2]+1;
										else step = dp[i][m][x1]+dp[m+1][j][x2]+2;
									}
//									System.out.println("step:" + step + " x1:" + x1 + " x2:" + x2);
									min = Math.min(min, step);
								}
							}
						}
						dp[i][j][x] = min;
//						System.out.println(i+"-"+j+" DP:"+dp[i][j][x] + " X:" + x);
					}
				}
			}
			System.out.println(dp[0][k-1][0]);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}