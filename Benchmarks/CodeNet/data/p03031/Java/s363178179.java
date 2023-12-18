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
                int tmp = scanner.nextInt();
                s[i][tmp-1]++;
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
                    int index = 0;
                    for(int l = 0; l < m; l++){
                        ans[l] += s[l][j];
                    }
                }
            }
            int count = 0;
            for(int l = 0; l < m; l++){
                //System.out.print(ans[l]);
                if(ans[l]%2 == p[l]){count++;}
            }
            if(count == m){total++;}
        }
        System.out.println(total);
    }
}