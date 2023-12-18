import java.util.Scanner;
public class Main {
	public static int N;
	public static int M;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 行
		N = sc.nextInt();
		// 列
		M = sc.nextInt();
		// カード
      	boolean cards[][] = new boolean[N][M];
      	initializeCards(cards);
      	for(int i = 0; i < N ; i++) {
			for(int j = 0; j < M; j++) {
				manipulate(cards, i, j);
			}
		}
      	// debugCards(cards);

		// 出力
		System.out.println(countCards(cards));
	}

	private static void initializeCards(boolean[][] cards) {
		for(int i = 0; i < N ; i++) {
			for(int j = 0; j < M; j++) {
				cards[i][j] = true;
			}
		}
	}

	private static void debugCards(boolean[][] cards) {
		for(int i = 0; i < N ; i++) {
			for(int j = 0; j < M; j++) {
				System.out.print(cards[i][j]);
			}
		}
	}

	private static int countCards(boolean[][] cards) {
		int falseNumber = 0;
		for(int i = 0; i < N ; i++) {
			for(int j = 0; j < M; j++) {
				if(cards[i][j] == false) falseNumber = falseNumber + 1;
			}
		}
		return falseNumber;
	}

  	private static void flip(boolean[][] cards, int x, int y){
  		if( x >= 0 && x < N && y >= 0 && y < M) {
  			cards[x][y] = (cards[x][y] == true) ? false : true;
  		}
    }

  	private static void manipulate(boolean[][] cards, int x, int y) {
  		// 上の行
  		flip(cards, x - 1,  y - 1);
  		flip(cards, x, y -1 );
  		flip(cards, x + 1, y -1 );
  		// 真ん中の行
  		flip(cards, x - 1, y);
  		flip(cards, x, y);
  		flip(cards, x + 1, y);
  		// 下の行
  		flip(cards, x - 1, y + 1);
  		flip(cards, x, y + 1);
  		flip(cards, x + 1, y + 1);
  	}
}