import java.util.Scanner;

public class Main {
	public static int[][] field;
	public static int w;
	public static int h;
	public static final int MAX = 11;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doIt();
	}
	public static void test(){
		boolean b = false;
		int i = 0;
		//System.out.println(sizeof(b));
	}
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		w = sc.nextInt();
		h = sc.nextInt();
		while(w + h != 0){
			//1つめがy,2つめがx
			field = new int[h][w];
			int x = 0,y = 0;
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					int tmp = sc.nextInt();
					field[i][j] = tmp;
					if(tmp == 2){
						x = j;
						y = i;
					}
				}
			}
			int result = dp(y,x,0);
			if(result >= MAX){
				result = -1;
			}
			System.out.println(result);
			w = sc.nextInt();
			h = sc.nextInt();
		}
	}
	
	public static int dp(int y, int x, int depth){
//		for(int i = 0; i < depth; i++){
//			System.out.print("　");
//		}
//		System.out.println("x = " + x + ", y = " + y + ", depth = " + depth);
		boolean bBreak = false;
		int tmp;
		int min = MAX;
		
		if(depth == MAX){
			return min;
		}
		
		tmp = x + 1;
		if(tmp < w){
			if(field[y][tmp] != 1){
				//右にいってみる
				for(; tmp < w; tmp++){
					if(field[y][tmp] == 3){
						return 1;
					}
					else if(field[y][tmp] == 1){
						bBreak = true;
						field[y][tmp] = 0;
						//System.out.println("right");
						int t = dp(y,tmp - 1, depth + 1);
						if(min > t){
							min = t;
						}
						break;
					}
				}
				if(bBreak){
					//fieldを直す
					field[y][tmp] = 1;
					bBreak = false;
				}
			}
		}
		
		tmp = x - 1;
		if(tmp >= 0){
			if(field[y][tmp] != 1){
				//左に行ってみる
				for(; tmp >= 0; tmp--){
					if(field[y][tmp] == 3){
						return 1;
					}
					else if(field[y][tmp] == 1){
						bBreak = true;
						field[y][tmp] = 0;
						//System.out.println("left");
						int t = dp(y,tmp + 1, depth + 1);
						if(min > t){
							min = t;
						}
						break;
					}
				}
				if(bBreak){
					//fieldを直す
					field[y][tmp] = 1;
					bBreak = false;
				}
			}
		}
		
		tmp = y - 1;
		if(tmp >= 0){
			if(field[tmp][x] != 1){
				//上に行ってみる
				for(; tmp >= 0; tmp--){
					if(field[tmp][x] == 3){
						return 1;
					}
					else if(field[tmp][x] == 1){
						bBreak = true;
						field[tmp][x] = 0;
						//System.out.println("above");
						int t = dp(tmp + 1, x, depth + 1);
						if(min > t){
							min = t;
						}
						break;
					}
				}
				if(bBreak){
					//fieldを直す
					field[tmp][x] = 1;
					bBreak = false;
				}
			}
		}

		tmp = y + 1;
		if(tmp < h){
			if(field[tmp][x] != 1){
				//下に行ってみる
				for(; tmp < h; tmp++){
					if(field[tmp][x] == 3){
						return 1;
					}
					else if(field[tmp][x] == 1){
						bBreak = true;
						field[tmp][x] = 0;
						//System.out.println("below");
						int t = dp(tmp - 1, x, depth + 1);
						if(min > t){
							min = t;
						}
						break;
					}
				}
				if(bBreak){
					//fieldを直す
					field[tmp][x] = 1;
					bBreak = false;
				}
			}
		}
		
		return min + 1;
	}

}