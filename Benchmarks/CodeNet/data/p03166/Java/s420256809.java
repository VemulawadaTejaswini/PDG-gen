	import java.util.*;
	import java.io.*;
import java.lang.reflect.Array;
	public class Main {
		static int n,m;
		static ArrayList<ArrayList<Integer>> g;
		static int dp[],l1,l2;
		static boolean cj;
		public static void main(String[] args) throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int t=1;
	//		Integer.parseInt(br.readLine().trim());
			StringBuilder printans=new StringBuilder();
			while(t-->0)
			{
				StringTokenizer tok=new StringTokenizer(br.readLine()," ");
				n=Integer.parseInt(tok.nextToken());
				m=Integer.parseInt(tok.nextToken());
				g=new ArrayList<>();
				for(int i=0;i<=n;i++) {
					g.add(new ArrayList<>());
				}
				while(m-->0) {
					tok=new StringTokenizer(br.readLine()," ");
					int a=Integer.parseInt(tok.nextToken());
					int b=Integer.parseInt(tok.nextToken());
					addedge(a,b);
					
				}
				dp=new int[n+1];
				boolean vis[]=new boolean[n+1];
				int ans=0;
				for(int i=0;i<=n;i++) {
					cj=false;
						if(!vis[i]) {
							findans(i,0,vis);
						}
						
				}
				int ans2=0;
				for(int i:dp) {
					ans2=Math.max(ans2, i);
//					System.out.print(i+" ");
				}
				System.out.println(ans2);

			}
			
			
		}
		static void addedge(int a,int b) {
			g.get(a).add(b);
			
		}
		static void findans(int curr,int j,boolean vis[]) {
			vis[curr]=true;
			int ans=0;
			for(int i=0;i<g.get(curr).size();i++) {
				if(!vis[g.get(curr).get(i)]) {
//					
					findans(g.get(curr).get(i),j+1,vis);
					
				}
				dp[curr]=Math.max(dp[curr],dp[g.get(curr).get(i)]+1);
			}
			
				
				
			
			
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		static void memset() {
//			for(int a[]:dp) {
//				Arrays.fill(a,-1);
//			}
//		}
		
			
	}
