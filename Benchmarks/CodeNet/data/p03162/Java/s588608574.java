import java.util.Scanner;

public class Main {
	int N;
    int[] a;
    int[] b;
    int[] c;
	public static void main(String[] args) {
        (new Main()).run();
    }
    
    void run(){
        input();
        int[][] dp = new int[N+1][3];
        
        for(int i=1; i<=N; i++){
            dp[i][0] = Math.max(dp[i-1][1],dp[i-1][2]) + a[i];
            dp[i][1] = Math.max(dp[i-1][0],dp[i-1][2]) + b[i];
            dp[i][2] = Math.max(dp[i-1][0],dp[i-1][1]) + c[i];
        }
        System.out.println(Math.max(dp[N][0],Math.max(dp[N][1],dp[N][2])));
    }
	void input(){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        a = new int[N+1];
        b = new int[N+1];
        c = new int[N+1];
        for(int i=1; i<=N; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
	}
}