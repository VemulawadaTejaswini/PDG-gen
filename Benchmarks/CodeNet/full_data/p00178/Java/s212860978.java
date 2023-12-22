import java.util.*;

public class Main{
	
	//1324 start
	
	int [][] field;
	int [] maxheight;
	int wid = 5;
	int height = 10;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			field = new int[height][wid];
			maxheight = new int[wid];
			for(int i = 0; i < n; i++){
				int d = sc.nextInt();
				int p = sc.nextInt();
				int q = sc.nextInt();
				fall(d,p,q-1);
				//disp();
			}
			int ans = count();
			System.out.println(ans);
		}
	}
	private void disp() {
		for(int i = height - 1; i >= 0; i--){
			for(int j = 0; j < wid; j++){
				System.out.printf("%2d ",field[i][j]);
			}
			System.out.println();
		}
		debug(maxheight);
		System.out.println();
		
	}
	private void fall(int dir, int len, int pos) {
		if(dir == 1){
			int nowmaxheight = 0;
			for(int i = 0; i < len; i++){
				nowmaxheight = Math.max(maxheight[pos + i], nowmaxheight);
			}
			
			for(int i = 0; i < len; i++){
				field[nowmaxheight][pos + i] = 1;
				maxheight[pos + i] = nowmaxheight + 1;
			}
		}
		else{
			for(int i = 0; i < len; i++){
				field[maxheight[pos] + i][pos] = 1;
			}
			maxheight[pos] += len;
		}
		erase();
	}
	private void erase() {
		int nowmaxheight = 0;
		for(int i = 0; i < wid; i++){
			nowmaxheight = Math.max(maxheight[i], nowmaxheight);
		}
		for(int i = 0; i < nowmaxheight; i++){
			boolean flg = true;
			for(int j = 0; j < wid; j++){
				if(field[i][j] == 0){
					flg = false;
					break;
				}
			}
			if(flg){
				for(int j = 0; j < wid; j++){
					field[i][j] = -1;
				}
			}
		}
		Arrays.fill(maxheight, 0);
		for(int i = 0; i < wid; i++){
			int ind = 0;
			for(int j = 0; j < height; j++){
				if(field[j][i] == -1){
					
				}
				else{
					field[ind++][i] = field[j][i];
				}
			}
			for(;ind < height; ind++){
				field[ind][i] = 0;
			}
			for(int j = height -1 ; j >= 0; j--){
				if(field[j][i] == 1){
					maxheight[i] = j + 1;
					break;
				}
			}
		}
	}
	private int count() {
		int c = 0;
		for(int i = 0; i < height; i++){
			for(int j = 0; j < wid; j++){
				if(field[i][j] == 1){
					c++;
				}
			}
		}
		return c;
	}
	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}