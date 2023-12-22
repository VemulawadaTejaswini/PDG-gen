import java.util.Scanner;

public class Main {
    // 0 = sea 1= land
    static char[][] island ;
    static boolean[][] visited ;
    static int w ,h;
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        w = sc.nextInt();
        h = sc.nextInt();
        island = new char[h][w];
        visited = new boolean[h][w];
        int cnt = 0;
        for (int i = 0; i < h; i++) {
            island[i] = sc.next().toCharArray();
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                for (int k = 0; k < h; k++) {
                    for (int l = 0; l < w; l++) {
                        //falseに
                        visited[k][l] = false;
                    }
                }
                if (dfs(i, j) != 0){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    static int dfs(int x, int y) {
        if (x < 0 || x >= h || y < 0 || y >= w)
            return 0;
        //海であった場合
        if (island[x][y] == '0')
            return 0;
        //探索していれば
        if (visited[x][y])
            return 0;
        visited[x][y] = true;
        //隣り合ういずれかに陸地がある
        return dfs(x + 1, y) + dfs(x, y + 1) + dfs(x - 1, y) +
                dfs(x, y - 1) +dfs(x+1,y-1)+dfs(x-1,y+1) +
                dfs(x + 1, y+1)+ dfs(x - 1, y-1) +1;
    }
}

