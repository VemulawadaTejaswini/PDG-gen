import java.util.*;
public class Main {
    static int MOD = 100;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rowNum = sc.nextInt();
        int colNum = sc.nextInt();
        char[][] grid = new char[rowNum][colNum];
        for(int i = 0; i < rowNum; i++)
            grid[i] = sc.next().toCharArray();

        int steps = bfs(grid, rowNum, colNum);
        if(steps == -1) {
            System.out.println(steps);
            return;
        }
        int blackCnt = 0;
        for(int i = 0; i < rowNum; i++) {
            for(char c : grid[i]) {
                if(c == '#')
                    blackCnt++;
            }
        }
        System.out.println(rowNum * colNum - blackCnt - steps);
    }

    private static int bfs(char[][] grid, int rowNum, int colNum) {
        int[] rows = new int[]{-1, 1, 0 , 0};
        int[] cols = new int[]{ 0, 0, -1, 1};

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);

        boolean[][] visited = new boolean[rowNum][colNum];
        visited[0][0] = true;

        int curRow = 0, curCol = 0;
        int nextRow = 0, nextCol = 0;
        int steps = 1;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int pos = queue.poll();
                if(pos / MOD == rowNum - 1 &&  pos %  MOD == colNum - 1) {
                    return steps;
                }
                curRow = pos / MOD;
                curCol = pos % MOD;
                for(int j = 0; j < rows.length; j++) {
                    nextRow = curRow + rows[j];
                    nextCol = curCol + cols[j];
                    if(isValid(grid, visited, nextRow, nextCol)) {
                        queue.offer(nextRow * MOD + nextCol);
                    }
                }
            }
            steps++;
        }
        return -1;
    }

    private static boolean isValid(char[][] grid, boolean[][] visited, int row, int col) {
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[row].length || 
        visited[row][col] || grid[row][col] == '#')
            return false;
        visited[row][col] = true;
        return true;
    }
}
