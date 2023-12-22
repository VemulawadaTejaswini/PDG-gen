import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
    static int w;
    static int h;
    static int[][] vWalls;
    static int[][] hWalls;
    static State[][] mazes;
    static Queue<State> queue;
    static class State {
        int x, y, minStep;
        State(int x, int y) {
            this.x = x;
            this.y = y;
            this.minStep = 0;
        }
    }

    static int bfs() {
        while(!queue.isEmpty()) {
            State p = queue.remove();//先頭要素を取り出す
            int x = p.x;
            int y = p.y;
            if(x == w-1 && y == h-1) {
                return p.minStep;
            }
            if(x+1 < w && vWalls[x][y] == 0  && mazes[x+1][y].minStep == 0) {
                mazes[x+1][y].minStep = p.minStep + 1;
                queue.add(mazes[x+1][y]);//行き先を訪問に加える
            }
            if(x-1 > 0 && vWalls[x-1][y] == 0  && mazes[x-1][y].minStep == 0) {
                mazes[x-1][y].minStep = p.minStep + 1;
                queue.add(mazes[x-1][y]);
            }
            if(y + 1 < h && hWalls[x][y] == 0  && mazes[x][y+1].minStep == 0) {
                mazes[x][y+1].minStep = p.minStep + 1;
                queue.add(mazes[x][y+1]);
            }
            if(y-1 > 0  && mazes[x][y-1].minStep == 0) {
                mazes[x][y-1].minStep = p.minStep + 1;
                queue.add(mazes[x][y-1]);
            }
        }
        return 0;
    }

    public  static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while(sc.hasNext()) {
                w = sc.nextInt();
                h = sc.nextInt();
                if(w == 0 && h == 0) {
                    break;
                }
                vWalls = new int[w-1][h];
                hWalls = new int[w][h];
                mazes = new State[w][h];
                for(int y = 0; y < h-1; y++) {
                    for(int x = 0; x < w - 1; x++) {
                        vWalls[x][y] = sc.nextInt();
                    }
                    for(int x = 0; x < w ; x++) {
                        hWalls[x][y] = sc.nextInt();
                    }
                }
                for(int x = 0; x < w - 1; x++) {
                    vWalls[x][h-1] = sc.nextInt();
                }
                for(int y = 0; y < h; y++) {
                    for(int x = 0; x < w; x++) {
                        mazes[x][y] = new State(x,y);
                    }
                }
                queue = new LinkedList<>();
                mazes[0][0].minStep = 1;
                queue.add(mazes[0][0]);
                System.out.println(bfs());
            }
        }
    }
}
