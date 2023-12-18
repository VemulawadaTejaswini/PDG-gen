import java.util.*;

@SuppressWarnings("unchecked")
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int l = in.nextInt();
		String[] a = new String[n];
		for (int i = 0; i < n; ++i) {
			a[i] = in.next();
		}
		Arrays.sort(a);
		for (int i = 0; i < n; ++i) {
			System.out.print(a[i]);
		}
	}
}