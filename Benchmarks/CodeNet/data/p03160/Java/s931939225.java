import java.util.Scanner;

public class Main {
	int N;
	int[] h;
	public static void main(String[] args) {
        (new Main()).run();
    }
    
    void run(){
        input();
        int[] dp = new int[N+1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = Math.abs(h[1] - h[2]);
        
        for(int i=3; i<=N; i++){
            dp[i] = Math.min(dp[i-1]+Math.abs(h[i]-h[i-1]), dp[i-2]+Math.abs(h[i]-h[i-2]));
        }
        System.out.println(dp[N]);
    }
	void input(){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        h = new int[N+1];
        for(int i=1; i<=N; i++){
            h[i] = sc.nextInt();
        }
	}
}