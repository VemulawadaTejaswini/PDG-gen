import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf  = 1 << 61;
    static int[] x4 = {-1, 0, 0, 1};
    static int[] y4 = {0, -1, 1, 0};
    static int[] x8 = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] y8 = {0, -1, -1, -1, 0, 1, 1, 1};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            int w = Integer.parseInt(in.next());
            int h = Integer.parseInt(in.next());
            if(w == 0 && h == 0) break;

            char[][] map = new char[h][w];
            for(int i = 0; i < h; i++){
                for(int j = 0; j < w; j++) {
                    map[i][j] = in.next().charAt(0);
                }
            }

            int ans = 0;
            for(int i = 0; i < h; i++) {
                for(int j = 0; j < w; j++) {
                    if(map[i][j] == '1') {
                        ans++;
                        ArrayDeque<P> queue = new ArrayDeque<>();
                        queue.push(new P(i, j));
                        while(!queue.isEmpty()) {
                            P c = queue.pop();
                            map[c.x][c.y] = '0';
                            for(int k = 0; k < 8; k++) {
                                int x = c.x + x8[k];
                                int y = c.y + y8[k];
                                if(0 <= x && x < h && 0 <= y && y < w && map[x][y] == '1') {
                                    P neibor = new P(c.x+x8[k], c.y+y8[k]);
                                    queue.push(neibor);
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }

    static public void printArray2D(char[][] map) {
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.format("%c\t", map[i][j]);
            }
            System.out.print("\n");
        }
    }
}

class P {
    int x, y;
    P(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

