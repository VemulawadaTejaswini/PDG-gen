import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

class Main {
    static int ways;
    public static void main(String[] args) throws IOException {
        // Solution sol = new Solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        char[][] board = new char[h][w];
        int hashes = 0;
        for (int i=0; i<h; i++) {
            String s = br.readLine();
            for (int j=0; j<w; j++) {
                board[i][j] = s.charAt(j);
                if (board[i][j]=='#') {
                    hashes++;
                }
            }
        }

        ways = 0;

        recurse(board,0,h,w,k,hashes);
        System.out.println(ways);
    }

    public static void recurse(char[][] board, int idx, int H, int W, int k, int hashes ) {
        if (idx==H+W) {
            if (hashes==k) {
                ways++;
            }
            return;
        }
        //exclude
        recurse(board, idx+1, H, W, k, hashes);
        //include
        char[][] boardcopy = new char[board.length][];
        for (int i = 0; i < board.length; i++) {
            boardcopy[i] = board[i].clone();
        }
        if(idx<H){
            for (int ll=0; ll<W; ll++) {
                if(boardcopy[idx][ll]=='#'){
                    hashes--;
                    boardcopy[idx][ll]='.';
                }
            }
        }
        else{
            for (int ll=0; ll<H; ll++) {
                if(boardcopy[ll][idx-H]=='#'){
                    hashes--;
                    boardcopy[ll][idx-H]='.';
                }
            }
        }
        recurse(boardcopy, idx+1, H, W, k, hashes);

    }

}