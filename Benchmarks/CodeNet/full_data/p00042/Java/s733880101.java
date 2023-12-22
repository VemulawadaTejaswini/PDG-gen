import java.util.*;

public class AOJ_0042{

    void run(){
        Scanner sc = new Scanner(System.in);
        int case_cnt = 1;
        while(true){
            int W = sc.nextInt();
            if(W == 0){
                break;
            }
            int N = sc.nextInt();
            int[] value = new int[N];
            int[] weight = new int[N];
            for(int i = 0; i < N; i++){
                String[] s = sc.next().split(",");
                value[i] = Integer.parseInt(s[0]);
                weight[i] = Integer.parseInt(s[1]);
            }
            int[] dp = new int[W+1];
            for(int i = 0; i < N; i++){
                for(int w = W; w >= 0 ; w--){
                    if( w + weight[i] <= W){
                        dp[w + weight[i]] = Math.max(dp[w + weight[i]], dp[w] + value[i]);
                    }
                }
            }
            int max = 0;
            for(int w: dp){
                max = Math.max(max,w);
            }
            int index = 0;
            for(int i = 0; i <= W; i++){
                if(dp[i] == max){
                    index = i;
                    break;
                }
            }
            System.out.println("Case " + case_cnt + ":");
            System.out.println(max);
            System.out.println(index);
            case_cnt++;
        }
        
    }

    public static void main(String[] args){
        new AOJ_0042().run();
    }
}