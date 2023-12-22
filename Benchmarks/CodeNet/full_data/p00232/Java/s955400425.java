import java.util.Scanner;
class Main {
	double[][] dp;
	int[] v;
	int[][] event;
	int x,y,z;
	
	public static void main(String args[]){
		Main app = new Main();
		Scanner scan = new Scanner(System.in);
		while(true){
			app.x = scan.nextInt();
			app.y = scan.nextInt();
			app.z = scan.nextInt();
			if(app.x==0 && app.y==0 && app.z==0){
				break;
			}
			app.v = new int[app.x];
			for(int i=0;i<app.x;i++){
				app.v[i] = scan.nextInt();
			}	
			app.event = new int[app.y+1][2];
			for(int i=0;i<app.z;i++){
				int tmp = scan.nextInt();
				app.event[tmp][0] = scan.nextInt();
				app.event[tmp][1] = scan.nextInt();
			}
			app.dp = new double[app.y+1][5001];
			System.out.println(app.LifeGame());
		}
	}
	
	public int LifeGame(){
		dp[0][0] = 1;
		
		for(int i=0;i<y+1;i++){
			for(int j=0;j<5001;j++){
				if(dp[i][j]>0){
					for(int k=0;k<x;k++){
						if(i!=y){
							int num = i+v[k];
							if(num>y){
								num = y;
							}
							int money = j;
							switch(event[num][0]){
							case 1:
								num+=event[num][1];
								if(num>y){
									num = y;
								}
								break;
							case 2:
								money = j+event[num][1];
								break;
							case 3:
								money = j-event[num][1];
								if(money<0){
									money = 0;
								}
								break;
							}
							dp[num][money] += dp[i][j]/x;
						}
					}
				}
			}
		}
		double exp=0;
		for(int i=0;i<5001;i++){
			exp += dp[y][i]*i;
		}
		
		return (int)Math.ceil(exp);
	}
}