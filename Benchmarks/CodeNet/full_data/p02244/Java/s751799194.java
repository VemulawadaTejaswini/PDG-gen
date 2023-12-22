import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        int[][] board = new int[8][8];
        for(int i = 0; i < 8 ; i++){
            Arrays.fill(board[i], 0);
        }
        for(int i = 0; i < num; i++){
            String[] tmpArray = bufferedReader.readLine().split(" ");
            int r = Integer.parseInt(tmpArray[0]);
            int c = Integer.parseInt(tmpArray[1]);
            board[r][c] = 1;
        }
        int nextC = getAvailableColumn(board, 8);
        if(nextC >= 0){
            for(int i = 0; i < 8; i++){
                boolean result = putQueen(board, 8, i, nextC);
                if(result == true){
                	break;
                }
            }
        }
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8 ; j++){
                if(board[i][j] == 1){
                    System.out.print("Q");
                }
                else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
     
    static int getAvailableColumn(int[][] board, int num){
        int j;
        for(j = 0; j < num ; j++){
            int queen = 0;
            for(int i = 0; i < num; i++){
                if(board[i][j] == 1){
                    queen++;
                    break;
                }
            }
            if(queen == 0){
                break;
            }
        }
         
        if(j >= num){
            return -1;
        }
         
        else {
            return j;
        }
    }
     
    static boolean putQueen(int[][] board, int num, int r, int c){
        for(int i = 0; i < num ; i++){
            if(board[i][c] == 1 && i != r){
                return false;
            }
            if(board[r][i] == 1 && i != c){
                return false;
            }
        }
        for(int i = 0; i < num; i++){
            if(  r+i < num && c+i < num && board[r+i][c+i] ==1){
                return false;
            }
            if( r+i < num && c-i >= 0 && board[r+i][c-i] ==1 ){
                return false;
            }
            if(  r-i >= 0 && c+i < num && board[r-i][c+i] ==1){
                return false;
            }
            if( r-i >= 0 && c-i >= 0 && board[r-i][c-i] ==1 ){
                return false;
            }
        }
        board[r][c] = 1;
         
        int nextColumn = getAvailableColumn(board, 8);
        if(nextColumn < 0){
            return true;
        }
        for(int i = 0; i < num ; i++){
            boolean result = putQueen(board, num, i, nextColumn);
            if(result == true){
                return true;
            }
        }
        board[r][c] = 0;
        return false;
    }

}