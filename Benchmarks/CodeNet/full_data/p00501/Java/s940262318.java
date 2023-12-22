import java.util.Scanner;

public class Main {
	int check(char[] bar, char[] board){
		int space, pos;
		for(int i = 0; i < board.length; i++){
			if(bar[0] == board[i]) {
				for(int j = i + 1; j < board.length; j++){
					if(bar[1] == board[j]) {
						space = j - i;
						if( board.length <= space * (bar.length - 1) + i) break; // ??????????????§???????????°
						pos = j;
						for(int k = 2; k < bar.length; k++){
							pos += space;
							if(bar[k] != board[pos]){
								return 0;
							} else if(k == bar.length - 1) {
								return 1;
							}
						}
					}
				}
			}
		}
		return 0;
	}

	void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), cnt = 0;
		char[] bar = sc.next().toCharArray();
		for(int i = 0; i < n; i++){
			char[] board = sc.next().toCharArray();
			cnt += check(bar, board);
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}