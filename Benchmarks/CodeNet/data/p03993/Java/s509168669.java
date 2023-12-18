import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] b = new boolean[n][n];
        for(int i = 0;i<n;i++){
            b[i][sc.nextInt()-1] = true;
        }
        int ans = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(b[i][j]&&b[j][i])ans++;
            }
        }
        System.out.println(ans/2);
    }
}