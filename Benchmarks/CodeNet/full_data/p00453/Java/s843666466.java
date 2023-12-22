import java.util.*;

public class Main{
	int INF = 1 << 30;
	
	class C{
		int x, d;

		public C(int x, int d) {
			this.x = x;
			this.d = d;
		}

		public String toString() {
			return "C [x=" + x + ", d=" + d + "]";
		}
		
	}
	
	//0250 cording
	//0319 cording end
	private void doit(){
		Scanner sc = new Scanner(System.in);
		final int collength = 10;
		ArrayList<ArrayList<C>> data = new ArrayList<ArrayList<C>>();
		final int MMAX = (150+1)/2 + 1;
		long [][][] dp = new long[150][collength][MMAX];
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m) == 0) break;
			data.clear();
			for(int i = 0; i < 150; i++){
				for(int j = 0; j < collength; j++){
					Arrays.fill(dp[i][j], INF);
				}
			}
			int maxcol = 0;
			for(int i = 0; i < n; i++){
				int k = sc.nextInt();
				data.add(new ArrayList<C>());
				for(int j = 0; j < k; j++){
					int x = sc.nextInt() - 1;
					int d = sc.nextInt();
					data.get(i).add(new C(x,d));
					maxcol = Math.max(maxcol, x);
				}
			}
			
			for(int i = 0; i < data.get(0).size(); i++){
				dp[0][i][m] = 0;
			}
			
			for(int i = 0; i < n-1; i++){
				for(int j = 0; j < data.get(i).size(); j++){
					for(int k = 0; k <= m; k++){
						if(dp[i][j][k] == INF)continue;
						
						for(int jumpoffset = 1; jumpoffset <= 2; jumpoffset++){
							int nexty= i + jumpoffset;
							if(nexty >= n){
								continue;
							}
							int kValue = k - jumpoffset + 1;
							if(kValue < 0) continue;
							for(int normalind= 0; normalind < data.get(nexty).size(); normalind++){
								long diff = Math.abs(data.get(i).get(j).x - data.get(nexty).get(normalind).x);
								long slip = data.get(i).get(j).d + data.get(nexty).get(normalind).d;
								long value1 = slip * diff;
								long value2 = dp[i][j][k] + value1;
								dp[nexty][normalind][kValue] = Math.min(dp[nexty][normalind][kValue], value2);
							}
						}
					}
				}
			}
			long max = Integer.MAX_VALUE;
			for(int i = 0; i < data.get(n-1).size(); i++){
				for(int j = 0; j <= m; j++){
					max = Math.min(max, dp[n-1][i][j]);
				}
			}
			for(int i = 0; i < data.get(n-2).size(); i++){
				for(int j = 1; j <= m; j++){
					max = Math.min(max, dp[n-2][i][j]);
				}
			}
			//System.out.print("ans = ");
			System.out.println(max);
			
			//debug
			
//			for(int k = 0; k <= m; k++){
//				System.out.println("k= " + k);
//				for(int i = 0; i < n; i++){
//					for(int j = 0; j < data.get(i).size(); j++){
//						System.out.print(dp[i][j][k] + " ");
//					}
//					System.out.println();
//				}
//			}
			
		}
	}

	public static void main(String[]args){
		new Main().doit();
	}
	
}