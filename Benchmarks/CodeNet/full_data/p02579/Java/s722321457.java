import java.util.*;

public class Main {
	static Scanner scan = new Scanner(System.in);

	static int h = scan.nextInt();
	static int w = scan.nextInt();
	static int c_h = scan.nextInt()-1;
	static int c_w = scan.nextInt()-1;
	static int d_h = scan.nextInt()-1;
	static int d_w = scan.nextInt()-1;
	static int maze[][] = new int[h][w];
	static boolean reached[][] = new boolean[h][w];
	static int town_num[][] = new int[h][w];
	static int ans = 0;
	static int town = 0;
	static int now = 0;
	static int goal = 0;
	static int start = 0;
	
	public static void main(String[] args) {
		for(int i=0;i<h;i++) {
			String s = scan.next();
			for(int j=0;j<w;j++) {
				maze[i][j] = s.charAt(j);
			}
		}
		
		maze[c_h][c_w] = 's';
		maze[d_h][d_w] = 'g';

		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				if(reached[i][j] == false && maze[i][j] != '#') {
					search(i,j,town+1);
					town++;
				}
			}
		}
		
		List<Integer>[] edge = new ArrayList[town];
		boolean gone[] = new boolean[town];
		for(int i=0;i<town;i++) {
			edge[i] = new ArrayList<>();
		}
		
		for(int i=1;i<=town;i++) {
			for(int j=i+1;j<=town;j++) {
				if(connect(i,j)) {
					edge[i-1].add(j);
					edge[j-1].add(i);
				}
			}
		}
		
		if(start == goal) {
			System.out.println(ans);
			return;
		}else {
			Deque<Integer> queue = new ArrayDeque<>();
			queue.offer(start);
			while(!queue.isEmpty()) {
				int oppai = queue.poll();
				gone[oppai] = true;
				System.out.println(oppai);
				if(oppai == goal) {
					System.out.println(ans);
					return;
				}
				for(int boin : edge[oppai]) {
				    if(!gone[boin-1]) {
				    	gone[boin-1] = true;
				    	queue.offer(boin-1);
				    }
				}
				ans++;
			}
			
			System.out.println(-1);
			return;
		}
		
		
		
	}
	
	static void search(int x,int y,int town) {
		if(x<0 || h<=x || y<0 || w<=y || maze[x][y] == '#') {
			return;
		}
		if(reached[x][y]) {
			return;
		}
		
		reached[x][y] = true;
		town_num[x][y] = town;
		if(maze[x][y] == 'g') {
			goal = town-1;
		}else if(maze[x][y] == 's'){
			start = town-1;
		}
		
		search(x+1,y,town); //right
		search(x-1,y,town); //left
		search(x,y+1,town); //up
		search(x,y-1,town); //down
	}
	
	static boolean connect (int a,int b) {
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				if(town_num[i][j] == a) {
					for(int k=i-2;k<=i+2;k++) {
						for(int l=j-2;l<=j+2;l++) {
							if(k<h && k>=0 && l<w && l>= 0 && town_num[k][l] == b ) {
								return true;
							}
						}
					}
				}
			}
		}
		
		return false;
	}
	
	
	public static int gcd(int x,int y) {
		if(x%y == 0) {
			return y;
		}else {
			return gcd(y,x%y);
		}
	}
}
 



