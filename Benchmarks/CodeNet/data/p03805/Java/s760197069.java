import java.util.*;

public class Main{
    static int N, M;
    static int[][] a; 
    static boolean[] flag;
    static int count = 0;
    static int[][] d;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        M = sc.nextInt();
        a = new int[2][M];
        d = new int[N][N];
        for(int i = 0; i < M; i++){
            a[0][i] = sc.nextInt();
            a[1][i] = sc.nextInt();
            d[a[0][i]-1][a[1][i]-1] = 1;
            d[a[1][i]-1][a[0][i]-1] = 1;
        }
        sc.close();
        flag = new boolean[N];
        flag[0] = true;
        dfs(1);
        System.out.println(count);
    }
    static void dfs(int pos){
        if(check()) {
            count++;
            return;
        }
        else {
            for(int i = 0; i < N; i++){
                if(d[pos-1][i] == 1 && flag[i] == false){
                    flag[i] = true;
                    dfs(i+1);
                    flag[i] = false;
                }
            }
        }
        return;
    }

    static boolean check(){
        for(int i = 0; i < N; i++){
            if(!(flag[i]))
                return false;
        }
        return true;
    }
}