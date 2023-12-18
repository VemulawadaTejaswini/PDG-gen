import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        long ans = 0;
        int kari = n % (n - n % 2) / 2 + 1;
        int kouho = n % kari - 3;
        for(int i = 1; i <= n; i++) {
          if (i == 1) {
            continue;
          } else if (i == 2) {
            ans += 1;
            continue;
          }
          if (i != n - 1) {
            ans += i;
          } else if (kouho < n % 3) {
            ans += n % 3;
          } else {
            ans += kouho;
          }
        }
    
		// 出力
		System.out.println(ans);
	}
}