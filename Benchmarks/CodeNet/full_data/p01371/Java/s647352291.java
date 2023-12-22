import java.util.BitSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static int n;
	public static int[][] map;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			n = in.nextInt();
			if(n == 0) return;
			map = new int[n][n+1];
			int bitmax = 1<<n;
			for(int i=0; i<n; i++){
				for(int j=0; j<=n; j++){
					map[i][j] = in.nextInt();
				}
			}
			BitSet used = new BitSet(bitmax);
			Queue<State> qu = new PriorityQueue<State>();
			qu.add(new State(0, 0));
			while(!qu.isEmpty()){
				State s = qu.poll();
				if(used.get(s.bit)) continue;
				if(s.bit == bitmax-1){
					System.out.println(s.time);
					break;
				}
				used.set(s.bit);
				for(int i=0; i<n; i++){
					if((s.bit & 1<<i) > 0) continue;
					qu.add(new State(s.bit | 1<<i
							, s.time + best(s.bit, i)));
				}
			}
		}
	}
	
	public static int best(int used, int idx){
		int res = map[idx][0];
		for(int i=0; i<n; i++){
			if((used & 1<<i) == 0) continue;
			res = Math.min(res, map[idx][i+1]);
		}
		return res;
	}
}

class State implements Comparable<State>{
	int bit;
	int time;
//	int bc;
	public State(int bit, int time){
		this.bit = bit;
		this.time = time;
//		bc = Integer.bitCount(bit);
	}
	
	@Override
	public int compareTo(State o) {
//		if(bc != o.bc) return bc-o.bc;  
		return time-o.time;
	}
}