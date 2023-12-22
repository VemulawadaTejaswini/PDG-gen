import java.util.Scanner;

/** AOJ_No.1192 ICPC_2014_A */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int x = sc.nextInt();/* 変更前消費税率(%) */
			int y = sc.nextInt();/* 変更後消費税率(%) */
			int s = sc.nextInt();/* 消費税変更前、2商品合計価格 */
			if(x == 0) break;
			
			int max = 0;/* 消費税変更後、2商品合計の最大額 */
			for(int i = 1; i < s; i++) {
				for(int j = s - 1; j > 0; j--) {
					/* 各値段で小数点切り下げする事に注意 */
					
					if(i != j) {/* 前提条件での指定 */
						
						/* 消費税変更前、2商品の価格の割り出し */
						int tmp = i * (100 + x) / 100 + j * (100 + x) / 100;
						if(tmp < s){
							/* 合計値が変更前より小さいなら、
							 * 以後i固定、j減少のため今後も条件を満たせない */
							break;
						} else if(tmp == s) {
							/* 税込み合計が同じなので、条件を満たす
							 * 変更後の税込み後を計算 */
							int sum = i * (100 + y) / 100 + j * (100 + y) / 100;
							if(max < sum) max = sum;
						}
					}
				}
			}
			System.out.println(max);
		}
	}
}

