import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      
		// リストを作って格納
		List<Long> list = new ArrayList<Long>();
		while(sc.hasNext()) {
			list.add(sc.nextLong());
		}
 
		// resultは10桁オーバーなのでlong型
		long result = 1;
 
		// resultにlistの数字を全て掛ける
		for(Long i: list) {
			result *= i;
		}
 
		// 10の18乗を超えるなら-1を代入
		long checks = (long) Math.pow(10, 18);
		if(result > checks) {
			result = -1;
		}
 
		// 結果の出力
		System.out.println(result);
 
	}
}