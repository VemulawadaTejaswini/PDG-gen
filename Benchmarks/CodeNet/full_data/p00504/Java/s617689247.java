import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static class Place{
		int x, y;

		public Place(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		@Override
		public int hashCode() {
			final int prime = 97;
			int result = 1;
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Place other = (Place) obj;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}
	}
	
	public static class State{
		int x, y, k;
		Set<Place> visited;
		
		public State(int x, int y, int k, Set<Place> visited) {
			super();
			this.x = x;
			this.y = y;
			this.k = k;
			this.visited = visited;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + k;
			result = prime * result
					+ ((visited == null) ? 0 : visited.hashCode());
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			State other = (State) obj;
			if (k != other.k)
				return false;
			if (visited == null) {
				if (other.visited != null)
					return false;
			} else if (!visited.equals(other.visited))
				return false;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}
	}
	
	public static int[] dx = new int[]{1, 0, -1,  0};
	public static int[] dy = new int[]{0, 1,  0, -1};
	
	public static int H;
	public static int W;
	public static Map<State, Integer> memo;
	public static char[][] field;
	
	public static int solve(int cur_x, int cur_y, int k, Set<Place> visited){
		State state = new State(cur_x, cur_y, k, visited);
		
		if(memo.get(state) != null){
			return memo.get(state);
		}
		
		int res = Integer.MIN_VALUE;
		
		if(cur_x == W - 1 && cur_y == H - 1){
			res = 0;
		}
		
		for(int d = 0; d < 4; d++){
			int xx = cur_x + dx[d];
			int yy = cur_y + dy[d];
			int kk = k - (d >= 2 ? 1 : 0);
			
			if(xx < 0 || xx >= W || yy < 0 || yy >= H || kk < 0 || field[yy][xx] == '#'){
				continue;
			}
			
			HashSet<Place> vv = new HashSet<Place>();
			for(Place place : visited){
				if(Math.max(xx - place.x, 0) + Math.max(yy - place.y, 0) <= kk){
					vv.add(place);
				}
			}
			
			if(field[yy][xx] != '.'){
				vv.add(new Place(xx, yy));
			}
			
			int val = (field[yy][xx] != '.' ? field[yy][xx] - '0' : 0);
			for(Place place : visited){
				if(place.x == xx && place.y == yy){
					val = 0;
				}
			}
			
			res = Math.max(res, solve(xx, yy, kk, vv) + val);
		}
		
		memo.put(state, res);
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		H = sc.nextInt();
		W = sc.nextInt();
		final int K = sc.nextInt();
		
		field = new char[H][W];
		
		for(int i = 0; i < H; i++){
			char[] input = sc.next().toCharArray();
			
			for(int j = 0; j < W; j++){
				field[i][j] = input[j];
			}
		}
		
		memo = new HashMap<State, Integer>();
		
		System.out.println(solve(0,0,K,new HashSet<Place>()));
	}

}