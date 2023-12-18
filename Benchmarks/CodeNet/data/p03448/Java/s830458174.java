import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
      X /= 50;
        int count = 0;
      for (int ia = 0; ia <= A; ia++) {
       	for (int ib = 0; ib <= B; ib++) {
          for (int ic = 0; ic <= C; ic++) {
            if (10 * ia + 2 * ib + ic == X) {
              count++;
            }
          }
        }
      }
		// 出力
		System.out.println(count);
	}
}