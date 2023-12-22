import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
//    List<Pair> list = new ArrayList<>();
    int c1 = sc.nextInt() - 1;
    int c2 = sc.nextInt() - 1;
    int d1 = sc.nextInt() - 1;
    int d2 = sc.nextInt() - 1;
    char[][] arr = new char[h][w];
    int[] dy = {1, 0, -1, 0};
    int[] dx = {0, 1, 0, -1};
    int[][] warpCnt = new int[h][w];
    boolean[][] flag = new boolean[h][w];


    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        for (int i=0; i<h; i++) {
            arr[i] = sc.next().toCharArray();
        }

        bfs(new Pair(d1, d2, 0));

//        for (int i=0; i<h; i++) {
//            for (int j=0; j<w-1; j++) {
//                System.out.print(warpCnt[i][j] + " ");
//            }
//            System.out.println(warpCnt[i][w-1]);
//        }

        if (!flag[c1][c2]) {
            System.out.println(-1);
        } else {
            System.out.println(warpCnt[c1][c2]);
        }
    }

    void bfs(Pair pair){
        PriorityQueue<Pair> queue = new PriorityQueue<>();
        queue.add(pair);
        while (!queue.isEmpty()){
            Pair p = queue.peek();
            int y = p.y;
            int x = p.x;
            flag[y][x] = true;
            for (int yy=-2; yy<=2; yy++) {
                for (int xx=-2; xx<=2; xx++) {
                    if (yy==0 && xx==0) continue;
                    int ny = y + yy;
                    int nx = x + xx;
                    if (ny<0 || h<=ny || nx<0 || w<=nx) continue;
                    if (arr[ny][nx] == '#') continue;
                    if (flag[ny][nx]) continue;
                    boolean tmpF = innerBfs(new Pair(ny, nx, p.cost), y, x);
                    if (!tmpF) {
                        warpCnt[ny][nx] = warpCnt[y][x] + 1;
                        queue.add(new Pair(ny, nx, warpCnt[ny][nx] + 1));
                    }
                    else {
                        warpCnt[ny][nx] = warpCnt[y][x];
                        queue.add(new Pair(ny, nx, warpCnt[ny][nx]));
                    }
                    flag[ny][nx] = true;
                }
            }

            queue.poll();
        }
    }

    boolean innerBfs(Pair pair, int y, int x) {
        boolean[][] innerF = new boolean[h][w];
        Queue<Pair> queue = new ArrayDeque<>();
        queue.add(pair);
        while (!queue.isEmpty()) {
            Pair p = ((ArrayDeque<Pair>) queue).peekFirst();
            int inY = p.y;
            int inX = p.x;
            innerF[inY][inX] = true;
            for (int i=0; i<4; i++) {
                int ninY = inY + dy[i];
                int ninX = inX + dx[i];
                if (ninY < y-2 || y+2 < ninY || ninX < x-2 || x+2 < ninX || ninY<0 || h<=ninY || ninX<0 || w<=ninX) continue;
                if (innerF[ninY][ninX]) continue;
//                System.out.println(ninY);
//                System.out.println(ninX);
                if (arr[ninY][ninX] == '#') continue;
                queue.add(new Pair(ninY, ninX, pair.cost));
                innerF[ninY][ninX] = true;
            }
            queue.poll();
        }
        if (innerF[y][x]) return true;
        else return false;
    }




//    class Pair {
//        int y;
//        int x;
//        public Pair(int y, int x) {
//            this.y = y;
//            this.x = x;
//        }
//    }

    class Pair implements Comparable<Pair> {
        int y;
        int x;
        int cost;
        public Pair(int y, int x, int cost) {
            this.y = y;
            this.x = x;
            this.cost = cost;
        }

        public int compareTo(Pair pair) {
            if (this.cost<pair.cost) return -1;
            if (this.cost>pair.cost) return 1;
            return 0;
        }
    }


}

