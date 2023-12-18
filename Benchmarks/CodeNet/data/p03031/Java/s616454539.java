import java.util.*;

public class Main{

    static int N;
    static int M;
    static int count;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int[] k = new int[M];
        int[][] s = new int[M][N];
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++)
                s[i][j] = -1; 
        }
        int[] p = new int[M];
        for(int i = 0; i < M; i++){
            k[i] = sc.nextInt();
            for(int j = 0; j < k[i]; j++){
                int n = sc.nextInt();
                s[i][n-1] = 0;
            }
        }
        for(int i = 0; i < M; i++)
            p[i] = sc.nextInt();
        sc.close();
        count = 0;
        int pos = 0;
        dfs(pos, s, p);
        System.out.println(count);
    }
    static void dfs(int pos, int[][] s, int[] p){
            switch0(pos, s);
            if(pos < N-1)
                dfs(pos+1, s, p);
            if(pos == N-1){
                for(int i = 0; i < M; i++){
                    for(int j = 0; j < N; j++)
                        System.out.print("s["+i+"]["+j+"]="+s[i][j]+" " );
                    System.out.println();
                }
                if(sumjudge(s,p))
                    count++;
            }
            
            switch1(pos, s);
            if(pos < N-1)
                dfs(pos+1, s, p);
            if(pos == N-1){
                for(int i = 0; i < M; i++){
                    for(int j = 0; j < N; j++)
                        System.out.print("s["+i+"]["+j+"]="+s[i][j]+" " );
                    System.out.println();
                }
                if(sumjudge(s,p))
                    count++;
            }
    }

    static void switch0(int j, int[][] s){
        for(int i = 0; i < M; i++) {
            if(s[i][j] != -1)
                s[i][j] = 0;
        }
        return;
    }
    static void switch1(int j, int[][] s){
        for(int i = 0; i < M; i++) {
            if(s[i][j] != -1)
                s[i][j] = 1;
        }
        return;
    }
    static boolean sumjudge(int[][] s, int[] p){
        for(int i = 0; i < M; i++){
            int sum = 0;
            for(int j = 0; j < N; j++){
                if(s[i][j] == 1){
                    sum += 1;
                }
            }
            if(sum % 2 != p[i])
                return false;
        }
        return true;
    }

}
