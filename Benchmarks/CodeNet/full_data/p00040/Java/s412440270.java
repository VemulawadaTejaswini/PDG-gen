import java.awt.geom.Point2D;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class Main {	
	Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		int n = in.nextInt();
		for(int i=0;i<n;i++)new AOJ0040();
		
		
	}

	class AOJ0040{
		
		char mojiHenkan(int y,int a,int b){
			int c = (a*y+b)%26;
			String result = toChar.get(c);
			return result.charAt(0);
		}
		
		String doit(String input,int a, int b){
			String result = "";
			for(int i=0;i<input.length();i++){
				if(input.charAt(i)==' '){
					result += " ";
					continue;
				}
				result+=mojiHenkan(toNum.get(input.charAt(i)+""), a, b);
			}
			return result;
		}
		HashMap<String,Integer> toNum;
		HashMap<Integer, String> toChar;
		public AOJ0040() {
			toNum = new HashMap<String, Integer>();
			toChar = new HashMap<Integer, String>();
			String[] moji= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o",
					"p","q","r","s","t","u","v","w","x","y","z"};
			for(int i=0;i<26;i++){
				toNum.put(moji[i],i);
				toChar.put(i,moji[i]);
			}
			String k = in.next();
			String input = in.nextLine();
			input= k+input;
			String result = "";
			while(true){
				boolean sw1 = false;
				for(int a=0;;a++){
					boolean sw = false;
//					if(a%26==0||26%a==0)continue;
					for(int b=0;b<26;b++){
						result = doit(input, a, b);
//						System.out.println(result+" a="+a+" b="+b);
						if(result.matches(".*that.*")||result.matches(".*this.*")){
							sw=true;
							sw1 = true;
							break;
						}
					}
					if(sw)break;
				}
				if(sw1)break;
			}
			System.out.println(result);
		}
	}
	
	class AOJ0097{
		int n,m;
		public AOJ0097() {
			while(true){
				n = in.nextInt();//フェーズ数
				m = in.nextInt();//最終的な目標数値
				if(n+m==0)break;
				int[][] dp = new int[1001][n];
				for(int i=0;i<100;i++)dp[i][0]=1;
				for(int s=0;s<n-1;s++){
					for(int i=0;i<1001;i++){
						for(int k=0;k<=100;k++){
							
						}
					}
				}
				
				
				
				
				
				
				
				
				
				
				for(int i=0;i<1001;i++){
					for(int s=0;s<n;s++)System.out.print(dp[i][s]);
					System.out.println();
				}
				
				
				
				
				
				
				
			}
			
			
			
			
			
		}
	}
	
	
	
	class AOJ0112{
		public AOJ0112() {
			ArrayList<Integer> list = new ArrayList<Integer>();
			while(true){
				int n = in.nextInt();
				if(n==0)break;
				list.add(n);
			}
			Collections.sort(list);
			for(int i=0;i<list.size();i++)System.out.println(list.get(i));
			
			
			
			
			
			
			
		}
	}
	
	class AOJ0106{
		int n;
		int bfs(int kei,int kin){
			if(kei>=n)return kin;
			int[] ryou = {200,300,500};
			int[] kakaku = {380,550,850};
			int[] tani = {5,4,3};
			double wari[] = {0.8,0.85,0.88};
			int result = Integer.MAX_VALUE/2;
			if(n-kei>=1000)for(int i=0;i<3;i++){
				double kane = (kakaku[i]*tani[i])*wari[i];
				int souryou = ryou[i]*tani[i];
				result = Math.min(result,bfs(souryou+kei,(int)kane+kin));
			}else for(int i=0;i<3;i++){
				result = Math.min(result,bfs(kei+ryou[i],kin+kakaku[i]));
			}
			return result;
		}
		public AOJ0106() {
			while(true){
				n = in.nextInt();
				if(n==0)break;
				System.out.println(bfs(0,0));
				
				
				
				
			}
		}
		
		
		
	}
	
	class AOJ2503{
		int MAX = 0;
		public AOJ2503() {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int m = in.nextInt();

			int[][] cost = new int[n][n];

			int[] dp = new int[n];
			for(int i=0;i<n*n;i++){
				cost[i/n][i%n]=MAX;
			}
			for(int i=0;i<m;i++){
				int a = in.nextInt();
				int b = in.nextInt();
				cost[a][b]=in.nextInt();
			}	
			//			TODO 一番大きいパスを0のポイントからn-1のポイントまでの

			for(int s=1;s<n;s++){
				for(int i=0;i<=s;i++){
					if(cost[i][s]==MAX)continue;
					dp[s]=Math.max(dp[s],dp[i]+cost[i][s]);
				}
			}
			for(int s=0;s<n;s++)for(int i=0;i<n;i++){
				if(cost[s][i]==MAX)continue;
				dp[i]=Math.max(dp[s]+cost[s][i],dp[i]);
			}
			for(int i=0;i<n;i++)System.out.print(dp[i]+" ");
			System.out.println();
			System.out.println(dp[n-1]);
		}
	}



	class  AOJ0155{
		int n;
		Building[] build;
		double[][] cost;
		double Max;
		int[] list;
		void dijkstra(int s,int g){
			list = new int[n];
			double[] d = new double[n];
			boolean used[] = new boolean[n];
			Arrays.fill(d,Max);
			Arrays.fill(used, false);
			d[s] = 0;
			int v=-1;
			while(true){
				int before = v;
				v=-1;
				for(int u=0;u<n;u++)if(!used[u]&&(v==-1||d[u]<d[v]))v=u;//まだ使われていない頂点のうち最小のものを探す
				if(v==-1)break;
				System.out.println(v);
				list[v] = before;//前の頂点を記憶
				if(v==g)break;
				used[v]=true;//行き先は頂点v
				for(int u=0;u<n;u++){
					d[u] = Math.min(d[u],d[v]+cost[v][u]);
				}
			}
		}
		ArrayList<Integer> list2;
		
		void bfs(int g){
			System.out.println(g);
			list2.add(build[g].ban);
			if(list[g]==-1)return;
			bfs(list[g]);
			return;
		}
		
		public AOJ0155() {
			Max = Double.MAX_VALUE;
			while(true){
				n = in.nextInt();
				if(n==0)break;
				cost = new double[n][n];
				build = new Building[n];
				for(int i=0;i<n;i++){
					int ban = in.nextInt();
					int x = in.nextInt();
					int y = in.nextInt();
					build[i] = new Building(x, y, ban);
				}
				
				for(int s=0;s<n;s++){
					for(int i=0;i<n;i++){
						cost[s][i] =  Math.hypot(build[s].x-build[i].x, build[s].y-build[i].y);
						cost[s][i] = cost[s][i]>50? Max:cost[s][i]; 
						cost[i][s]=cost[s][i];
					}
				}
				
				//costデバック
//				double rei = 0;
//				for(int i=0;i<n;i++){
//					for(int s=0;s<n;s++)if(cost[i][s]!=Max)System.out.printf("%5f ",cost[i][s]);
//					else System.out.printf("%5f",rei);
//					System.out.println();
//				}
				//ここまでデバック
				
				int k = in.nextInt();
				for(int i=0;i<k;i++){
					int from = in.nextInt();
					int goal = in.nextInt();
					dijkstra(from-1,goal);
					list2 = new ArrayList<Integer>();
					for(int s=0;s<n;s++)System.out.print(list[s]+" before    ");
					System.out.println();
					bfs(goal-1);
					for(int s=list2.size()-1;s>0;s--){
						System.out.print(list2.get(s)+" ");
					}
					System.out.println(list2.get(0));
				}
			}
		}
		
		class Building{
			int x,y,ban;
			public Building(int x,int y,int ban) {
				this.x = x;
				this.y = y;
				this.ban = ban;
			}
		}
		
	}
}