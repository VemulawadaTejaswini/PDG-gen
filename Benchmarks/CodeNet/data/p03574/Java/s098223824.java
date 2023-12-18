import java.util.Scanner;

public class Main{
	static Scanner s = new Scanner(System.in);			//文字の入力

	static int H = s.nextInt();
	static int W = s.nextInt();
	static String data[] = new String [H];
	static char field[][] = new char[H][W];
	
	public static void main(String[] args){
	
	

		settei();
		
		solve();





	}
	static void settei(){

		for(int i = 0; i < H;i++){
			data[i] = s.next();			//文字の入力
		}
		for(int i = 0;i <H ;i++){			//たて
			for(int j= 0;j < W;j++){			//横
				field[i][j] = data[i].charAt(j);		//fieldの作成
				System.out.print(field[i][j]);
				if(j == W-1){
					System.out.println();
				}
			}
		}
		
	}

	static void solve(){
		for(int i = 0;i<H;i++){
			for(int j = 0;j <W;j++){
				dps(i,j);
			}
		}
		
		for(int i = 0;i <H ;i++){			
			for(int j= 0;j < W;j++){			
				System.out.print(field[i][j]);		//答えの表示
				if(j == W-1){
					System.out.println();
				}
			}
		}
	}

	static void dps(int y,int x){
		int count = 0;
		
		if(field[y][x] == '.'){

			for(int dx = -1;dx <= 1;dx++){
				for(int dy = -1;dy<=1;dy++){
					int nx = x + dx;
					int ny = y + dy;
					if(0 <= nx && nx < W-1 && 0 <= ny && ny < H-1)
						if(field[ny][nx] == '#'){
						count++;		//爆弾の個数を数える
						
					}
				}

			}
			field[y][x] = (char)(count+'0');		//周りの爆弾の数を表示
			
			
		}else{
			return;				//現在地が'.'じゃなければ何もしない
		}
	}

}
