
import java.util.*;
public class Main {
	
	private static final double EPS = 1.0e-08;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			if((x|y|z) == 0) break;
			int [] xlist = new int[x];
			for(int i = 0; i < x; i++){
				xlist[i] = sc.nextInt();
			}
			
			int [][] elist = new int[y+1][3];
			for(int i = 0; i < z; i++){
				int n = sc.nextInt();
				int e = sc.nextInt();
				int a = sc.nextInt();
				elist[n][0] = e;
				elist[n][1] = a;
			}
			
			double [][] dp = new double[5001][y+1];
			dp[0][0] = 1;
			for(int i = 0; i < y; i++){
				for(int j = 0; j < 5001; j++){
					if(dp[j][i] <EPS)continue;
					for(int k = 0; k < xlist.length; k++){
						int xx = i + xlist[k];
						
						if(xx > y){
							xx = y;
						}
						
						if(elist[xx][0] == 0){
							dp[j][xx] += dp[j][i] * (1.0 / x);
						}
						else{
							if(elist[xx][0] == 1){
								//step
								int xxx = xx + elist[xx][1];
								if(xxx > y){
									xx = y;
								}
								dp[j][xxx] += dp[j][i] * (1.0 / x);
							}
							else {
								int mo = j;
								if(elist[xx][0] == 2){
									mo += elist[xx][1];
								}
								else{
									mo-= elist[xx][1];
									if(mo < 0)
										mo = 0;
								}
								
								dp[mo][xx] += dp[j][i] * (1.0 / x);
							}
						}
					}
				}
			}
			double ans = 0;
			for(int i = 0; i < 5001; i++){
				ans += dp[i][y] * i;
			}
			System.out.println((int)ans);
		}
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}