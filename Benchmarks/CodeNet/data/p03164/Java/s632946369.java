import java.util.*;
public class Main {
    public static class item{
        int weight;
        int value;
        item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int w = input.nextInt();
        item[] items = new item[n];
        for(int i = 0; i < n; i++) {
            items[i] = new item(input.nextInt(), input.nextInt());
        }
        long[] dp = new long[100001];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 0; i < n; i++) {
            for(int k = 100000; k >= 0; k--) {
                if(dp[k] != -1) {
                    try{
                        dp[k + items[i].value] = Math.min(dp[k + items[i].value], dp[k] + items[i].weight);
                    } catch(Exception e) {

                    }
                }
            }
        }
        long max = 0;
        for(int i = 0; i <= 100000; i++) {
            if(dp[i] != Integer.MAX_VALUE && dp[i] <= w) {
                max = Math.max(max, i);
            }
        }
        System.out.println(max);
    }
}
