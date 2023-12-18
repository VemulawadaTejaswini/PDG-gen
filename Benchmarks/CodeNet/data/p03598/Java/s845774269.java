import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
        int ans = 0;
        for(int i = 0; i < n; i++) {
          int value = sc.nextInt();
          ans += 2 * Math.min(value, Math.abs(k - value));
        }

		// 出力
		System.out.println(ans);
	}
}