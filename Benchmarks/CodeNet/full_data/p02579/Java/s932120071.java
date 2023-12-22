import java.util.*;

public class Main {
    
    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
    
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int ch = Integer.parseInt(sc.next()) -1;
        int cw = Integer.parseInt(sc.next()) -1;
        int dh = Integer.parseInt(sc.next()) -1;
        int dw = Integer.parseInt(sc.next()) -1;
        char[][] s = new char[h][w];
        for(int i = 0; i < h; i++){
            s[i] = sc.next().toCharArray();
        }
    
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int[] dx2 = {-2, -1,  0,  1,  2, -2, -1,  1,  2, -2, 2, -2, -1, 1, 2, -2, -1, 0, 1, 2};
        int[] dy2 = {-2, -2, -2, -2, -2, -1, -1, -1, -1,  0, 0,  1,  1, 1, 1,  2,  2, 2, 2, 2};
        
        var warp = new int[h][w];
        for(int i = 0; i < h; i++){
            Arrays.fill(warp[i], -1);
        }
        warp[ch][cw] = 0;
        var queue = new ArrayDeque<Pair>();
        queue.add(new Pair(cw, ch));
        var done = new boolean[h][w];
        done[ch][cw] = true;
        int warpCount = 0;
        while(!queue.isEmpty()){
            var set = new HashSet<Integer>();
            while(!queue.isEmpty()){
                int x = queue.peek().x;
                int y = queue.poll().y;
                for(int i = 0; i < 4; i++){
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    if(nx < 0 || w <= nx || ny < 0 || h <= ny) continue;
                    if(warp[ny][nx] == -1 && s[ny][nx] == '.'){
                        warp[ny][nx] = warp[y][x];
                        queue.add(new Pair(nx, ny));
                        done[ny][nx] = true;
                    }
                }
                for(int i = 0; i < 20; i++){
                    int nx = x + dx2[i];
                    int ny = y + dy2[i];
                    if(nx < 0 || w <= nx || ny < 0 || h <= ny) continue;
                    if(!done[ny][nx]){
                        set.add(nx*10000 + ny);
                    }
                }
            }
            warpCount++;
            for(Integer i : set){
                int x = i / 10000;
                int y = i % 10000;
                if(!done[y][x]){
                    done[y][x] = true;
                    if(s[y][x] == '.'){
                        warp[y][x] = warpCount;
                        queue.add(new Pair(x, y));
                    }
                }
            }
        }
        System.out.println(warp[dh][dw]);
    }
    
    static class Pair {
        int x, y;
        
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}