import java.util.*;

class Main{
    static int count = 0;
    static int n;
    static int m;
    static boolean[][] a;
    static boolean[] visit;
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new boolean[n+1][n+1];
        visit = new boolean[n+1];
        visit[1] = true;
        for(int i = 0; i < m; i++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            a[p][q] = a[q][p] = true;
        }
        dfs(1);
        System.out.println(count);
    }

    static void dfs(int v){
        boolean all_visit = true;
        for(int i = 1; i < n+1; i++){
            if(visit[i] == false){
                all_visit = false;
                break;
            }
        }

        if(all_visit){
            count++;
        }

        for(int i = 1; i < n+1; i++){
//            System.out.println(i + " : " + visit[i]);
            if(a[v][i] && visit[i] == false){
                visit[i] = true;
//                System.out.println(v + " : " + i);
                dfs(i);
                visit[i] = false;
            }
        }
    }
}