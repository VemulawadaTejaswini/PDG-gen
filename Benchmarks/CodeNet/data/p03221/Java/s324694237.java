import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<List<Integer>> prefecture = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			prefecture.add(new ArrayList<>());
		}
		
		int[] p = new int[m];
		int[] y = new int[m];
		for (int i = 0; i < m; i++) {
			p[i] = sc.nextInt();
			p[i]--;
			y[i] = sc.nextInt();
			prefecture.get(p[i]).add(y[i]);
		}
		
		for (int i = 0; i < n; i++) {
			Collections.sort(prefecture.get(i));
		}
		
		for (int i = 0; i < m; i++) {
			int idx = Collections.binarySearch(prefecture.get(p[i]), y[i]);
			idx++;
			System.out.printf("%06d%06d\n", p[i] + 1, idx);
		}
		
	}
	
}
