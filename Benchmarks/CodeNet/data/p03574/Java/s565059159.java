import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
        sc.close();
    }
    
	//フィールド
    Scanner sc;
    int H;
    int W;
    char[][] board;
    
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.H = sc.nextInt();
        this.W = sc.nextInt();
        board = new char[H][W];
        for (int i=0; i<H; i++) {
        	String S = sc.next();
        	for (int j=0; j<W; j++) {
        		board[i][j] = S.charAt(j);
        	}
        }
    }
    
    //解答処理
    private String[][] solve() {
        String[][] answer = new String[H][W];
        int[][] count = new int[H][W];
        
        for (int i=0; i<H; i++) {
        	for (int j=0; j<W; j++) {
        		if (board[i][j] == '#') {
        			count[i][j] = -1;
        			continue;
        		}
        		
        		if (j-1>=0 && board[i][j-1] == '#') {	//左隣
        			count[i][j]++;
        		}
        		if (j+1<W && board[i][j+1] == '#') {	//右隣
        			count[i][j]++;
        		}
        		if (i-1>=0 && board[i-1][j] == '#') {	//上
        			count[i][j]++;
        		}
        		if (i+1<H && board[i+1][j] == '#') {	//下
        			count[i][j]++;
        		}
        		if (i-1>=0 && j+1<W && board[i-1][j+1] == '#') {	//右上
        			count[i][j]++;
        		}
        		if (i+1<H && j+1<W && board[i+1][j+1] == '#') {	//右下
        			count[i][j]++;
        		}
        		if (i-1>=0 && j-1>=0 && board[i-1][j-1] == '#') {	//左上
        			count[i][j]++;
        		}
        		if (i+1<H && j-1>=0 && board[i+1][j-1] == '#') {	//左下
        			count[i][j]++;
        		}
        	}
        }
        
        
        for (int i=0; i<H; i++) {
        	for (int j=0; j<W; j++) {
        		if (count[i][j] == -1) {
        			answer[i][j] = "#";
        		} else {
        			answer[i][j] = String.valueOf(count[i][j]);
        		}
        	}
        }

        return answer;
    }
    
    //出力
    public void show(String[][] answer) {
    	for (int i=0; i<H; i++) {
        	for (int j=0; j<W; j++) {
        		System.out.print(answer[i][j]);
        	}
        	System.out.println(" ");
        }
    }

}
