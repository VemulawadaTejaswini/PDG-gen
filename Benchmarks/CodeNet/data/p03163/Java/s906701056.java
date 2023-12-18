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
        long[] dp = new long[w + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for(int i = 0; i < n; i++) {
            for(int k = w; k >= 0; k--) {
                if(dp[k] != -1) {
                    try{
                        dp[k + items[i].weight] = Math.max(dp[k + items[i].weight], dp[k] + items[i].value);
                    } catch(Exception e) {

                    }
                }
            }
        }
        long max = 0;
        for(int i = 0; i <= w; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}
