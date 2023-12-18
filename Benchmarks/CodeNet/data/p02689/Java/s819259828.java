import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        long[] h = new long[n];
        boolean[][] ab = new boolean[n][n];

        for(int i=0; i<n; i++){
            h[i] = sc.nextInt();
        }
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            ab[a-1][b-1] = true;
            ab[b-1][a-1] = true;
        }

        int total = 0;
        for(int i=0; i<n; i++){
            boolean flag = true;
            for(int j=0; j<n; j++){
                if(ab[i][j] && h[i] <= h[j]){
                    flag = false;
                    break;
                }
            }
            if(flag)total++;
        }
        System.out.println(total);
    }
}