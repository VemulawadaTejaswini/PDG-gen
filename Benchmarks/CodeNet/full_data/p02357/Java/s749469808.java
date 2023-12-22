import java.util.Scanner;
import java.util.TreeMap;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int L = scan.nextInt();
		int[]a = new int[N];
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for(int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		for(int i = 0; i < L; i++) {
			map.merge(a[i], 1, (val1, val2) -> val1 + val2);
		}
		int min = map.firstKey();
		StringBuilder sb = new StringBuilder();
		sb.append(min);
		for(int i = L; i < N; i++) {
			if(map.get(a[i - L]) == 1) {
				map.remove(a[i - L]);
			}else {
				map.merge(a[i - L], -1, (val1, val2) -> val1 + val2);
			}
			map.merge(a[i], 1, (val1, val2) -> val1 + val2);
			sb.append(" ").append(map.firstKey());
		}
		System.out.println(sb.toString());
	}
}
