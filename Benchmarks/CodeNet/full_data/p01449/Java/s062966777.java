import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] cell = new int[n];
		for(int i=0; i<n; i++) cell[i] = in.nextInt();
		int[] dp = new int[n];
		final int INF = Integer.MAX_VALUE;
		for(int i=0; i<n; i++) dp[i] = INF;
		Queue<Pos> qu = new PriorityQueue<Pos>();
		qu.add(new Pos(0, 0));
		int res = INF;
		while(!qu.isEmpty()){
			Pos p = qu.poll();
			if(p.p >= n-1){
				res = p.turn;
				break;
			}
			if(dp[p.p] <= p.turn) continue;
			dp[p.p] = p.turn;
			if(cell[p.p] != 0){
				qu.add(new Pos(p.p+cell[p.p], p.turn));
				continue;
			}
			for(int i=1; i<=6; i++){
				qu.add(new Pos(p.p+i, p.turn+1));
			}
		}
		System.out.println(res);
	}
}

class Pos implements Comparable<Pos>{
	int turn;
	int p;
	Pos(int p, int turn){
		this.p = p;
		this.turn = turn;
	}
	@Override
	public int compareTo(Pos o) {
		return turn-o.turn;
	}
}