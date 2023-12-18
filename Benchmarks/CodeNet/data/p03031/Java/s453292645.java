import java.util.*;
class Main {
    static long cnt;
    static int N,M;
    static int[] k,p;
    static int[][] s;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        k = new int[M];
        s = new int[M][N];
        p = new int[M];
        sc.nextLine();
        for(int i = 0; i<M; i++) {
            String[] str = sc.nextLine().split(" ",0);
            //System.out.println(str[0]);
            k[i] = Integer.parseInt(str[0]);
            for(int j = 1; j<str.length; j++) {
                s[i][j-1] = Integer.parseInt(str[j]);
            }
        }
        for(int i = 0; i<M; i++) {
            p[i] = sc.nextInt();
        }
        cnt = 0;
        dfs(0, new boolean[N]);
        System.out.println(cnt);
    }
    public static void dfs(int depth, boolean[] env) {

        if(depth == N) {
            if(isAllOn(env)) cnt++;
            return;
        }
        //System.out.println(N+" "+depth +" "+env[Math.max(0,depth-1)]);
        boolean[] cenv = new boolean[N];
        for(int i = 0; i<cenv.length; i++) cenv[i] = env[i];
        cenv[depth] = true;
        dfs(depth+1, cenv);
        cenv[depth] = false;
        dfs(depth+1, cenv);
    }
    public static boolean isAllOn(boolean[] env) {
        //System.out.println("in");
        int[] a = new int[M];
        for(int i = 0; i<M; i++) {
            for(int j = 0; j<N; j++) {
                if(s[i][j]==0) continue;
                //System.out.println(s[i][j]);
                int index = s[i][j]-1;
                if(env[index]) a[i]++;
            }
//            for(int ai: a)System.out.print(ai+" ");
//            System.out.println();
        }

        for(int i = 0; i<M; i++) {
            if(a[i]%2 != p[i]) return false;
        }
        return true;
    }
}