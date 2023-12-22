import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static char[][] field;
	static int H, W;
	static int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
	static List <int[]> q = new ArrayList<int[]>();
	static List <int[]> next = new ArrayList<int[]>();
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		H = sc.nextInt();
		W = sc.nextInt();
		if(H == 0 && W == 0)return false;
		
		field = new char[H][W];
		for(int i = 0; i < field.length; i++){
			field[i] = sc.next().toCharArray();
		}
		return true;
	}

	static void solve(){
		int res = 0;
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field[0].length; j++){
				if(field[i][j] != 'x' ){
					bfs(i, j);
					res++;
				}
			}
		}
		System.out.println(res);
	}
	
	static void bfs(int x, int y){
		char mark = field[x][y];
		field[x][y] = 'x';
		q.add(new int[]{x, y});
		while(!q.isEmpty()){
			int u = q.get(0)[0];
			int v = q.get(0)[1];
			q.remove(0);
			for(int i = 0; i < dx.length && i < dy.length; i++){
				int nx = u + dx[i];
				int ny = v + dy[i];
				if(0 <= nx && nx < field.length && 0 <= ny && ny < field[0].length && field[nx][ny] == mark){
					field[nx][ny] = 'x';
					q.add(new int[]{nx, ny});
				}
			}			
		}
	}
}