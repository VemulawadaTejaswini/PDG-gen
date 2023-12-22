import java.util.*;

public class Main {
	public static void main( String args[] ) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] n_num = new int[n];
		for(int i=0; i<n; i++) {
			n_num[i] = in.nextInt();
		}
		
		Arrays.sort(n_num);
		
		//重複を削除
		for(int i=0; i<n-1; i++) {
			int count = 0;
			if(n_num[i] == n_num[i+1]) { //重複を見つけたら
				for(int j=i+1; j<n; j++) { //それ以降で
					if(n_num[i] < n_num[j]) break; //これ以上は重複ないから抜け出す
					if (n_num[i] == n_num[j]) count++; //重複数を数える
				}
				for(int j=i; j<n-count; j++) { //重複の分配列を詰める
					n_num[j] = n_num[j+count];
				}
				n = n - count; //詰めた分を記録
			}
		}
		int count = 0;
		int q = in.nextInt();
		for(int i=0; i<q; i++) {
			int q_num = in.nextInt();
			for(int j=0; j<q; j++) {
				if(n_num[i] == q_num) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}