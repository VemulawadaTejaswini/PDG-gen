import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] board = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        ArrayList<String> ans = new ArrayList<String>();
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W-1; j++) {
                if(board[i][j]%2!=0){
                    board[i][j+1]++;
                    ans.add((i+1)+" "+(j+1)+" "+(i+1)+" "+(j+2));
                }
            }
            if (++i < H){
                if(board[i-1][W-1]%2!=0){
                    board[i][W-1]++;
                    ans.add((i)+" "+(W)+" "+(i+1)+" "+(W));
                }
                for (int j = W-1; j > 0; --j) {
                    if(board[i][j]%2!=0){
                        board[i][j-1]++;
                        ans.add((i+1)+" "+(j+1)+" "+(i)+" "+(j+1));
                    }
                }
                if (++i < H){
                    if(board[i-1][0]%2!=0){
                        board[i][0]++;
                        ans.add((i)+" "+(1)+" "+(i+1)+" "+(1));
                    }       
                }     
            }
        }
        System.out.println(ans.size());
        for(String str:ans){
            System.out.println(str);
        }
    }
}