import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int toInt(int h , int w , int d , int H , int W){
		return d * H * W + w * H + h;
	}
	static int solve(int H, int W , int[][] R , int[][] B){
		Queue<Integer> q = new LinkedList<>();
		q.add(0);
		int ret = 10000;
		boolean vis[] = new boolean[H * W * (H + W) * 80];
		while(!q.isEmpty()){
			int cur = q.poll();
			int h = cur % H;
			int w = (cur / H) % W;
			int r = (cur / H / W) ;
			int diff = Math.abs(B[h][w] - R[h][w]);
			int d1 = r + diff;
			int d2 = Math.max(r - diff , diff - r);
			if(h == H - 1 && w == W - 1){
				int d = Math.min(Math.abs(d1), Math.abs(d2));
				ret = Math.min(ret, d);
			}
			if(h < H - 1){				
				int nh = h + 1;
				int nw = w;
				int ns = toInt(nh , nw , d1 , H , W);
				if(!vis[ns]){
					vis[ns] = true;
					q.add(ns);
				}
				ns = toInt(nh , nw , d2 , H , W);
				if(!vis[ns]){
					vis[ns] = true;
					q.add(ns);
				}
			}
			if(w < W - 1){
				int nh = h;
				int nw = w + 1;				
				int ns = toInt(nh , nw , d1 , H , W);
				if(!vis[ns]){
					vis[ns] = true;
					q.add(ns);
				}
				ns = toInt(nh , nw , d2 , H , W);
				if(!vis[ns]){
					vis[ns] = true;
					q.add(ns);

				}
			}
		}
		return ret;
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