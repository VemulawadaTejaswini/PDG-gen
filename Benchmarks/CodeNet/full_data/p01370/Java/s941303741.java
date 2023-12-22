import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main{

	int dy[] = {1,0,-1,-1,0,1};
	int dx[] = {0,-1,-1,0,1,1};

	class Position{
		int x, y;
		Position(int _x, int _y){
			this.x = _x;
			this.y = _y;
		}
		
		public boolean equals(Object a){
			return a instanceof Position && ((Position)a).x == this.x && ((Position)a).y == this.y;
		}
		
		public int hashCode(){
			return java.util.Arrays.hashCode(new int[]{this.x, this.y});
		}
	}

	class State{
		int x, y, dist;
		State(int _x, int _y, int _d){
			this.x = _x;
			this.y = _y;
			this.dist = _d;
		}
	}

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			int t = in.nextInt(), n = in.nextInt();
			if(n==0 && t==0) return ;
			Set<Position> blocks = new HashSet<Position>();
			for(int i=0; i<n; i++){
				blocks.add(new Position(in.nextInt(), in.nextInt()));
			}
			Position start = new Position(in.nextInt(), in.nextInt());
			System.out.println(solve(blocks, t, start));
		}
	}

	int solve(Set<Position> blocks, int t, Position start){
		Set<Position> visited = new HashSet<Position>();
		visited.add(start);
		Queue<State> que = new LinkedList<State>();
		que.add(new State(start.x, start.y, 0));
		while(!que.isEmpty()){
			State tp = que.poll();
			Position cur = new Position(tp.x, tp.y);
			int dist = tp.dist;
			if(dist >= t){
				continue;
			}
			for(int k=0; k<6; k++){
				Position next = new Position(cur.x + dx[k], cur.y + dy[k]);
				if(!visited.contains(next) && !blocks.contains(next)){
					visited.add(next);
					que.add(new State(next.x, next.y, dist + 1));
				}
			}
		}
		return  visited.size();
	}

	public static void main(String[] args){
		new Main().run();
	}
}