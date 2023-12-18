import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] s = new int[m][n];
        for(int i = 0; i < m; i++){
            int k = scanner.nextInt();
            for(int j = 0; j < k; j++){
                s[i][j] = scanner.nextInt();
            }
        }
        int[] p = new int[m];
        for(int i = 0; i < m; i++){
            p[i] = scanner.nextInt();
        }
        int total = 0;
        for(int i = 0; i < Math.pow(2,n); i++){
            int[] ans = new int[m];
            for(int j = 0; j < n; j++){
                if ((1&i>>j) == 1) {
                    for(int l = 0; l < m; l++){
                        ans[l] = (ans[l] + s[l][j])%2;
                    }
                }
            }
            int count = 0;
            for(int l = 0; l < m; l++){
                if(ans[l] == p[l]){count++;}
            }
            if(count == m){total++;}
        }
        System.out.println(total);
    }
}