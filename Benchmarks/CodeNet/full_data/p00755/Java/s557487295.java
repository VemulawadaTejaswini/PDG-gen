
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}

	public Main() {
		Scanner sc = new Scanner(System.in);
		while(true){
			h = sc.nextInt();
			w = sc.nextInt();
			c = sc.nextInt();
			if(h==0 && w==0 && c==0)
				break;
			
			field =new int[h][w];
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++)
					field[i][j] = sc.nextInt();
			}
			solve();
		}
		
	}

	int h;
	int w;
	int c;
	int[][] field;
	public void solve() {
		visited = new boolean[7][h*w];
		int res = 0;
		for(int i=1;i<=6;i++){
			res =Math.max(res, rec(1, field[0][0], i));
		}
		System.out.println(res);
	}

	int[] dx = { -1, 0, 1, 0 };
	int[] dy = { 0, -1, 0, 1 };
	boolean[][] visited;
	Queue<Integer> queue = new LinkedList<Integer>();
	private int rec(int cur, int cc, int nc) {
		if(cur == 6)
			return count();
		
		int mask = (1<<3)-1;
		
		queue.add(0);
		Arrays.fill(visited[cur], false);
		while(!queue.isEmpty()){
			int p = queue.poll();
			int x = p&(0x07);
			int y = p>>3;
			if(visited[cur][y*w+x])
				continue;
			
			visited[cur][y*w+x] = true;
			field[y][x] = (field[y][x] << 3) + nc;  
			
			for(int i=0;i<4;i++){
				int nx = x+dx[i];
				int ny = y+dy[i];
				if(nx<0 || w<=nx || ny<0 || h<=ny)
					continue;
				
				if((field[ny][nx]&mask)==cc)
					queue.add((ny<<3)+nx);
			}
		}
		
		int ret = 0;
		for(int i=1;i<=6;i++)
			ret = Math.max(ret, rec(cur+1, field[0][0]&mask, i));
		
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(visited[cur][i*w+j]){
					field[i][j] >>=3;
				}
			}
		}
		
		
		return ret;
	}

	private int count() {
		int res = 0;
		int mask = (1<<3)-1;
		
		queue.add(0);
		Arrays.fill(visited[6], false);
		while(!queue.isEmpty()){
			int p = queue.poll();
			int x = p&0x07;
			int y = p>>3;
			if(visited[6][y*w+x])
				continue;
			
			visited[6][y*w+x] = true;  
			res++;
			for(int i=0;i<4;i++){
				int nx = x+dx[i];
				int ny = y+dy[i];
				if(nx<0 || w<=nx || ny<0 || h<=ny)
					continue;
				
				if((field[ny][nx]&mask)==c)
					queue.add((ny<<3)+nx);
			}
		}
//		System.out.println(res);
		return res;
	}

}