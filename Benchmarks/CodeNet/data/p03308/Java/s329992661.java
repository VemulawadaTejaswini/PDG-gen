import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for(i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		Arrays.sort(a);
		System.out.println(a[a.length-1]-a[0]);
	}
}
