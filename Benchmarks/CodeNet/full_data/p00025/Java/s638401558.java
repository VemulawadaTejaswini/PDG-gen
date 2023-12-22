import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Program{
	static int N, D, money;
	static int[] prices;
	private static int solve(){
        int answer = 0;
        if (prices[0] * 2 > money) return 0;
        if (prices[prices.Length - 1] + prices[prices.Length - 2] <= money) return prices[prices.Length - 1] + prices[prices.Length - 2];
        for (int i = 0; i < N - 1; i++)
        {
            int index = Arrays.binarySearch(prices, i + 1, prices.Length - i - 1, money - prices[i]);
            if (index > i) return prices[i] + prices[index];
            index = ~index - 1;
            if (index == i) continue;
            answer = Math.max(prices[i] + prices[index], answer);
        }
        return answer;
	}
	public static void main(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(",");
        N = Integer.parseInt(strs[0]); D = Integer.parseInt(strs[1]);
        prices = new int[N];
        for (int i = 0; i < N; i++)
            prices[i] = Integer.parseInt(be.readLine());
        Arrays.Sort(prices);
        for (int i = 0; i < D; i++)
        {
            money = Integer.parseInt(be.readLine());
            System.out.println(solve());
        }
	}
}