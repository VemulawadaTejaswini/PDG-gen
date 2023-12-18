
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		Set<Integer> set = new HashSet<>();
		for(int i = 0 ; i < n ; i++) {
			if(set.contains(a[i])) {
				set.remove(a[i]);
			} else {
				set.add(a[i]);
			}
		}
		System.out.println(set.size());
	}
}