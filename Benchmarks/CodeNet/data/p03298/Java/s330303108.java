import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i=0;i<(1<<N);i++) {
			int[] arr = new int[N];
			int tmp = i;
			String red = "";
			String blue = "";
			for (int j=0;j<N;j++) {
				arr[j] = tmp%2;
				tmp /= 2;
				if (arr[j]==1) red += S.charAt(j);
				else blue += S.charAt(j);
			}
			String key = red + " " + blue;
			if (map.containsKey(key)) {
				map.put(key, map.get(key)+1);
			} else {
				map.put(key, 1);
			}
		}

		long ans = 0L;

		for (int i=0;i<(1<<N);i++) {
			int[] arr = new int[N];
			int tmp = i;
			String red = "";
			String blue = "";
			for (int j=N-1;j>=0;j--) {
				arr[j] = tmp%2;
				tmp /= 2;
				if (arr[j]==1) red += S.charAt(N+j);
				else blue += S.charAt(N+j);
			}
			String key = red + " " + blue;
			if (map.containsKey(key)) {
				ans += map.get(key);
			} else {
			}
		}
		System.out.println(ans);
	}
}