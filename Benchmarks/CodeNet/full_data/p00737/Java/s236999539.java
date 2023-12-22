import java.util.*;
import java.awt.Point;
import static java.lang.Math.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int w = sc.nextInt(), h = sc.nextInt();
			if(w==0 && h==0) break;

			int[][] map = new int[h][w];
			int[] cost = new int[4];

			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					map[i][j] = sc.nextInt();
				}
			}
			for(int i=0;i<4;i++){
				cost[i] = sc.nextInt();
			}

			State st = null;
			Queue<State> open = new PriorityQueue<State>();
			Map<State, State> closed = new HashMap<State, State>();

			open.add(new State(0,new Robot(1,0,0)));

			int ans = Integer.MAX_VALUE;
			while(!open.isEmpty()){
				st = open.poll();
				if(closed.get(st) != null) continue;
				closed.put(st, st);
				if(st.ans(w,h)){
					ans = st.cost;
					break;
				}
				open.addAll(st.nexts(map,cost));
			}
			System.out.println(ans);
		}
	}
}

class State implements Comparable< State >{
	int cost;
	Robot robot;

	public State(int cost, Robot robot){
		this.cost = cost;
		this.robot = robot;
	}

	public List<State> nexts(int[][] map, int cost[]){
		List<State> next = new ArrayList<State>();
		int turn = map[this.robot.p.y][this.robot.p.x];

		for(int i=0;i<4;i++){
			Robot r = this.robot.copy();
			if(r.move(i,map)){
				int c = this.cost;
				if(turn != i){
					c += cost[i];
				}
				next.add(new State(c, r));
			}
		}

		return next;
	}

	public boolean ans(int w, int h){
		if(robot.p.x == w-1 && robot.p.y == h-1)
			return true;
		else
			return false;
	}

	public int compareTo(State st){
		return this.cost - st.cost;
	}

	public boolean equals(Object anObject){
		State st = (State)anObject;
		return this.robot.p.equals(st.robot.p) && this.robot.d==st.robot.d;
	}

	public int hashCode(){
		return robot.p.x + robot.p.y;
	}
}

class Robot{
	int d;
	Point p;

	public Robot(int d, int x, int y){
		this.d = d;
		this.p = new Point(x,y);
	}

	public boolean move(int turn, int[][] map){
		int w = map[0].length;
		int h = map.length;

		d = (d+turn) % 4;

		switch(d){
		case 0: p.y--; break;
		case 1: p.x++; break;
		case 2: p.y++; break;
		case 3: p.x--; break;
		}

		if(p.x < 0) return false;
		if(p.x >= w) return false;
		if(p.y < 0) return false;
		if(p.y >= h) return false;

		return true;
	}

	public Robot copy(){
		Robot copy = new Robot(d, p.x, p.y);
		return copy;
	}
}