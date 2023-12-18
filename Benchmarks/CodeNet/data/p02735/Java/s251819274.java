
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int H = sc.nextInt(), W = sc.nextInt();
        boolean[][] map = new boolean[H][W];
        int[][] cost = new int[H][W];
        for(int i=0;i<H;i++){
            char[] c = sc.next().toCharArray();
            for(int j=0;j<W;j++){
                map[i][j] = String.valueOf(c[j]).equals(".");
                cost[i][j] = 999;
            }
        }
        cost[0][0] = map[0][0] ? 0 : 1;
        for(int i=1;i<H+W;i++){
            for(int j=0;j<=i;j++){
                if(j >= H || i-j >= W){
                    continue;
                }
                int costFromL = 999, costFromU = 999;
                if(j != 0){
                    costFromL = cost[j-1][i-j];
                    if(map[j-1][i-j] != map[j][i-j]){
                        costFromL++;
                    }
                }
                if(i-j != 0){
                    costFromU = cost[j][i-j-1];
                    if(map[j][i-j-1] != map[j][i-j]){
                        costFromU++;
                    }
                }
                cost[j][i-j] = Math.min(costFromL, costFromU);
                //System.out.println(j + ", " + (i-j) + ", " + cost[j][i-j]);
            }
        }
        if(cost[H-1][W-1] == 0){
            System.out.println("0");
        }else {
            System.out.println((cost[H - 1][W - 1] - 1) / 2 + 1);
        }
    }

    private static long combination(long n, long k){
        if(k <= 0 || n <= 0 || n <= k){
            return 1;
        }
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    private static long combination(long n, long k, long mod){
        if(k <= 0 || n <= 0 || n <= k){
            return 1;
        }
        return factorial(n, mod) / (factorial(k, mod) * factorial(n - k, mod)) % mod;
    }

    private static long factorial(long l){
        long ans = 1;
        while(l > 0){
            ans *= l;
            l--;
        }
        return ans;
    }

    private static long factorial(long l, long mod){
        long ans = 1;
        while(l > 0){
            ans *= l;
            ans %= mod;
            l--;
        }
        return ans;
    }
}
