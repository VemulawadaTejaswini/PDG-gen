import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    
    private static class Wall implements Comparable<Wall> {
        private final int idx;
        private final int len;
        
        private Wall(int idx, int len) {
            this.idx = idx;
            this.len = len;
        }
        
        @Override
        public boolean equals(Object o) {
            if (o instanceof Wall) {
                Wall w = (Wall) o;
                return idx == w.idx && len == w.len;
            }
            return false;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(idx, len);
        }
        
        @Override
        public int compareTo(Wall w) {
            return idx != w.idx
                    ? Integer.compare(idx, w.idx)
                    : Integer.compare(len, w.len);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        final int Q = sc.nextInt();
        
        // 盤上に残っている黒い石の数。
        long blacks = ((long) N - 2) * (N - 2);
        
        TreeSet<Wall> verticalWalls = new TreeSet<>();
        verticalWalls.add(new Wall(N - 2, N - 2));
        
        TreeSet<Wall> horizontalWalls = new TreeSet<>();
        horizontalWalls.add(new Wall(N - 2, N - 2));
        
        for (int i = 0; i < Q; i++) {
            boolean isVertical = sc.nextInt() == 1;
            int idx = sc.nextInt() - 2;
            
            if (isVertical) {
                Wall wall = horizontalWalls.stream().filter(w -> idx < w.len).findFirst().get();
                blacks -= wall.idx;
                verticalWalls.add(new Wall(idx, wall.idx));
                
            } else {
                Wall wall = verticalWalls.stream().filter(w -> idx < w.len).findFirst().get();
                blacks -= wall.idx;
                horizontalWalls.add(new Wall(idx, wall.idx));
            }
        }
        
        System.out.println(blacks);
    }
}
