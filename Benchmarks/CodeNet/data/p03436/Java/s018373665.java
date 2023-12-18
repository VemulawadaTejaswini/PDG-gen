import java.util.Scanner;

public class Main {

	static Main queue[];
	static int front = 0, rear = 0;
	static int h, w;
	static String s[];
	int x, y;
	
	public static boolean isempty() {
		return (front == rear);
	}
	
	public static int quesize() {
		if(front < rear)return rear - front;
		else return rear - front + queue.length;
	}
	
	public static void put(Main n) {
		int max = queue.length;
		if(quesize() == max - 1)return;
		rear = (rear + 1) % max;
		queue[rear] = n;
	}
	
	public static Main dequeue() {
		if(isempty())return new Main(-1, -1);
		front = (front + 1) % queue.length;
		return queue[front];
	}
	
	public Main(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean same(Main t) {
		return(x == t.x && y == t.y);
	}
	
	public void next(Main t) {
		x += t.x;
		y += t.y;
	}
	
	public boolean isinfield() {
		return (x >= 1 && x <= h && y >= 1 && y <= w);
	}
	
	public static int solve() {
		int memo[][] = new int[h + 1][w + 1];
		memo[1][1] = 1;
		Main move[] = {new Main(0, -1), new Main(0, 1), new Main(-1, 0), new Main(1, 0)};
		put(new Main(1, 1));
		Main goal = new Main(h, w);
		while(!isempty()) {
			Main cur = dequeue();
			if(cur.same(goal))return memo[cur.x][cur.y];
			for(int i = 0; i < 4; ++i) {
				Main next = new Main(cur.x, cur.y);
				next.next(move[i]);
				if(next.isinfield()) {
					char t = s[next.x].charAt(next.y - 1);
					if(t == '.') {
						if(memo[next.x][next.y] == 0) {
							put(next);
							memo[next.x][next.y] = memo[cur.x][cur.y] + 1;
						}
					}
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		s = new String[h + 1];
		queue = new Main[h * w + 1];
		int max = 0;
		for(int i = 0; i < h * w + 1; ++i)queue[i] = new Main(0, 0);
		for (int i = 1; i <= h; ++i) {
			s[i] = sc.next();
			for(int j = 0; j < w; ++j) {
				if(s[i].charAt(j) == '.')++max;
			}
		}
		sc.close();
		int ans = 0;
		ans = solve();
		if(ans != -1)ans = max - ans;
		System.out.println(ans);
	}

}
