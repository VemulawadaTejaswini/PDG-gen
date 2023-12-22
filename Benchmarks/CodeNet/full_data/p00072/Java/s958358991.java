
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	static class Lan implements Comparable<Lan>{
		int a, dis;
		Lan(int a,int dis){
			this.a=a;
			this.dis=dis;
		}
		public int compareTo(Lan l) {
			return this.dis-l.dis;
		}
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int n=sc.nextInt();
				if(n==0) break;
				int m=sc.nextInt();
				PriorityQueue<Lan> pq=new PriorityQueue<Lan>();
				boolean [] visit=new boolean[n];
				int[][] lon=new int[n][n];
				int[] distance = new int[n];
				int INF=10000000;
				Arrays.fill(distance, INF);
				for(int i=0; i<m; i++) {
					String s=sc.next();
					String[] tokens=s.split(",");
					int a=Integer.parseInt(tokens[0]);
					int b=Integer.parseInt(tokens[1]);
					int d=Integer.parseInt(tokens[2]);
					lon[a][b]=lon[b][a]=d;
				}
				pq.add(new Lan(0, 0));
				int ans=0;
				while(!pq.isEmpty()) {
					Lan lan=pq.poll();
					if(visit[lan.a]) continue;
					//System.out.println(lan.a+" "+lan.dis);
					visit[lan.a]=true;
					if(lan.dis>0)ans+=lan.dis/100-1;
					boolean tf=true;
					for(int i=0; i<n; i++) {
						if(lon[lan.a][i]>0) {
							pq.add(new Lan(i, lon[lan.a][i]));
						}
					}
				}
				System.out.println(ans);
				
			}
			

		}
	}
}
