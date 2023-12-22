import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Provident Housewife
public class Main{

	int[][] memo;
	int[][] d;
	int n;
	
	int get(int s, int last){
		if(memo[s][last]!=1<<29)return memo[s][last];
		int c = 0;
		for(int i=0;i<=n;i++)if((s>>i&1)>0)c++;
		if(c<=1)return memo[s][last] = 0;
		int min = 1<<29;
		for(int i=0;i<=n;i++){
			if((s>>i & 1)==0 || i==last)continue;
			min = Math.min(min, d[i][last]+get(s-(1<<last), i));
		}
		return memo[s][last] = min;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			if(n==0)break;
			Map<String, Integer> ref = new HashMap<String, Integer>();
			int[][] s = new int[n+1][];
			int[][] p = new int[n+1][1000];
			int[] num = new int[n+1];
			int ID = 0;
			for(int i=1;i<=n;i++){
				num[i] = sc.nextInt();
				s[i] = new int[num[i]];
				Arrays.fill(p[i], 1<<29);
				for(int j=0;j<num[i];j++){
					String item = sc.next();
					int id = -1;
					if(ref.containsKey(item))id = ref.get(item);
					else{
						id = ID;
						ref.put(item, ID++);
					}
					p[i][id] = sc.nextInt();
				}
			}
			int q = sc.nextInt();
			int[] need = new int[q];
			boolean enable = true;
			for(int i=0;i<q;i++){
				String item = sc.next();
				if(!ref.containsKey(item)){
					enable = false;
				}
				if(!enable)continue;
				need[i] = ref.get(item);
			}
			d = new int[n+1][n+1];
			for(int i=0;i<=n;i++)Arrays.fill(d[i], 1<<29);
			for(int i=0;i<=n;i++)d[i][i] = 0;
			int m = sc.nextInt();
			for(int i=0;i<m;i++){
				int a = sc.nextInt();
				int b = sc.nextInt();
				int dist = sc.nextInt();
				d[a][b] = d[b][a] = dist;
			}
			if(!enable){
				System.out.println("impossible");continue;
			}
			int[][] dp = new int[q][n+1];
			for(int i=0;i<q;i++)Arrays.fill(dp[i], 1<<29);
			for(int i=1;i<=n;i++)dp[0][i] = Math.min(dp[0][i-1], p[i][need[0]]);
			for(int i=1;i<q;i++){
				for(int j=1;j<=n;j++){
					dp[i][j] = Math.min(dp[i][j-1], dp[i-1][j-1] + p[j][need[i]]);
				}
			}
//			System.out.println("Price map");
//			for(int i=1;i<=n;i++)for(int j=0;j<q;j++)System.out.print(p[i][need[j]]+(j==q-1?"\n":" "));
//			System.out.println("DP");
//			for(int i=0;i<q;i++)for(int j=1;j<=n;j++)System.out.print(dp[i][j]+(j<n?" ":"\n"));
			int optimal = dp[q-1][n];
			memo = new int[1<<(n+1)][n+1];
			for(int i=0;i<1<<(n+1);i++)Arrays.fill(memo[i], 1<<29);
			int min = 1<<29;
			int[] price = new int[1<<(n+1)];
			for(int i=0;i<1<<(n+1);i++){
				int sum = 0;
				for(int j=0;j<q;j++){
					int mm = 1<<24;
					for(int k=1;k<=n;k++){
						if((i>>k&1)==0)continue;
						mm = Math.min(mm, p[k][need[j]]);
					}
					sum += mm;
				}
				price[i] = sum;
			}
			int[][] wf = new int[n+1][n+1];
			for(int i=0;i<=n;i++)for(int j=0;j<=n;j++)wf[i][j] = d[i][j];
			for(int k=0;k<=n;k++){
				for(int i=0;i<=n;i++){
					for(int j=0;j<=n;j++){
						wf[i][j] = Math.min(wf[i][j], wf[i][k]+wf[k][j]);
					}
				}
			}
//			for(int i=0;i<=n;i++)for(int j=0;j<=n;j++)System.out.print(wf[i][j] + (j<n?" ":"\n"));
			for(int i=0;i<1<<(n+1);i++){
				for(int j=1;j<=n;j++){
					if((i>>j&1)==0|| (i&1)==0)continue;
					int x = get(i, j) + wf[j][0];
					if(x>=1<<24)continue;
//					if(price[i]==optimal)
//					System.out.println("GET:" + get(i, j) + " WF:" + wf[j][0] + " X:" + x +" I:" + i + " Last:" + j);
					if(price[i]==optimal)min = Math.min(min, x);
				}
			}
			System.out.println(optimal+" "+min);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}