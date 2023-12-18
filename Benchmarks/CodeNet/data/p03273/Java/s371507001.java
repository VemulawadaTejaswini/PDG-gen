import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W =scan.nextInt();
        String str = scan.nextLine();
        String[][] board = new String[H][W];
        for (int i = 0; i < H; i++) {
            String line_i = scan.nextLine();
            board[i] = line_i.split("");         
        }
        scan.close();
        for (int i = 0 ; i < H; i++) {
            Boolean checker = false;
            for (int j=0 ; j < W && !checker; j++) {
                if (board[i][j].getBytes()[0] == "#".getBytes()[0] ) {
                    checker = true;
                    break;
                }
            }            
            if (!checker) {
                H--;
                for (int w = i; w < H; w++) {
                    board[w] = board[w+1];
                }
                i--;
            }            
        }for (int j = 0; j < W; j++) {
            Boolean checker = false;
            for (int i = 0; i < H && !checker; i++) {
                if (board[i][j].getBytes()[0] == "#".getBytes()[0] ) {
                    checker = true;
                    break;
                }                
            }            
            if (!checker) {
                W--;
                for (int i = 0; i < H; i++) {
                    for (int k = j; k < W; k++) {
                        board[i][k] = board[i][k+1];
                    }
                }
                j--;
            }
            
        }

        for (int i = 0; i < H; i++) {
            for (int j=0; j < W;j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        
    }
}