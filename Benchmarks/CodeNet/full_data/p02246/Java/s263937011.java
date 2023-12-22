import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
	static final int N = 4;
	static final int N2 = 16;
	static final int LIMIT = 100;
	
	static final int[] dx = {0, -1, 0, 1};
	static final int[] dy = {1, 0, -1, 0};
	static final char[] dir = {'r','u','l','d'};
	static int[][] MDT = new int[N2][N2];
	
	static Puzzle state;
	static int limit;
	static int[] path = new int[LIMIT];
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < N2 ;i++){
			for(int j = 0; j < N2 ; j++){
				MDT[i][j] = Math.abs(i/N - j/N) + Math.abs(i%N - j%N);
			}
		}
		
		Puzzle in = new Puzzle();
		
		
		for(int i = 0; i < N ; i++){
			String[] tmpArray = br.readLine().split(" ");
			
			for(int j = 0; j < N; j++){
				in.f[i*N + j] = Integer.parseInt(tmpArray[j]);
				if(in.f[i*N + j] == 0 ){
					in.f[i*N + j] = N2;
					in.space = i*N + j;
				}
			}
		}
//		
//		for(int i = 0; i < N2; i++){
//			System.out.print(in.f[i]+" ");
//		}
//		
		String ans = ID(in);
		//System.out.println(ans);
		System.out.println(ans.length());
	}
	
	static int getAllMD(Puzzle pz){
		int sum = 0;
		for(int i = 0; i < N2 ;i++){
			if(pz.f[i] == N2) continue;
			sum += MDT[i][pz.f[i] - 1];
			//System.out.println("index = "+(i + 1)+" MD += "+ MDT[i][pz.f[i] - 1]);
		}
		return sum;
	}
	
	static boolean isSolved() {
		for(int i = 0; i < N2; i++){
			if(state.f[i] != i + 1){
				return false;
			}
		}
		return true;
	}
	
	static boolean dfs(int depth, int prev){
		if(state.MD == 0){
			return true;
		}
		
		if( depth + state.MD > limit){
			return false;
		}
		
		int sx = state.space/N;
		int sy = state.space%N;
		Puzzle tmp;
		
		//System.out.println("sx "+sx+" sy "+sy);
		
		for(int r = 0; r < 4; r++){
			int tx = sx + dx[r];
			int ty = sy + dy[r];
			if(tx < 0 || ty < 0 || tx >= N || ty >= N){
				continue;
			}
			if(Math.max(prev, r) - Math.min(prev, r) == 2){
				continue;
			}
			//C++??¨?????£??????????????????????????¨????????????????????????
			tmp = new Puzzle();
			tmp.MD = state.MD;
			tmp.space = state.space;
			tmp.f = Arrays.copyOf(state.f, N2);
//			tmp = state;
			state.MD -= MDT[tx*N + ty][state.f[tx*N + ty] - 1];
			state.MD += MDT[sx*N + sy][state.f[tx*N + ty] - 1];
			int tmpf = state.f[tx*N + ty];
			state.f[tx*N + ty] = state.f[sx*N + sy];
			state.f[sx*N + sy] = tmpf;
			state.space = tx*N + ty;
			if(dfs(depth + 1, r)) {
				path[depth] = r;
				return true;
			}
//			state = tmp;
			state.MD = tmp.MD;
			state.space = tmp.space;
			state.f = Arrays.copyOf(tmp.f, N2);
		}
		
		return false;
			
	}
	
	static String ID(Puzzle in){
		in.MD = getAllMD(in);
		//System.out.println("MD = "+in.MD);
		
		for(limit = in.MD ; limit <= LIMIT ; limit++){
			state = in;
			if(dfs(0,-100)){
				String ans = "";
				for(int i = 0; i < limit ; i++){
					ans += dir[path[i]];
				}
				return ans;
			}
		}
		
		return "unsolvable";
	}

}

class Puzzle {
	int[] f = new int[Main.N2];
	int space;
	int MD;
}

