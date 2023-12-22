import java.util.Scanner;

public class Main {
	
	static int sum = 0; //print
	
	void search(char[][] board, int i) {
		out: for(int j = 0; j < board[i].length; j++) {//1??????????????¢?´¢
			if(board[i][j] == board[0][0]) {
				for(int k = j + 1; k < board[i].length; k++) {//2??????????????¢?´¢						if(board[i][k] == board[0][1]) {
					int interval = k - j;//1???????????¨2??????????????????
					int cnt = 2;//?????????????????¢?´¢???????????????
					for(int m = k + interval; m < board[i].length; m = m + interval) {//3???????????\????????¢?´¢
						if(board[i][m] == board[0][cnt]) {
							cnt = cnt + 1;
							if(cnt == board[0].length) {
								sum = sum + 1;
								break out;
							}
						} else {
							break;
						}
					}
				}
			}				
		}
	}
	
	
	void doIt() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] board = new char[n + 1][];
		board[0] = sc.next().toCharArray();
		for(int i = 1; i <= n; i++) {
			board[i] = sc.next().toCharArray();
			new Main().search(board, i);
		}
		
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}

}