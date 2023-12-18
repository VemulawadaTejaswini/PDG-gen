import java.util.ArrayList;
import java.util.Scanner;

class Main{
	static int[][] dp;
	static int ans = 0;
	static int H;
	static int W;
	static char[][] map;
	static int sub = 0;
	static boolean[][] used;
	static boolean[][] okblack;



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		H = sc.nextInt();
		W = sc.nextInt();
		map = new char[H][W];
		for(int i = 0;i < H;i++){
			String ss = sc.next();
			for(int j = 0;j < W;j++){
				map[i][j] = ss.charAt(j);
			}
		}
		//		for(int i = 0;i < H;i++){
		//			for(int j = 0;j < W;j++){
		//				System.out.print(map[i][j])				;
		//				}
		//			System.out.println();
		//		}
		ArrayList<Integer> bList = new ArrayList<Integer>();

		int[][] black = new int[H][W];
		for(int i = 0;i < H;i++){
			for(int j = 0;j < W;j++){
				if(map[i][j] == '#'){
					bList.add(i);
					bList.add(j);
				}
			}
		}	
		for(int i = 0;i < bList.size();i=i+2){
			for(int k = 0;k < H;k++){
				for(int m = 0;m < W;m++){
					sub = 0;
					if(map[k][m] == '.'){
						used = new boolean[H][W];
						dfs(bList.get(i),bList.get(i+1),k,m,1);
						if(sub > 0){
							ans++;
						}
					}
				}
			}
		}


		System.out.println(ans);





	}
	static void dfs(int y,int x,int gy,int gx,int color){
		//		System.out.println("y " + y + " x "+x + " gy "+gy + " gx "+ gx );
		if(y == gy && x == gx){
			//			System.out.println("ok");
			sub++;
			return;
		}
		int[] dx = {-1,1,0,0};
		int[] dy = {0,0,1,-1};
		for(int i = 0;i < 4;i++){
			if(x + dx[i] >= 0 && x + dx[i] < W && y + dy[i] >= 0 && y + dy[i] < H){
				if(color == 1){
					if(map[y+dy[i]][x+dx[i]] == '.' && !used[y+dy[i]][x+dx[i]]){
						used[y+dy[i]][x+dx[i]] = true;
						dfs(y+dy[i], x+dx[i], gy, gx, 0);
						used[y+dy[i]][x+dx[i]] = false;;

					}
				}else{
					if(map[y+dy[i]][x+dx[i]] == '#'){
						used[y+dy[i]][x+dx[i]] = true;
						dfs(y+dy[i], x+dx[i], gy, gx, 1);
						used[y+dy[i]][x+dx[i]] = false;;

					}
				}
			}
		}

	}



}







class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

