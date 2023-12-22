import java.util.*;

public class Main {
    public static class Puzzle {
        int[][] puzzle;
        int[] prevMove;
        int count;
        int x;
        int y;

        Puzzle(int[][] puzzle, int[] prevMove, int count, int x, int y) {
            this.puzzle = puzzle;
            this.prevMove = prevMove;
            this.count = count;
            this.x = x;
            this.y = y;
        }
    }

    private static final int[][] completePuzzle = {{0,1,2,3,},{4,5,6,7}};
    private static final int[][] directions = {{1,0}, {0,1}, {-1,0}, {0,-1}};
    private static LinkedList<Puzzle> queue;


    private static boolean compPuzzle(int[][] puzzle, int[][] other) {
        boolean same = true;
        for (int i = 0; i < puzzle.length; i++) {
            for (int j = 0; j < puzzle[i].length; j++) {
                if (puzzle[i][j] != other[i][j])
                    same = false;
            }
        }

        return same;
    }

    public static int[][] swap(int x, int y, int nx, int ny, int[][] puzzle) {
        // copy puzzle to newPuzzle
        int[][] newPuzzle = new int[puzzle.length][puzzle[0].length];
        for (int i = 0; i < puzzle.length; i++) {
            System.arraycopy(puzzle[i], 0, newPuzzle[i], 0, puzzle[i].length);
        }

        int temp = puzzle[ny][nx];
        newPuzzle[y][x] = temp;
        newPuzzle[ny][nx] = 0;

        return newPuzzle;
    }

    private static int solve(int[] numbers) {
        int x = 0, y = 0;
        int[][] puzzle = new int[2][4];
        System.arraycopy(numbers, 0, puzzle[0], 0, 4);
        System.arraycopy(numbers, 4, puzzle[1], 0, 4);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if (puzzle[i][j] == 0) {
                    x = j;
                    y = i;
                }
            }
        }

        queue = new LinkedList<>();
        queue.add(new Puzzle(puzzle, new int[]{0,0}, 0, x, y));

        Puzzle temp;
        int nx, ny;

        while (!queue.isEmpty()) {
            temp = queue.poll();
            if (compPuzzle(temp.puzzle, completePuzzle))
                return temp.count;

            for (int[] direction: directions) {
                nx = temp.x + direction[0];
                ny = temp.y + direction[1];

                if (nx >= 0 && nx < 4 && ny >= 0 && ny < 2) {
                    if (!(temp.prevMove[0] == -direction[0] && temp.prevMove[1] == -direction[1])) {
                        int[][] newPuzzle = swap(temp.x, temp.y, nx, ny, temp.puzzle);
                        queue.add(new Puzzle(newPuzzle, direction.clone(), temp.count+1, nx, ny));
                    }
                }
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lineInput;

        while (sc.hasNext()) {
            lineInput = sc.nextLine().split(" ");
            int[] numbers = Arrays.stream(lineInput).mapToInt(Integer::parseInt).toArray();
            System.out.println(solve(numbers));
        }
    }
}