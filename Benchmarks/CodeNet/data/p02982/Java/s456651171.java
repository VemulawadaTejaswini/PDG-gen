import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] p = new int[n][d];
        int ans = 0;
        for(int i = 0; i < n;i++){
            for(int j = 0;j < d;j++){
                p[i][j] = sc.nextInt();
            }
        }

        for(int i = 0;i < n;i++){
            for(int j = i+1;j < n;j++){
                int sum = 0;
                for(int k = 0;k<d;k++){
                    sum += Math.pow(p[i][k]-p[j][k], 2);
                }
                if((double)Math.sqrt(sum)==(double)((int)Math.sqrt(sum))){
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }
}