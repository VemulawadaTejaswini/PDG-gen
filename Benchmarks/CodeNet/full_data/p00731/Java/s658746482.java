import java.util.*;
import static java.lang.Math.*;

public class Main {

	int w, h;
	int[][] board;
	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			w = in.nextInt(); h = in.nextInt();
			if(w==0 && h==0) return ;
			board = new int[h][w];
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					String s = in.next();
					char c = s.charAt(0);
					if(Character.isDigit(c)){
						board[i][j] = c - '0';
					}
					else if(c == 'T'){
						board[i][j] = -1;
					}
					else if(c == 'S'){
						board[i][j] = -2;
					}
				}
			}
			System.out.println(solve());
		}
	}

	class State{
		int dist, x, y, foot;
		State(int _d, int _y, int _x, int _f){
			this.dist = _d;
			this.y = _y;
			this.x = _x;
			this.foot = _f;
		}
	}

	class Cmp implements Comparator<State>{
		public int compare(State a, State b){
			return a.dist>b.dist?1:a.dist<b.dist?-1:0;
		}
	}

	int solve(){
		PriorityQueue<State> Q = new PriorityQueue<State>(11,new Cmp())	;
		int[][][] dist = new int[2][h][w];
		for(int k=0; k<2; k++)
			for(int i=0; i<h; i++)
				for(int j=0; j<w; j++)
					dist[k][i][j] = -1;
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++)if(board[i][j] == -1){
				for(int k=0; k<2; k++)
					Q.add(new State(0,i,j,k));
			}
		}
		while(!Q.isEmpty()){
			State tp = Q.poll();
			if(dist[tp.foot][tp.y][tp.x] != -1) continue;
			dist[tp.foot][tp.y][tp.x] = tp.dist;
			for(int dx=1; dx<=3; dx++){
				for(int dy=-2; dy<=2; dy++)if(dx + abs(dy) <= 3){
					int ny = tp.y + dy, nx = tp.x + ((tp.foot==0)?dx:-dx);
					if(0<=ny && ny<h && 0<=nx && nx<w && board[ny][nx]!=0 && dist[1-tp.foot][ny][nx] == -1){
						Q.add(new State(tp.dist + (board[ny][nx]>0?board[ny][nx]:0), ny, nx, 1-tp.foot));
					}
				}
			}
		}
		
		int ret = 1<<20;
		for(int k=0; k<2; k++){
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					if(board[i][j] == -2 && dist[k][i][j] != -1 && ret > dist[k][i][j])
						ret = dist[k][i][j];
				}
			}
		}
		return ret==1<<20?-1:ret;
	}

	public static void main(String args[]){
		new Main().run();
	}
}