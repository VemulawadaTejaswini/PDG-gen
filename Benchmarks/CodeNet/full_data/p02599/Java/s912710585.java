
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int q = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		for(int i = 0; i < q; i++) {
			Set<Integer> set = new HashSet<>();
			int l = scan.nextInt();
			int r = scan.nextInt();
			for(int j = l - 1; j <= r - 1; j++) {
				set.add(a[j]);
			}
			System.out.println(set.size());
			set.clear();
		}
		
	}
}
