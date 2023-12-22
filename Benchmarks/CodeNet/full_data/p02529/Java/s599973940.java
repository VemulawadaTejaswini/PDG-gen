import java.util.*;

/* No.10030 */
public class Main {
	static int[] table = new int[20000];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] s = new int[100], t = new int[100];
		int n = sc.nextInt();
		for ( int i = 0; i < n; i++ )
			s[i] = sc.nextInt();
		int m = sc.nextInt();
		for ( int i = 0; i < m; i++ ) {
			table[sc.nextInt()]++;
		}
		int count = 0;
		for ( int i = 0; i < n; i++ )
			count += table[s[i]];
		System.out.println(count);
	}
}