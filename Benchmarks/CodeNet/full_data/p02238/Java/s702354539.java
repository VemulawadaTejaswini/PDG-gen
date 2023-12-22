import java.util.*;
public class Main{   
    static int n;//頂点数
    static boolean[][] side;//辺があるかどうか
    static int[] visit;//訪問済みかどうか
    static int[] start;
    static int[] end;
    static int time=1;    
    static void dfs(int x) {
        visit[x]=1;
        start[x]=time++;
        for(int i=1; i<=n; i++) {
            if(visit[i]!=1 && side[x][i]) {
                dfs(i);
            }
        }
        end[x]=time++;
    }   
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            n=sc.nextInt();
            side=new boolean[n+1][n+1];
            start = new int[n+1];
            end = new int[n+1];
            visit=new int[n+1];
            for(int i=0; i<n; i++) {
                int u=sc.nextInt();
                int k=sc.nextInt();
                for(int j=0; j<k; j++) {
                    int v=sc.nextInt();
                    side[u][v]=true;
                }
            }
            for(int i=1; i<=n; i++) {
                if(visit[i]==0) {
                    dfs(i);
                }
            }
            for(int i=1; i<=n; i++) {
                System.out.println(i+" "+start[i]+" "+end[i]);
            }

        }
    }
}
