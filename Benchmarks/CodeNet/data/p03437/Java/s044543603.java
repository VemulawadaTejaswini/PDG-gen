import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int x = sc.nextInt();
		int y = sc.nextInt();
        int ans = 0;
        if (x % y == 0) {
          ans = -1;
        } else {
          int i = 2;
          while(true) {
            if (i * x % y != 0) {
              ans = i * x;
              break;
            } else {
              i++;
            }
          }
        }

		// 出力
		System.out.println(ans);
	}
}