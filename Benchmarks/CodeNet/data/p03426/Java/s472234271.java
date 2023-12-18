import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(), W = sc.nextInt(), D = sc.nextInt();
		List<int[]> access= new ArrayList<int[]>();
		for(int i=0;i<=H*W;i++)access.add(null);
	
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				int num = sc.nextInt();
				int address[] = {i,j};
				access.set(num, address);
			}
		}
		int Q = sc.nextInt();
		int query[][] = new int[Q][2];
		for(int i=0;i<Q;i++) {
			query[i][0] = sc.nextInt();
			query[i][1] = sc.nextInt();
		}
		sc.close();

		int cost[][] = new int[D+1][H*W];
		
		for(int i=1;i<=D;i++) {
			cost[i][0]=0;
			int now = i;
			int next = 0;
			for(int j=0;j<H*W;j++) {
				next = now + D;
				if(next>H*W)break;
				int dist = Math.abs(access.get(next)[0]-access.get(now)[0])+Math.abs(access.get(next)[1]-access.get(now)[1]);
				cost[i][j+1]=cost[i][j]+dist;
				now = next;
			}
		}
		
		//answer
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<Q;i++) {
			int start = query[i][0], goal = query[i][1];
			int series = start%D==0 ? D:start%D;
			int ans = cost[series][(goal-series)/D]-cost[series][(start-series)/D];
			sb.append(ans + "\n");
		}
		System.out.println(sb.toString());
		
		
	}
}
