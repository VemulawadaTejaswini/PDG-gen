import java.util.Scanner;

public class Main {
    
    static int n, m, q, max;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        n = Integer.parseInt(sc.next());
        m = Integer.parseInt(sc.next());
        q = Integer.parseInt(sc.next());
        int[][] abcd = new int[q][4];
        for(int i = 0; i < q; i++){
            for(int j = 0; j < 4; j++){
                abcd[i][j] = Integer.parseInt(sc.next());
            }
        }
        max = 0;
        dfs(new int[n+1], abcd, 0);
        System.out.println(max);
    }
    
    static void dfs(int[] a, int[][] abcd, int i){
        if(i > n){
            int point = 0;
            for(int j = 0; j < q; j++){
                if(a[abcd[j][1]] - a[abcd[j][0]] == abcd[j][2]){
                    point += abcd[j][3];
                }
            }
            if(point > max) max = point;
            return;
        }
        
        int k = (i == 0) ? 1 : a[i-1];
        for(int j = k; j <= m; j++){
            a[i] = j;
            dfs(a, abcd, i+1);
        }
    }
}