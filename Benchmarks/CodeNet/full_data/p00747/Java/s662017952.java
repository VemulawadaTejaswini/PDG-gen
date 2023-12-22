import java.util.ArrayDeque;
import java.util.ArrayList;
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
            bfs(maze, 2*h+1, 2*w+1);
        }
        sc.close();
    }

    private static void bfs(int[][] maze, int height, int width) {
        Queue<CurrentNode> queue = new ArrayDeque<>();
        ArrayList<Integer> mem = new ArrayList<>();
        CurrentNode node = new CurrentNode(1, 1, 1);
        queue.add(node);
        mem.add(width+1);

        while (queue.size() > 0) {
            node = queue.poll();
            if (node.icur + node.jcur == height + width - 4) break;
            for (int i=0; i<2; ++i) {
                for (int j=0; j<2; ++j) {
                    int inext = (j*2-1)*i;
                    int jnext = (j*2-1)*(-1*i+1);
                    int encode = (node.icur + inext*2)*width + node.jcur + jnext*2;
                    if (maze[node.icur + inext][node.jcur + jnext] == 0 && !mem.contains(encode)) {
                        CurrentNode next = new CurrentNode(node.icur + inext*2, node.jcur + jnext*2, node.count+1);
                        mem.add(encode);
                        queue.add(next);
                    }
                }
            }
        }

        System.out.println(node.icur + node.jcur == height + width - 4 ? node.count : 0);
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
        private int icur;
        private int jcur;
        private int count = 0;

        private CurrentNode(int icur, int jcur, int count) {
            this.icur = icur;
            this.jcur = jcur;
            this.count = count;
        }
    }
}
