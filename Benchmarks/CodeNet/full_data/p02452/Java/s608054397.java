import java.util.*;

public class Main {
    static TreeSet<Integer> all = new TreeSet<>();
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<Integer> set = new HashSet<>();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    set.add(sc.nextInt());
		}
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
		    if (!set.contains(sc.nextInt())) {
		        System.out.println(0);
		        return;
		    }
		}
		System.out.println(1);
	}
}

