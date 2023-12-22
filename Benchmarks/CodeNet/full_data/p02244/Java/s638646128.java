import java.util.Scanner;
public class Main{
    public static boolean puttable(char board[][], int x, int y){
        for(int i = 1 ; i <= 7 ; i++){
            if(board[x][(y+i)%8] == 'Q')
                return false;
            else if(board[(x+i)%8][y] == 'Q')
                return false;
        }
	int n = Math.abs(x - y);
	for(int i = 0 ; i <= (7-n) ; i++){
		if(i == Math.min(x,y));
		else if(board[x-Math.min(x,y)+i][y-Math.min(x,y)+i] == 'Q')
			return false;
	}
	int n2 = 1;
	while(true){
		if(x-n2 < 0 || y+n2 > 7)
			break;
		else if(board[x-n2][y+n2] == 'Q')
			return false;
		n2++;
	}
	n2 = 1;
	while(true){
		if(x+n2 > 7 || y-n2 < 0)
			break;
		else if(board[x+n2][y-n2] == 'Q')
			return false;
		n2++;
	}
        return true;
    }
    public static boolean bfs(char board[][], int line){
        if(line == 8)
            return true;
        int count = 0;
        int x = 0;
        int y = 0;
        for(int i = 0 ; i < 8 ; i++){
            if(board[line][i] == 'Q'){
                x = line;
                y = i;
                count++;
            }
        }
        if(count >= 2)
            return false;
        else if(count == 1){
            if(puttable(board,x,y))
                return bfs(board,line+1);
            else
                return false;
        }
        else{
            for(int i = 0 ; i < 8 ; i++){
                if(puttable(board,line,i)){
                    board[line][i] = 'Q';
                    if(bfs(board,line+1))
                        return true;
                    else
                        board[line][i] = '.';
                }
            }
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char board[][] = new char[8][8];
        for(int i = 0 ; i < 8 ; i++){
            for(int j = 0 ; j < 8 ; j++)
                board[i][j] = '.';
        }
        int k = sc.nextInt();
        for(int i = 0 ; i < k ; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            board[x][y] = 'Q';
        }
        if(bfs(board,0)){
            for(int i = 0 ; i < 8 ; i++){
                for(int j = 0 ; j < 8 ; j++)
                    System.out.print(board[i][j]);
                System.out.println();
            }
        }
    }
}
