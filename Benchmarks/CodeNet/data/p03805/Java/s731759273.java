import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] v = new boolean[n];
        boolean[][] g = new boolean[n][n];
        for(int i = 0;i < m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            g[a-1][b-1] = true;
            g[b-1][a-1] = true;
        }
        int cnt = 0;
        cnt = dfs(0,n,cnt,g,v);
        System.out.println(cnt);
    }
    public static int dfs(int i,int n,int cnt,boolean[][] g,boolean[] v){
        boolean all_visited = true;
        for(int j = 0;j < n;j++){
            if(!v[i]){
                all_visited = false;
            }
        }
        if(all_visited){
            cnt++;
            return cnt;
        }
        for(int j = 0;j < n;j++){
            if(!g[i][j]){
                continue;
            }
            v[j] = true;
            cnt = dfs(j,n,cnt,g,v);
        }
        return cnt;
    }
}
