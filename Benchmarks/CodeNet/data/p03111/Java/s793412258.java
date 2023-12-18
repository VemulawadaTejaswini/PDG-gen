import java.util.Scanner;

public class Main {

    static int N, A, B, C;
    static int[] L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        L = new int[N];
        for (int i = 0; i < N; i++) L[i] = sc.nextInt();

        System.out.println(dfs(0, 0, 0, 0));
        sc.close();
    }

    static public int dfs(int idx, int a, int b, int c){
        int ret;
        if(idx < N){
            int ret0 = dfs(idx+1, a, b, c);
            int ret1 = dfs(idx+1, a+L[idx], b, c)+10;
            int ret2 = dfs(idx+1, a, b+L[idx], c)+10;
            int ret3 = dfs(idx+1, a, b, c+L[idx])+10;
            ret = Math.min(Math.min(ret0, ret1), Math.min(ret2, ret3));
        }else{
            if(a > 0 && b > 0 && c > 0){
                ret = Math.abs(A - a) + Math.abs(B - b) + Math.abs(C - c) -30;
            }else{
                ret = Integer.MAX_VALUE/10;
            }
        }
        return ret;
    }
}
