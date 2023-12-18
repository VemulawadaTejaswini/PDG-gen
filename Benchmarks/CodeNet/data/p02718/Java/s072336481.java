import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	// 整数の入力
	int n = sc.nextInt(); // 種類
	int m = sc.nextInt(); // 人気商品数
	Integer[] a = new Integer[n]; // 投票状況
	int border = 0; // 投票数ボーダー
	int total = 0; // 得票数合計
	int flg = 1; // 陳列可否
	
	// 投票状況取得
    for(int i=0; i<n; i++) {
        a[i] = sc.nextInt();
        total += a[i];
    }
    
    border = total / (4 * m);
    Arrays.sort(a, Collections.reverseOrder());
    
    // 人気商品陳列可否チェック
    for(int i=0; i<m; i++) {
        if(a[i] < border) flg = 0;
    }
    
	// 出力
    if(flg == 0) {
        System.out.print("No");
	} else {
        System.out.print("Yes");
	}
}
}
