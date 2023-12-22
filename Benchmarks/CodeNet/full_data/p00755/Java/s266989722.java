import java.util.*;

public class Main {
	int [] vx = {0,1,0,-1};
	int [] vy = {1,0,-1,0};
	final int INF = Integer.MAX_VALUE;
	int ans,h,w,c;
	int [][] work;
	
	class C{
		int x,y;
		public C(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	private void doit() {
		Scanner sc = new Scanner (System.in);
		while(true){
			h = sc.nextInt();
			w = sc.nextInt();
			c = sc.nextInt();
			if((w|h|c) == 0) break;
			int [][] data = new int[h][w];
			for(int i=0; i < h; i++){
				for(int j = 0; j < w; j++){
					data[i][j] = sc.nextInt();
				}
			}
			ans = 0;
			dfs(0,data);
			System.out.println(ans);
			//debug
//			work = deepcopy(data);
//			paint(0,0,work[0][0],6);
//			disp(work);
//			paint(0,0,work[0][0],3);
//			disp(work);
//			paint(0,0,work[0][0],4);
//			disp(work);
//			paint(0,0,work[0][0],2);
//			disp(work);
//			paint(0,0,work[0][0],5);
//			disp(work);
//			System.out.println(getA(5));
		}
	}
	private void dfs(int deep, int[][] data) {
		//System.out.println("deep= " + deep);
		if(deep == 4){
			//c を塗る
			work = deepcopy(data);
			int before = data[0][0];
			//disp(work);
			if(before != c){
				paint(0,0,before, c);
			}
			//disp(work);
			//calc a area
			int area = getA(c);
			ans = Math.max(ans, area);
		}
		else{
			for(int i=1; i <= 6; i++){
				//c を塗る
				work = deepcopy(data);
				int before = data[0][0];
				if(before != i){
					paint(0,0,before, i);
				}
				int [][] nextdata = deepcopy(work);
				dfs(deep+1,nextdata);
			}
		}
		
	}
	private void disp(int[][] work2) {
		System.out.println("disp= ");
		for(int i =0; i < work2.length; i++){
			for(int j = 0; j < work2[i].length; j++){
				System.out.print(work2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("disp end");
	}
	private int getA(int c) {
		LinkedList<C> open = new LinkedList<C>();
		open.add(new C(0, 0));
		boolean [][] close = new boolean[h][w];
		close[0][0] = true;
		int count = 0;
		while(! open.isEmpty()){
			C now = open.removeFirst();
			count++;
			for(int i=0; i < 4; i++){
				int xx = vx[i] + now.x;
				int yy = vy[i] + now.y;
				if(! isOK(xx,yy)) continue;
				if(work[yy][xx] == c){
					if(close[yy][xx]) continue;
					open.add(new C(xx,yy));
					close[yy][xx] = true;
				}
			}
		}
		return count;
	}
	private void paint(int x,int y, int before, int c) {
		work[y][x] = c;
		for(int i=0; i < 4; i++){
			int xx = vx[i] + x;
			int yy = vy[i] + y;
			if(! isOK(xx,yy)) continue;
			if(work[yy][xx] != before) continue;
			paint(xx,yy,before,c);
		}
	}
	private boolean isOK(int xx, int yy) {
		if(0<= xx && xx < w && 0 <= yy && yy < h ){
			return true;
		}
		return false;
	}
	private int[][] deepcopy(int[][] data) {
		int [][] res = new int[data.length][data[0].length];
		for(int i=0; i < data.length; i++){
			for(int j = 0;  j < data[i].length; j++){
				res[i][j] = data[i][j];
			}
		}
		return res;
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}