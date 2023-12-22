import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            if (w + h == 0) {
                break;
            }

            int[][] maze = new int[2*h+1][2*w+1];
            maze_init(maze, 2*h+1, 2*w+1);

            for (int i=0; i<2*h-1; ++i) {
                for (int j=0; j<w-1+i%2; ++j) {
                    maze[i+1][2-(i%2)+j*2] = sc.nextInt();
                }
            }
            maze = bfs(maze);
        }
        sc.close();
    }

    private static int[][] bfs(int[][] maze) {
        Queue<CurrentNode> queue = new ArrayDeque<>();
        CurrentNode node = new CurrentNode(maze, 1, 1, 0);
        queue.add(node);

        while (queue.size() > 0) {
            node = queue.poll();
            node.maze[node.icur][node.jcur] = 2;
            if (node.icur + node.jcur == maze.length + maze[0].length - 4) break;
            for (int i=0; i<2; ++i) {
                for (int j=0; j<2; ++j) {
                    int inext = node.icur + (j*2-1)*i;
                    int jnext = node.jcur + (j*2-1)*(-1*i+1);
                    if (node.maze[inext][jnext] == 0) {
                        CurrentNode next = new CurrentNode(node.maze, inext, jnext, node.count+1);
                        queue.add(next);
                    }
                }
            }
        }

        System.out.println(node.icur + node.jcur == maze.length + maze[0].length - 4 ? node.count / 2 + 1 : 0);
        return node.maze;
    }

    private static void maze_init(int[][] maze, int height, int width) {
        for (int i=0; i<height; ++i) {
            for (int j=0; j<width; ++j) {
                if (i == 0 || i == height-1) maze[i][j] = 1;
                else if (j == 0 || j == width-1) maze[i][j] = 1;
                else if (i % 2 + j % 2 == 0) maze[i][j] = 1;
            }
        }
    }

    private static class CurrentNode {
        private int[][] maze;
        private int icur;
        private int jcur;
        private int count = 0;

        private CurrentNode(int[][] maze, int icur, int jcur, int count) {
            this.icur = icur;
            this.jcur = jcur;
            this.count = count;
            this.maze = new int[maze.length][maze[0].length];
            for (int i=0; i<maze.length; ++i) {
                for (int j=0; j<maze[i].length; ++j) {
                    this.maze[i][j] = maze[i][j];
                }
            }
        }
    }
}
