import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
      
        int ans = 0;
        for(int i = 1; i <= n; i++) {
          ans += i;
        }
    
		// 出力
		System.out.println(ans);
	}
}