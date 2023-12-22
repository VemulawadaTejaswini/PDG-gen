import java.util.Scanner;

public class Main {
    static int[][][] caves = new int[2][1000][1000];
    static boolean[] primes = new boolean[1000000];
    static int[][] dp = new int[2][1000];
    static int[] vx = {1, 0, -1, 0};
    static int[] vy = {0, -1, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MakeCaves();
        while (true){
            int m = sc.nextInt();
            int n = sc.nextInt();
            if(m==0 && n==0) break;

            int x = -1, y = -1;
            for (int i = 0; i < 1000; i++) {
                for (int j = 0; j < 1000; j++) {
                    if(caves[0][i][j]==n){
                        x = j; y = i;
                        break;
                    }
                }
                if(x!=-1) break;
            }
            for (int i = 0; i <1000 ; i++) {
                dp[0][i] = dp[1][i] = 0;
            }

            int max = 0, dy = 0, mx = x, my = y;
            while (y+dy<1000){
                for (int i = (x-dy>=0)?x-dy:0; i <= ((x+dy<1000)?x+dy:999); i++) {
                    if(caves[0][y+dy][i]>m) continue;
                    dp[dy%2][i] = dp[(dy+1)%2][i] + caves[1][y+dy][i];
                    if(i>0&&dp[(dy+1)%2][i-1]!=0){
                        dp[dy%2][i] = Math.max(dp[dy%2][i], dp[(dy+1)%2][i-1] + caves[1][y+dy][i]);
                    }
                    if(i<999&&dp[(dy+1)%2][i+1]!=0){
                        dp[dy%2][i] = Math.max(dp[dy%2][i], dp[(dy+1)%2][i+1] + caves[1][y+dy][i]);
                    }
                    if(max<dp[dy%2][i]){
                        max = dp[dy%2][i];
                        mx = i; my = y + dy;
                    }else if(max==dp[dy%2][i] && caves[1][y+dy][i]==1){
                        if(caves[0][my][mx]<caves[0][y+dy][i]){
                            mx = i; my = y + dy;
                        }
                    }
                }
                dy++;
            }
            System.out.println(max+" "+((max!=0)?caves[0][my][mx]:0));
        }
    }

    static void FindPrimes() {
        primes[0] = true;
        for (int i = 1; i < 500000; i++) {
            if(primes[i]) continue;
            int j = (i+1)*2;
            while (j<1000000){
                primes[j-1] = true;
                j += i+1;
            }
        }
    }

    static void MakeCaves() {
        int n = 2, x = 499, y = 500;
        FindPrimes();
        caves[0][y][x] = 1;
        caves[1][y][x] = 0;

        for (int i = 0; i < 2000; i++) {
            for (int j = 0; j <= i/2; j++, n++) {
                if(n==1000001) break;
                x+=vx[i%4]; y+=vy[i%4];
                caves[0][y][x] = n;
                caves[1][y][x] = (primes[n-1])?0:1;
            }
        }
    }
}