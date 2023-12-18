import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		int i = 0;
		for(i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int button = 0;
		Set<Integer> set = new HashSet<Integer>();
		int count = 0;
		a:for(i = 0; button != 1; i = button) {
			button = a[i] - 1;
			int before = set.size();
			set.add(button);
			int after = set.size();
			if(before == after) {
				count = -1;
				break a;
			}
			count++;
		}
		System.out.println(count);
	}
}