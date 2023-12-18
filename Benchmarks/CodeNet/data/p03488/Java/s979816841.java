import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] sa = br.readLine().split(" ");
		int x = Integer.parseInt(sa[0]);
		int y = Integer.parseInt(sa[1]);
		br.close();

		String[] f = s.split("T", -1);
		int[] cnt = new int[f.length];
		for (int i = 0; i < cnt.length; i++) {
			cnt[i] = f[i].length();
		}

		Set<Integer> set = new HashSet<>();
		set.add(cnt[0]);
		for (int i = 2; i < cnt.length; i+=2) {
			Integer[] arr = set.toArray(new Integer[0]);
			set = new HashSet<>();
			for (int j = 0; j < arr.length; j++) {
				set.add(arr[j] + cnt[i]);
				set.add(arr[j] - cnt[i]);
			}
		}
		if (!set.contains(x)) {
			System.out.println("No");
			return;
		}

		set = new HashSet<>();
		set.add(cnt[1]);
		set.add(-cnt[1]);
		for (int i = 3; i < cnt.length; i+=2) {
			Integer[] arr = set.toArray(new Integer[0]);
			set = new HashSet<>();
			for (int j = 0; j < arr.length; j++) {
				set.add(arr[j] + cnt[i]);
				set.add(arr[j] - cnt[i]);
			}
		}
		if (!set.contains(y)) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
	}
}
