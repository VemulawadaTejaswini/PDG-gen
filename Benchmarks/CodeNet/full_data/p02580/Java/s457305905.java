import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] array = new int[h][w];
        int[] countr = new int[h];
        int[] countc = new int[w];
        Set<Integer> setr = new HashSet<Integer>();
        Set<Integer> setc = new HashSet<Integer>();
        for (int i = 0; i < m; i++) {
            int row = sc.nextInt()-1;
            int col = sc.nextInt()-1;
            array[row][col] = 1;
            countr[row]++;
            countc[col]++;
            setr.add(row);
            setc.add(col);
        }
        
        // ans: r行すべてとc列すべてにある爆弾の個数の最大値
        int ans = 0;
        
        for (Integer r : setr) {
            for (Integer c : setc) {
                int res = countr[r] + countc[c] - array[r][c];
                ans = Math.max(ans, res);
            }
        }
        System.out.println(ans);
    }
}
