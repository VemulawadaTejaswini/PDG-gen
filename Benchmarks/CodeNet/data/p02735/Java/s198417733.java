import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] field = new char[h][];
        int[][] results = new int[h][w];
        for (int i = 0; i < h; i++) {
            field[i] = sc.next().toCharArray();
            Arrays.fill(results[i], Integer.MAX_VALUE);
        }
        PriorityQueue<Path> queue = new PriorityQueue<>();
        int start = 0;
        if (field[0][0] == '#') {
            start = 1;
        }
        queue.add(new Path(start, 0, 0));
        while (queue.size() > 0) {
            Path p = queue.poll();
            if (results[p.row][p.col] <= p.value) {
                continue;
            }
            results[p.row][p.col] = p.value;
            if (p.row > 0) {
                int next = 0;
                if (field[p.row][p.col] == '.' && field[p.row - 1][p.col] == '#') {
                    next ++;
                }
                queue.add(new Path(p.value + next, p.row - 1, p.col));
            }
            if (p.row < h - 1) {
                int next = 0;
                if (field[p.row][p.col] == '.' && field[p.row + 1][p.col] == '#') {
                    next ++;
                }
                queue.add(new Path(p.value + next, p.row + 1, p.col));
            }
            if (p.col > 0) {
                int next = 0;
                if (field[p.row][p.col] == '.' && field[p.row][p.col - 1] == '#') {
                    next ++;
                }
                queue.add(new Path(p.value + next, p.row, p.col - 1));
            }
            if (p.col < w - 1) {
                int next = 0;
                if (field[p.row][p.col] == '.' && field[p.row][p.col + 1] == '#') {
                    next ++;
                }
                queue.add(new Path(p.value + next, p.row, p.col + 1));
            }
        }
        System.out.println(results[h - 1][w - 1]);
    }
    
    static class Path implements Comparable<Path> {
        int value;
        int row;
        int col;
        
        public Path(int value, int row, int col) {
            this.value = value;
            this.row = row;
            this.col = col;
        }
        
        public int compareTo(Path another) {
            return value - another.value;
        }
    }
}