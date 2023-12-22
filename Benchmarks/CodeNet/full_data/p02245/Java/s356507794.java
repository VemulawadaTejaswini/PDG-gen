import java.util.*;

public class Main{
	
	Scanner sc = new Scanner(System.in);
	
	final int N = 3;
	int[][] board;
	String ans = "123456780";
    int count = 0;
    int[] dy = {1, 0, -1, 0};
    int[] dx = {0, 1, 0, -1};
    
	
	Queue<Pazzle> Q = new LinkedList<Pazzle>();
    HashSet<String> H = new HashSet<String>();
	
	class Pazzle{
		int y, x;
		int[][] board;
		Pazzle(int y, int x, int[][] board){
			this.y = y;
			this.x = x;
			this.board = new int[N][N];
			for(int i=0; i<N; i++) { for(int j=0; j<N; j++) { this.board[i][j] = board[i][j]; } }
		}
		
		Pazzle(Pazzle p){
			this.y = p.y;
			this.x = p.x;
			board = new int[N][N];
			for(int i=0; i<N; i++) { for(int j=0; j<N; j++) { board[i][j] = p.board[i][j]; } }
		}
		
		public String getString() {
			String str = "";
			for(int i=0; i<N; i++) { for(int j=0; j<N; j++) { str += Integer.toString(board[i][j]); } }
			return str;
		}
		
		public void swap(int ny, int nx) {
			int tmp = board[y][x];
			board[y][x] = board[ny][nx];
			board[ny][nx] = tmp;
			y = ny;
			x = nx;
		}
		
		public void printBoard() {
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) { System.out.print(board[i][j]+" "); }
				System.out.println();
			}
			System.out.println();
		}
	}
	
	public void solve() {
		board = new int[N][N];
		int y = 0, x = 0;
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				board[i][j] = sc.nextInt();
				if(board[i][j] == 0) { y = i; x = j; }
			}
		}
		
        Q.add(new Pazzle(y,x,board));
        
        while( !Q.isEmpty() ) {
        		int length = Q.size();
        		for(int i=0; i<length; i++) {
        			Pazzle p = Q.poll();
        			String str = p.getString();
        			if( str.equals(ans) ) { System.out.println(count); return; }
        			H.add(str);
        			
        			for(int j=0; j<4; j++) {
        				int ny = p.y + dy[j];
        				int nx = p.x + dx[j];
        				if(ny>=0 && nx>=0 && ny<N && nx<N) {
        					Pazzle np = new Pazzle(p);
        					np.swap(ny, nx);
        					if( H.contains( np.getString() ) ) { continue; }
        					Q.add(np);
        				}
        			}
        		}
        		count++;
        }
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.solve();
	}
}
