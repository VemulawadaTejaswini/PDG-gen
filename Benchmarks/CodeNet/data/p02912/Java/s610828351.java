import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
          prices[i] = Integer.parseInt(sc.next());
        }
        int index = n - 1;
        for (int i = 0; i < m; i++) {
          Arrays.sort(prices); 
          prices[index] = (int)((double)prices[index] / 2);
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
          ans += prices[i];
        }
        
		// 出力
		System.out.println(ans);
	}
}