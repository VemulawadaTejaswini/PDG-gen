import java.util.Scanner;

public class Main {
	
	public static final char cDir[] = {
		'U', 'R', 'D', 'L'
	};
	
	public static final int pDir[][] = {
		{0, -1}, {1, 0}, {0, 1}, {-1, 0}
	};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char map[][] = new char [9][5];
		boolean neighbor[][][] = new boolean [5][5][4];
		int hand[] = {0, 0};	//現在の座標
		int iDir = 1;			//cDir や pDirに対応している。
		String answer = new String();
		
		//入力処理
		for(int i=0; i<9; i++){
			map[i] = scan.next().toCharArray();
		}
		
		//neighbor初期化
		for(int i=0; i<5; ++i){
			for(int j=0; j<5; ++j){
				//Up
				neighbor[i][j][0] = 0<=(i*2-1) ? (map[i*2 -1][j] == '1') : false;
				//Right
				neighbor[i][j][1] = j<(5-1) ? (map[i*2][j] == '1') : false;
				//Down
				neighbor[i][j][2] = (i*2+1)<9 ? (map[i*2+1][j] == '1') : false;
				//Left
				neighbor[i][j][3] = 0<=(j-1) ? (map[i*2][j-1] == '1') : false; 
			}
		}
		
		//本体
		int x=0, y=0;
		while(true){
			//探索
			x = hand[0]; y = hand[1];
			if(neighbor[y][x][(iDir+3)%4]){
				iDir = (iDir+3)%4;
			}else if(neighbor[y][x][(iDir+0)%4]){
				iDir = (iDir+0)%4;
			}else if(neighbor[y][x][(iDir+1)%4]){
				iDir = (iDir+1)%4;
			}else{
				System.out.println("×");
				return;
			}
			
			//結果処理
			hand[0] += pDir[iDir][0];
			hand[1] += pDir[iDir][1];
			answer += cDir[iDir];
			//動いた先が点Aだったらループから抜ける。
			if(hand[0]==0 && hand[1]==0){
				break;
			}
		}
		System.out.println(answer);
	}
}