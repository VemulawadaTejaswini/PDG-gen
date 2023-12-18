import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		List<List<Integer>> obs = new ArrayList<List<Integer>>();
		for (int i = 0; i < n; i++) {
			obs.add(new ArrayList<>());
		}
		
		int[] h = new int[n];
		Arrays.setAll(h, i -> sc.nextInt());
		
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			a--;
			b--;
			
			obs.get(a).add(b);
			obs.get(b).add(a);
		}
		
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			List<Integer> list = obs.get(i);
			
			Collections.sort(list);
			
			int size = list.size();
			if (size == 0) {
				cnt++;
				continue;
			}
			
			int maxHight = h[list.get(size - 1)];
			if (h[i] > maxHight) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
}
