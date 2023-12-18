import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int x = sc.nextInt();
		int ans = 1;
        int b = 1;
      
        if (x == 1) {
          // 出力
		  System.out.println(ans);
          return;
        }
      
        Parent: while(true) {
          b++;
          if (Math.pow(b, 2) > x) {
            break Parent;
          }
          int p = 2;
          Child: while(true) {
            int value = (int)Math.pow(b, p);
            if (value > x) {
              break Child;
            } else if (value > ans) {
              ans = value;
            }
            p++;
          }
        }
    
		// 出力
		System.out.println(ans);
	}
}