import java.util.*;
public class Main {
    static int MOD = 1001;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rowNum = sc.nextInt();
        int colNum = sc.nextInt();
        char[][] grid = new char[rowNum][colNum];
        for(int i = 0; i < rowNum; i++)
            grid[i] = sc.next().toCharArray();
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        int blackCnt = 0;
        for(int i = 0; i < rowNum; i++) {
            for(int j = 0; j < colNum; j++) {
                if(grid[i][j] == '#') {
                    blackCnt++;
                    queue.offer(i * MOD + j);
                }
            }
        }
        
        int steps = bfs(grid, rowNum, colNum, queue);
        System.out.println(steps);
    }

    private static int bfs(char[][] grid, int rowNum, int colNum, Queue<Integer> queue) {
        int[] rows = new int[]{-1, 1, 0 , 0};
        int[] cols = new int[]{ 0, 0, -1, 1};

        int steps = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int pos = queue.poll();
                
                int curRow = pos / MOD;
                int curCol = pos % MOD;
                for(int j = 0; j < rows.length; j++) {
                    int nextRow = curRow + rows[j];
                    int nextCol = curCol + cols[j];
                    if(isValid(grid, nextRow, nextCol)) {
                        queue.offer(nextRow * MOD + nextCol);
                    }
                }
            }
            steps++;
        }
        return steps - 1;
    }

    private static boolean isValid(char[][] grid, int row, int col) {
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[row].length || grid[row][col] == '#')
            return false;
        grid[row][col] = '#';
        return true;
    }
}
