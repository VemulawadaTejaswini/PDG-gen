import java.util.*;


class Node{
	int id, cost, to, bad;

	public Node(int id, int cost, int to, int bad) {
		super();
		this.id = id;
		this.cost = cost;
		this.to = to;
		this.bad = bad;
	}
	
}

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		String s = sc.next();
		sc.close();
		
		Node dp[] = new Node[n+1];
		int INF = Integer.MAX_VALUE/2;
		for(int i=0;i<n+1;i++) {
			int bad = s.charAt(i) - '0'; 
			dp[i] = new Node(i, INF,-1, bad);
		}
		dp[n].cost = 0;
		
		Queue<Node> q = new PriorityQueue<>((p1,p2)->{
			if(p1.cost!=p2.cost) return p1.cost - p2.cost;
			return p1.id - p2.id;
		});
		
		
		q.offer(dp[n]);
		
		for(int i=n-1;i>=0;i--) {
			while(!q.isEmpty()&&(q.peek().bad == 1 || q.peek().id - i > m)) {
				q.poll();
			};
			if(q.isEmpty()) {
				System.out.println(-1);
				return;
			}
			if(dp[i].bad==1)continue;
			dp[i].cost = q.peek().cost+1;
			dp[i].to = q.peek().id;
			q.offer(dp[i]);
		}
		
		StringBuilder sb = new StringBuilder();
		int now = 0;
		while(dp[now].to != -1) {
			int to = dp[now].to;
			int dist = to - now;
			sb.append(dist + " ");
			now = to;
		}
		System.out.println(sb.toString());
	}
}
