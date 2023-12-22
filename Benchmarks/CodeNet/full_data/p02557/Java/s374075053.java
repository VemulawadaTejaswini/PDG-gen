import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();

		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];

		Map<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
			map.compute(b[i], (k, v) -> {
				return v == null ? 1 : v + 1;
			});
		}
		Integer[] index = map.keySet().toArray( new Integer[0]);

		int p=0;
		for (int i = 0; i < n; i++) {
			for( int j=0 ; j<index.length ; j++) {
				if(a[i] != index[p] && map.get(index[p])>0) {
					map.compute(index[p], (k,v) -> { return v>1 ? v-1 : 0;});
					c[i] = index[p];
					break;
				}
				p++;
				p%=index.length;
			}

		}

		for (int i = 0; i < n; i++) {
			if (a[i] == c[i]) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
		for (int i = 0; i < n; i++) {
			System.out.println(c[i]);
		}

	}
}