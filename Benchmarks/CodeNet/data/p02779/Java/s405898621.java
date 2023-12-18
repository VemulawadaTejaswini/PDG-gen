import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		Set<Integer> set = new HashSet<>();
		boolean f  = true;
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			if(set.contains(a[i])) {
				f = false;
				break;
			}
			set.add(a[i]);
		}
		if(f) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		

	}

}