import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = Integer.parseInt(sc.next());
	static int[] h = new int[N+2];
	static List<Integer> valleys = new ArrayList<>();
	static List<Integer> mounts = new ArrayList<>();
	public static void main(String[] args) {
		h[0] = 0; h[N+1] = 0;
		for (int i = 1; i <= N; i++) {
			h[i] = Integer.parseInt(sc.next());
		}
		for (int i = 1; i < N+1; i++) {
			if (h[i] > h[i-1] && h[i] > h[i+1]) {
				mounts.add(h[i]);
			}
			if (h[i] < h[i-1] && h[i] < h[i+1]) {
				valleys.add(h[i]);
			}
		}
		if (mounts.size() == 0 || mounts.size() == 0) {
			Arrays.sort(h);
			System.out.println(h[N+1]);
			return;
		}
		int ans = mounts.stream().mapToInt(Integer::intValue).sum()
				- valleys.stream().mapToInt(Integer::intValue).sum();
		System.out.println(ans);
	}
}