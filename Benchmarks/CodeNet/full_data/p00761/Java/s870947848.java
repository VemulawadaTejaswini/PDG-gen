import java.util.*;


public class Main {
	
	int a0, l;
	
	int[] toIntArray(int n) {
		int[] a = new int[l];
		for (int i = 0; i < l; i++) {
			a[i] = (int)(n % 10);
			n /= 10;
		}
		return a;
	}
	
	int convertMin(int[] a) {
		if (a.length > 1) {
			int n = 0;
			for (int i = 0; i < a.length; i++) {
				n = (n * 10) + a[i];
			}
			return n;
		} else {
			return a[0];
		}
	}
	
	int convertMax(int[] a) {
		if (a.length > 1) {
			int n = 0;
			for (int i = a.length - 1; i >= 0; i--) {
				n = (n * 10) + a[i];
			}
			return n;
		} else {
			return a[0];
		}
	}
	
	void swap(int[] p, int i, int j) {
		int tmp = p[i];
		p[i] = p[j];
		p[j] = tmp;
	}
	
	String solve() {
		List<Integer> dup = new ArrayList<Integer>();
		dup.add(a0);
		
		int[] a = toIntArray(a0);
		Arrays.sort(a);
		while (true) {
			int p = convertMax(a) - convertMin(a);
			for (int i = 0; i < dup.size(); i++) {
				if (dup.get(i) == p) {
					return i + " " + dup.get(i) + " " + (dup.size() - i);
				}
			}
			dup.add(p);
			a = toIntArray(p);
			Arrays.sort(a);
		}
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		String output = "";
		while (sc.hasNext()) {
			a0 = sc.nextInt();
			l = sc.nextInt();
			if (a0 == 0 && l == 0) {
				break;
			} else {
				output += solve() + "\n";
			}
		}
		sc.close();
		System.out.print(output);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}