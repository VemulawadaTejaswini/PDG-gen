import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Main {
	static class State{
		int h;
		int w;
		int r;
		public State(int h , int w , int r) {
			this.r = r;
			this.h = h;
			this.w = w;
		}
		@Override
		public int hashCode() {
			int x = h + 80 * w;
			int y = r;
			return x * 80 + y;
		}
		@Override
		public String toString() {
			return h + " "+ w + " " + r;
		}
		@Override
		public boolean equals(Object obj) {
			State s2 = (State) obj;
			return this.r == s2.r && this.h == s2.h && this.w == s2.w;
		}
	}
	static int solve(int H, int W , int[][] R , int[][] B){
		Stack<State> q = new Stack<State>();
		int ret = 10000;
		q.add(new State(0 , 0 , 0));
		Set<State> vis = new HashSet<State>();
		while(!q.isEmpty()){			
			State s = q.pop();
			int diff = Math.abs(B[s.h][s.w] - R[s.h][s.w]);
			int d1 = s.r + diff;
			int d2 = Math.max(s.r - diff , diff - s.r);
			if(s.h == H - 1 && s.w == W - 1){
				int d = Math.min(Math.abs(d1), Math.abs(d2));
				ret = Math.min(ret, d);
			}else{				
				if(s.h < H - 1){				
					State ns = new State(s.h + 1 , s.w , d1 );					
					add(q, vis, ns);						
					ns = new State(s.h + 1 , s.w , d2);					
					add(q, vis, ns);						
				}
				if(s.w < W - 1){
					State ns = new State(s.h , s.w + 1, d1 );					
					add(q, vis, ns);						
					ns = new State(s.h, s.w + 1, d2);					
					add(q, vis, ns);						
				}
			}
		}
		return ret;
	}
	private static void add(Stack<State> q, Set<State> vis, State ns) {
		if(!vis.contains(ns)){
			vis.add(ns);
			q.add(ns);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int A[][] = new int[H][W];
		int B[][] = new int[H][W];
		loadMatrix(sc, H, W, A);
		loadMatrix(sc, H, W, B);
		int ret = solve(H , W , A , B);
		System.out.println(ret);
	}
	private static void loadMatrix(Scanner sc, int H, int W, int[][] A) {
		for(int i = 0 ; i < H ; ++i){
			for(int j = 0 ; j < W ; ++j){
				A[i][j] = sc.nextInt();
			}
		}
	}
}
