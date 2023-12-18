import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] m = new int[n];
		for (int i = 0; i < n; ++i) {
			m[i] = sc.nextInt();
		}

		Arrays.sort(m);
		boolean f = false;
		while (true) {
			for (int i = 0; i < n; ++i) {
				if (m[i] != 0) {
					if (i + 1 == n) {
						f = true;
						System.out.println(m[i]);
						break;
					} else {
						m[i + 1] = m[i + 1] % m[i];
						if (m[i+1] < m[i]) {
							int t = m[i+1];
							m[i+1] = m[i];
							m[i] = t;
						}
						break;
					}
				}
			}
			if (f) {
				break;
			}
		}
	}
}