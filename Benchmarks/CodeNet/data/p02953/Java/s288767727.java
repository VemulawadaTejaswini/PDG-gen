import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        int[] list = new int[n];
        int previous = 0;
        boolean decreased = false;
        boolean isFalse = false;
        for (int i = 0; i < n; i++) {
          int value = sc.nextInt();
          // 前の値よりも現在の値が同じか大きいとき
          if (value >= previous) {
            previous = value;
          }
          // 前の値よりも現在の値が小さいとき
          else {
            // 差
            int gap = previous - value;
            // 差が1のとき
            if (gap == 1) {
              // すでに１回引いた
              if (decreased) {
                // 無理
                isFalse = true;
                break;
              }
              // まだ引いてない
              else {
                previous = value;
                decreased = true;
              }
            } 
            // 差がそれ以上のとき
            else {
              // 無理
              isFalse = true;
              break;
            }
          } 
        }

        if (isFalse) {
          // 出力
		  System.out.println("No");
        } else {
          System.out.println("Yes");
        }
    
	}
}
