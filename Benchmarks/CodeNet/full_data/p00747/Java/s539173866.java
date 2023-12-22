import java.util.*;

public class Main {
    private static Scanner scanner;

    public static int[] inputIntArray(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; ++i) {
            res[i] = scanner.nextInt();
        }

        return res;
    }
    
    public static class Pair<A, B> {
        public A left;
        public B right;

        public Pair(A a, B b) {
            this.left = a;
            this.right = b;
        }
    }
    
    public static class Value {
        int y, x, v;
        
        public Value(int y, int x, int v) {
            this.y = y;
            this.x = x;
            this.v = v;
        }
    }

    public static boolean run() {
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        
        if(w == 0)
            return false;
        
        int[][] vert = new int[h][w];
        int[][] hori = new int[h][w];
        boolean[][] reached = new boolean[h][w];
        
        for(int i = 0; i < h; ++i) {
            for(int j = 0; j < w - 1; ++j) {
                vert[i][j] = scanner.nextInt();
            }

            if(i == h - 1)
                continue;

            for(int j = 0; j < w; ++j) {
                hori[i][j] = scanner.nextInt();
            }
        }
        Queue<Value> que = new ArrayDeque<>();
        
        que.add(new Value(0, 0, 1));
        
        while(!que.isEmpty()) {
            Value pos = que.poll();
            
            if(reached[pos.y][pos.x])
                continue;
            
            reached[pos.y][pos.x] = true;
            
            if(pos.y == h - 1 && pos.x == w - 1) {
                System.out.println(pos.v);
                
                return true;
            }
            
            if(pos.x < w - 1 && vert[pos.y][pos.x] == 0) {
                que.add(new Value(pos.y, pos.x + 1, pos.v + 1));
            }
            if(pos.x > 0 && vert[pos.y][pos.x - 1] == 0) {
                que.add(new Value(pos.y, pos.x - 1, pos.v + 1));
            }
            if(pos.y < h - 1 && hori[pos.y][pos.x] == 0) {
                que.add(new Value(pos.y + 1, pos.x, pos.v + 1));
            }
            if(pos.y > 0 && hori[pos.y - 1][pos.x] == 0) {
                que.add(new Value(pos.y - 1, pos.x, pos.v + 1));
            }
        }
        
        System.out.println(0);
        return true;
    }

    public static void main(String args[]) {
        scanner = new Scanner(System.in);
        
        while(run());
    }
}
