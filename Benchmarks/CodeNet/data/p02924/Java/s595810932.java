import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        long ans = 0;
        for(int i = 1; i <= n; i++) {
          if (i == 1) {
            continue;
          } else if (i == 2) {
            ans += 1;
            continue;
          }
          if (i != n - 1) {
            ans += i;
          } else {
            ans += n % 3;
          }
        }
    
		// 出力
		System.out.println(ans);
	}
}