import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n = 0;
	static int[] a = null;
	static boolean hasNot0 = false;
	
	public static void main(String[] args) {
		n = sc.nextInt();
		a = new int[n];
		for(int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			if(a[i] != 0) hasNot0 = true;
		}
		
		if(n % 3 == 0) System.out.println(canArrange() ? "Yes" : "No");
		else if(hasNot0) System.out.println("No");
		else System.out.println("Yes");
	}
	
	static boolean canArrange() {
		Arrays.sort(a);
		int c = getSetSize(a);
		if(c > 3) return false;
		else if(c == 3) {
			int[] b = new int[n];
			for(int i = 0; i < n; ++i) {
				b[i] = (i < n / 3) ? a[0] : (i < n / 3 * 2) ? a[n / 3] : a[n / 3 * 2];
			}
			return Arrays.equals(a, b) && (b[0] ^ b[n / 3] ^ b[n / 3 * 2]) == 0;
		} else if(c == 2) {
			if(a[0] > 0) return false;
			int[] b = new int[n];
			for(int i = 0; i < n; ++i) {
				b[i] = (i < n / 3) ? a[0] : a[n / 3];
			}
			return Arrays.equals(a, b);
		} else return a[0] == 0;
	}
	
	static int getSetSize(int[] x) {
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < n; ++i) set.add(x[i]);
		return set.size();
	}
}