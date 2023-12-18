import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        int ans = 0;
        if (n < 105) {
          ans = 0;
        } else if (n < 165) {
          ans = 1;
        } else if (n < 195) {
          ans = 2;
        } else {
          ans = 3;
        }

		// 出力
		System.out.println(ans);
	}
}