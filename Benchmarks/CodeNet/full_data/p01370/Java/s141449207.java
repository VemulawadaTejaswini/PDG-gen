import java.util.Scanner;

public class Main{

	/**
	 * @param args
	 */
	//存在しないフィールド
	public static final int UNDEF = 0;
	//public static final int DEF = 1;
	public static final int REA = 2;
	//障害物のある場所
	public static final int UNREA = 3;
	public static final int SIZE = 60;
	public static final int ABS_SIZE = 30;
	//座標のx,y両方に2を足したもの
	public static int[][] field = new int[SIZE][SIZE];
	public static int maxTurn = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doIt();

	}
	public static void init(){
		for(int i = 0; i < SIZE; i++){
			for(int j = 0; j < SIZE; j++){
//				if(isDef(i,j)){
//					field[i][j] = DEF;
//				}
//				else{
//					field[i][j] = UNDEF;
//				}
				field[i][j] = UNDEF;

			}
		}
	}
//	public static boolean isDef(int x, int y){
//		boolean bRet = false;
//		switch(x){
//			case 0:
//				if(y < 3){
//					bRet = true;
//				}
//				break;
//			case 1:
//				if(y < 4){
//					bRet = true;
//				}
//				break;
//			case 2:
//				bRet = true;
//				break;
//			case 3:
//				if(y > 0){
//					bRet = true;
//				}
//				break;
//			case 4:
//				if(y > 1){
//					bRet = true;
//				}
//				break;
//		}
//		return bRet;
//	}
	public static void printCount(){
		int count = 0;
		for(int i = 0; i < SIZE; i++){
			for(int j = 0; j < SIZE; j++){
				if(field[i][j] == REA){
					count++;
					//System.out.println("x = "+ (i - 2) + ", y = " + (j - 2));
				}
			}
		}
		System.out.println(count);
	}
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		maxTurn = sc.nextInt();
		int n = sc.nextInt();
		while(maxTurn != 0 || n != 0){
			//System.out.println("maxTurn = "+maxTurn + ", n = " + n);
			init();
			//障害物設置
			for(int i = 0; i < n; i++){
				int x = sc.nextInt() + ABS_SIZE;
				int y = sc.nextInt() + ABS_SIZE;
				//System.out.println("x = "+x + ", y = " + y);
				//if((0 <=x && x <= SIZE) && (0 <=y && y <= SIZE)){
					field[x][y] = UNREA;
				//}
			}
			//初期地点
			int x = sc.nextInt() + ABS_SIZE;
			int y = sc.nextInt() + ABS_SIZE;
			field[x][y] = REA;
			goAround(x,y,0);
			printCount();
			
			maxTurn = sc.nextInt();
			n = sc.nextInt();
		}

	}
	public static boolean isAround(int x1, int y1, int x2, int y2){
		int x0 = x1 - x2;
		int y0 = y1 - y2;
		//ななめ1個ずれ
		if((x0 == 1 && y0 == 1) || (x0 == -1 && y0 == -1)){
			return true;
		}
		
		int x = Math.abs(x0);
		int y = Math.abs(y0);
		//縦横1個ずれ
		if((x == 1 && y == 0) || (x == 0 && y == 1)){
			return true;
		}
		else{
			return false;
		}
	}
	public static void goAround(int x, int y, int turn){
		//System.out.println("x = "+ x + ", y = " + y);
		//次のターンで終わりだったら
		if(turn == maxTurn){
			return;
		}
		//周りを見に行く
		int sX = x - 1, eX = x + 1, sY = y - 1, eY = y + 1;
		if(sX == -1){
			sX = 0;
		}
		if(eX == SIZE + 1){
			eX = SIZE;
		}
		if(sY == -1){
			sY = 0;
		}
		if(eY == SIZE + 1){
			eY = SIZE;
		}
		for(int i = sX; i <= eX; i++){
			for(int j = sY; j <= eY; j++){
				if(isAround(x,y,i,j) && field[i][j] != UNREA){
					field[i][j] = REA;
					goAround(i,j,turn + 1);
				}
			}
		}
	}
}