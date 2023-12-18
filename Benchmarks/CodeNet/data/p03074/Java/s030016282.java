
import java.util.ArrayList;
import java.util.Scanner;

public class ruiseki {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());//int型
		int k = Integer.parseInt(sc.next());
		String sline = sc.next();
		int[] s = new int[n];
		for (int i=0; i<n; i++){
			s[i] = Integer.parseInt(String.valueOf(sline.charAt(i)));
		}
		sc.close();
		// 1-0-1-...でいくつセットで並んでいるか.00011100101=0332101(最初1は0個並んでいる.
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		int now = 1;// 今見ている数
		int cnt = 0;// nowがいくつ並んでいるか
		for (int i=0; i<n; i++){
			if (s[i] == now) {
				cnt++;
			} else {
				nums.add(cnt);
				now = 1 - now;// これで0,1の入れ替えができる.
				cnt = 1;
			}
		}
		if(cnt != 0){
			nums.add(cnt);
		}
		// 1-0-1-...-0-1という形でほしい
		// 0で終わっている時は一つ足す
		if (nums.size() % 2 == 0) {
			nums.add(0);
		}

		int Add = 2*k + 1;
		/*
		 * 累積和を作る
		 * 0 1 2 3 4 5 6 累積和のインデックス
		 *  0 1 2 3 4 5  もとのインデックス
		 * s[i+1]=(i番目までの累積した和)
		 */
		
		int[] sum = new int[n+1];
		sum[0] = 0;
		for (int i = 0; i< nums.size(); i++) {
			sum[i+1] = sum[i] + nums.get(i);
		}
		
		int ans = 0;
		
		// 1-0-1-0-1と続くので偶数番目だけ見る
		for (int i = 0; i < nums.size(); i += 2) {
			/*
			 * 次のleft, rightを計算 [left, right)
			 */
			int left = i;
			int right = Math.min(i+Add, nums.size());
			int tmp = sum[right] - sum[left];
			
			ans = Math.max(tmp, ans);
		}
		System.out.println(ans);
	}
}
