import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	private static int[] maxindex(int tyouhuku[], int n) {
		int[] max_index = new int[2]; // 0番目はmax, 1番目はindex
		for(int i = 1; i <= n; i++) {
			if(max_index[0] < tyouhuku[i]) {
				max_index[0] = tyouhuku[i];
				max_index[1] = i;
			}
		}
		return max_index;
	}

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	// 入力
	int n = sca.nextInt();
	long[] x = new long[n+1];
	long[] l = new long[n+1];
	HashMap<Long, Long> hashmap_xi = new HashMap<Long, Long>();
	for(int i = 1; i <= n; i++) {
		x[i] = sca.nextLong();
		l[i] = sca.nextLong();
		hashmap_xi.put(x[i], l[i]);
	}

	Arrays.sort(x);
	for(int i = 1; i <= n; i++) {
		l[i] = hashmap_xi.get(x[i]);
	}


	// 重複数と重複するものをもとめる。
	int[] tyou = new int[n+1];  // 重複数を格納。あとでソートする。

	//HashMap<Integer, Integer> hashmap_tyou = new HashMap<Integer, Integer>();  // 重複,i番目
	HashMap<Integer, Integer> hashmap_start = new HashMap<Integer, Integer>();  // i番目, st
	HashMap<Integer, Integer> hashmap_end = new HashMap<Integer, Integer>();  // i番目, end

	int st[] = new int[n+1];
	int end[] = new int[n+1];
	for(int i = 1; i <= n-1; i++) {
		boolean flag = false;
		for(int j = i+1; j <= n; j++) {
			if(x[i] + l[i] > x[j] - l[j] && st[i] == 0) {
				st[i] = j;
			}
			else if(x[i] + l[i] <= x[j] - l[j] && st[i] == 0) {
				// i番目のロボットは重複がないので何もしない。
				flag = true;
				break;
			}
			else if(x[i] + l[i] <= x[j] - l[j] && st[i] != 0 && end[i] == 0) {
				end[i] = j-1;
			}
			if(x[i] + l[i] > x[j] - l[j] && st[j] == 0) {
				st[j] = i;
			}
			if(j == n) {
				if(st[i] != 0 && end[i] == 0) {
					end[i] = n;
				}
			}
		}
		if(flag == true) {
			continue;
		}
		if(i == n-1) {
			if(st[n] != 0 && end[n] == 0) {
				end[n] = i;
			}
		}
	}

	for(int i = 1; i <= n; i++) {
		if(st[i] <= i && i <= end[i]) {
			tyou[i] = end[i] - st[i];
		}
		else if(st[i] != 0 && end[i] != 0){
			tyou[i] = end[i] - st[i] + 1;
		}
		//hashmap_tyou.put(tyou[i], i);
		hashmap_start.put(i, st[i]);
		hashmap_end.put(i, end[i]);
	}
	// Arrays.sort(tyou);

	// メイン処理

	int ans = n;
	int[] max_index = new int[2];
	max_index = maxindex(tyou, n);
	while(max_index[0] != 0) {
		for(int i = hashmap_start.get(max_index[1]); i <= hashmap_end.get(max_index[1]); i++) {
			if(i == max_index[1] || tyou[i] == 0) {
				// 自分自身なので何もしない
			}
			else {
				tyou[i] = tyou[i] - 1;
			}
		}
		tyou[max_index[1]] = 0;
		ans--;
		max_index = maxindex(tyou, n);
	}
	System.out.println(ans);

	// 後始末
	sca.close();
	}
}