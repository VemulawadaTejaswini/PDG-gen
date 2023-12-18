import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        int[][] sums = new int[h + 1][w + 1];
        for (int i = 1; i <= h; i++) {
            char[] arr = sc.next().toCharArray();
            for (int j = 1; j <= w; j++) {
                sums[i][j] = sums[i - 1][j] + sums[i][j - 1] - sums[i - 1][j - 1];
                if (arr[j - 1] == '1') {
                    sums[i][j]++;
                }
            }
        }
        ArrayList<ArrayList<Unit>> list = new ArrayList<>();
        int start = k;
        for (int i = 1; i <= h; i++) {
            start = Math.max(start, sums[i][w] - sums[i - 1][w]);
        }
        int last = 0;
        for (int i = start; i <= sums[h][w]; i++) {
            int up = 0;
            int down = up + 1;
            ArrayList<Unit> each = new ArrayList<>();
            while (up < h) {
                while (down < h && sums[down + 1][w] - sums[up][w] <= i) {
                    down++;
                }
                each.add(new Unit(up, down));
                up = down;
                down = up + 1;
            }
            if (last != each.size()) {
                list.add(each);
                last = each.size();
            }
        }
        int min = Integer.MAX_VALUE;
        for (ArrayList<Unit> each : list) {
            int left = 0;
            int right = left + 1;
            int count = 0;
            while (left < w) {
                if (getMax(left, right, each, sums) > k) {
                    count = Integer.MAX_VALUE / 2;
                    break;
                }
                while (right < w && getMax(left, right + 1, each, sums) <= k) {
                    right++;
                }
                count++;
                left = right;
                right = left + 1;
            }
            min = Math.min(min, each.size() - 1 + count - 1);
        }
        System.out.println(min);
   }
   
   static int getMax(int left, int right, ArrayList<Unit> each, int[][] sums) {
       int max = 0;
       for (Unit u : each) {
           max = Math.max(max, sums[u.down][right] - sums[u.up][right] - sums[u.down][left] + sums[u.up][left]);
       }
       return max;
   }
   
   static class Unit {
       int up;
       int down;
       
       public Unit(int up, int down) {
           this.up = up;
           this.down = down;
       }
       
       public String toString() {
           return up + ":" + down;
       }
   }
}