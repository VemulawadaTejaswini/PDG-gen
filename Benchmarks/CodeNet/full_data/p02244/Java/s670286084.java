import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int already_n = Integer.parseInt(sc.next());
        boolean[][] board = new boolean[8][8];
    	for(int i=0; i<8; i++){
    		for(int j=0; j<8; j++){
    		    board[i][j] = false;
    		}
    	}
        
        int row =0, column=0;
        for(int i=0; i<already_n; i++){
            row = Integer.parseInt(sc.next());
            column = Integer.parseInt(sc.next());
            board[row][column] = true;
        }
        
        ArrayList<boolean[][]> ans = boardAll(board, 0);
        boolean[][] new_board = new boolean[8][8];
        
        for(int i=0; i<ans.size(); i++){
                new_board = ans.get(i);
        		for(int j=0; j<8; j++){
        			for(int k=0; k<8; k++){
        			    if(new_board[j][k]) System.out.print("Q");
        			    else System.out.print(".");
        			}
        			System.out.println();
            }
        }
        
    }
    private static boolean ckConflict(boolean[][] board, int y, int x){       //true・・・ぶつかる
        int over = 0;
        for(int i=0; i<8; i++){
            if(board[i][x]) over++;
            if(over>0) return true;
        }
        over = 0;
        for(int i=0; i<8; i++){
            if(board[y][i]) over++;
            if(over>0) return true;
        }
        over = 0;
        for(int i=-8; i<8; i++){
            if(((x+i)>=0) && ((y+i)>=0) && ((x+i)<8) && ((y+i)<8)){
                if(board[y+i][x+i]) over++;
            }
            if(over>0) return true;
        }
        over = 0;
        for(int i=-8; i<8; i++){
            if(((x-i)>=0) && ((y+i)>=0) && ((x-i)<8) && ((y+i)<8)){
                if(board[y+i][x-i]) over++;
            }
            if(over>0) return true;
        }
        return false;
    }
    
    private static ArrayList<boolean[][]> boardAll(boolean[][] board, int r_now){
        ArrayList<boolean[][]> ans = new ArrayList<boolean[][]>(1);
        boolean there = false;
        boolean[][] new_board = new boolean[8][8];
        
        if(r_now==8){
            ans.add(board.clone());
            return ans;
        }
        
        for(int i=0; i<8; i++){
            if(board[r_now][i]) there=true;
        }
        if(there){
            return boardAll(board, r_now+1);
        }else{
            for(int i=0; i<8; i++){
                if(!ckConflict(board, r_now, i)){
                    for(int j=0; j<8; j++){ new_board[j] = board[j].clone(); }
                    new_board[r_now][i] = true;
                    ans.addAll(boardAll(new_board, r_now+1));
                }
            }
            return ans;
        }
    }
}
