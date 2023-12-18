import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        int[][] p = new int[n][d];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < d;j++){
                p[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        for(int i = 0;i < n;i++) {
            for (int j = i+1; j < n; j++) {
                int dis = 0;
                for(int k = 0;k < d;k++){
                    dis += Math.pow(p[i][k]-p[j][k], 2);
                }
                double sqrt = Math.sqrt((double)dis);
                if((double)((int)sqrt) == sqrt){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

}

