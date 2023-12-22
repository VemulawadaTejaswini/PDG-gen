import java.util.*;
import java.math.BigInteger;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			map = new ArrayList<ArrayList<Edge>>();
			for(int i=0;i<n;i++){
				ArrayList<Edge> tmp = new ArrayList<Edge>();
				for(int j=0;j<2;j++){
					int to = sc.nextInt();
					int cost = sc.nextInt();
					tmp.add(new Edge(to,cost));
				}
				map.add(tmp);
			}

			boolean[] used = new boolean[n];
			BigInteger ans = BigInteger.ONE;
			for(int i=0;i<n;i++){
				if(!used[i]){
					max = 0;
					ans = ans.multiply(new BigInteger(Integer.toString(solve(i,used)/2)));
				}
			}

			System.out.println(ans.mod(new BigInteger("10007")));
		}
	}

	private static int max;
	private static ArrayList<ArrayList<Edge>> map;

	private static int solve(int now,boolean[] used){
		used[now] = true;

		int res = 0;
		for(Edge e : map.get(now)){
			max = Math.max(max,e.cost);
			if(!used[e.to]) res += solve(e.to,used);
		}

		for(Edge e : map.get(now)){
			if(max == e.cost){
				res++;
			}
		}
		return res;
	}
}

class Edge{
	int to,cost;

	Edge(int to,int cost){
		this.to = to;
		this.cost = cost;
	}
}