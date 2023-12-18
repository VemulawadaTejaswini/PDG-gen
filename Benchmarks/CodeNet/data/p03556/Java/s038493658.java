import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        int ans = 1;
        while(true) {
          int value = ans * ans;
          if (value > n) {
            ans--;
            break;
          }
          ans++;
        }
    
		// 出力
		System.out.println(ans * ans);
	}
}