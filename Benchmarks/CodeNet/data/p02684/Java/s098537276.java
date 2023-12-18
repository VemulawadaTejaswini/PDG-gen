import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

// https://atcoder.jp/contests/abc167/tasks/abc167_d
public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		sc.close();

		int end = 0;

		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		int tmp = 1;
		map.put(0,1);
		for (int i = 1; i <= n+1; i++) {
			tmp = array[tmp-1];
			if (map.containsKey(tmp)) {
				end = i;
				break;
			} else {
					map.put(tmp,i);
			}
		}

		int start=-2;
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue()==tmp) {
				start = entry.getKey();
				break;
				}
			}
		long count = end - start;
		long aa = k - start + 1;
		aa = aa%count;

		int ans = 1;
		for(int i=1;i<start+aa;i++) {
			tmp = array[ans-1];
		}
		System.out.println(ans);
	}
}
