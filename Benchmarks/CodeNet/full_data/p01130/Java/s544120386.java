import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static int[][] d;

    public static void main(String[] args) {
        while (true){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            int g1 = sc.nextInt();
            int g2 = sc.nextInt();
            if(n==0) break;

            d= new int[n+1][n+1];

            scanLoad(m);
            warshallFloyd(n);
            calcCost(n,s,g1,g2);

        }


    }

    static void warshallFloyd(int n) { // nは頂点数
        for (int i = 1; i <= n; i++)      // 経由する頂点
            for (int j = 1; j <= n; j++)    // 開始頂点
                for (int k = 1; k <= n; k++)  // 終端
                    d[j][k] = Math.min(d[j][k], d[j][i] + d[i][k]);
    }

    static void scanLoad(int m){
        for(int i=0;i<m;i++){
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();
            int c = sc.nextInt();

            d[b1][b2]=c;
        }
    }
    static void calcCost(int n,int s,int g1,int g2){
        int min=1000;
        for(int i=1;i<=n;i++){
            if((s != i && d[s][i]==0) || (g1 != i && d[i][g1]==0) || (g2 != i && d[i][g2]==0))
                continue;
            min=Math.min(min,d[s][i]+d[i][g1]+d[i][g2]);
        }
        System.out.println(min);
    }
}