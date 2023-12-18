import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static byte[][] S;
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int Q = scan.nextInt();
        scan.nextLine();
        S = new byte[N][M];
        for(int i = 0; i < N; i++) {
            byte[] line = scan.nextLine().getBytes();
            S[i] = line;
        }

        Map<Key, Long> ans = new HashMap<>();

        for(int i = 0; i < Q; i++) {
            int y1 = scan.nextInt() - 1;
            int x1 = scan.nextInt() - 1;
            int y2 = scan.nextInt() - 1;
            int x2 = scan.nextInt() - 1;
            System.out.println(helper(x1, y1, x2, y2, ans));
        }
    }

    public static long helper(int x1, int y1, int x2, int y2, Map<Key, Long> ans) {
        Key pattern = new Key(x1, y1, x2, y2);
        if(ans.containsKey(pattern)) {
            return ans.get(pattern);
        }

        int height = y2- y1 + 1;
        int width = x2 - x1 + 1;
        byte[][] area = new byte[height][width];
        long count = 0;
        for(int x = x1; x <= x2; x++) {
            for(int y = y1; y <= y2; y++) {
                int areaY = y - y1;
                int areaX = x - x1;
                if(S[y][x] == '0') {
                    area[areaY][areaX] = '0';
                    continue;
                }
                if(area[areaY][areaX] == '1') {
                    continue;
                }
                count++;
                recusiveSearch(area, areaY, areaX, y, x);
            }
        }
        return count;
    }

    public static void recusiveSearch(byte[][] area, int areaY, int areaX, int y , int x) {
        if (areaY == area.length || areaX == area[0].length) {
            return;
        }
        if (S[y][x] == '0') {
            return;
        }
        if(area[areaY][areaX] != 0) {
            return;
        }
        area[areaY][areaX] = '1';
        if(areaY != 0) {
            recusiveSearch(area, areaY - 1, areaX, y - 1, x);
        }
        if(areaX != 0) {
            recusiveSearch(area, areaY, areaX - 1, y, x - 1);
        }
        recusiveSearch(area, areaY + 1, areaX, y + 1, x);
        recusiveSearch(area, areaY, areaX + 1, y, x + 1);
    }

    public static class Key {
        int x1;
        int y1;
        int x2;
        int y2;

        public Key(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Key)) return false;

            Key key = (Key) o;

            if (x1 != key.x1) return false;
            if (y1 != key.y1) return false;
            if (x2 != key.x2) return false;
            return y2 == key.y2;
        }

        @Override
        public int hashCode() {
            int result = x1;
            result = 31 * result + y1;
            result = 31 * result + x2;
            result = 31 * result + y2;
            return result;
        }
    }
}
