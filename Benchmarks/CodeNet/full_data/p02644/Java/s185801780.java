import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();
        int K = scan.nextInt();
        int x1 = scan.nextInt()-1;
        int y1 = scan.nextInt()-1;
        int x2 = scan.nextInt()-1;
        int y2 = scan.nextInt()-1;
        scan.nextLine();
        
        boolean[][] board = new boolean[h][w];
        for(int row = 0 ; row < h ; row++) {
            String s = scan.nextLine();
            for(int col = 0 ; col < w ; col++) {
                if(s.charAt(col) == '.') {
                    board[row][col] = true;
                }
            }
        }
        // if(!board[x2][y2]) {
        //     System.out.println("-1");
        //     return;
        // }
        Deque<int[]> queue = new LinkedList<>();
        queue.addLast(new int[]{x1,y1});
        board[x1][y1] = false;
        int level = -1;
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        while(!queue.isEmpty()) {
            int sz = queue.size();
            for(int i = 0 ; i < sz ; i++) {
                int[] current = queue.removeFirst();
                if(current[0] == x2 && current[1] == y2) {
                    System.out.println(level+1);
                    return;
                }
                // get all unvisited neighbours of this cell.
                for(int[] dir : dirs) {
                    int newX = current[0];
                    int newY = current[1];
                    for(int k = 0 ; k <= K ; k++) {
                         newX = newX + dir[0];
                         newY = newY + dir[1];
                        if(newX < 0 || newY < 0 || newX >= h || newY >= w) break;
                        if(!board[newX][newY]) break;
                        board[newX][newY] = false;
                        queue.addLast(new int[]{newX, newY});
                    }
                }
            }
            level++;
        }
        
        System.out.println("-1");
    }
}