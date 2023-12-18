import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		HashMap<String, Integer> first = new HashMap<String, Integer>();
		HashMap<String, Integer> second = new HashMap<String, Integer>();
		int ans = 0, fmax1 = 1, smax1 = 1, fmax2 = 1, smax2 = 1, f1 = 0, f2 = 0, s1 = 0, s2 = 0;

		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
			if (i % 2 == 0) {
				if (first.get(String.valueOf(v[i])) != null) {
					first.put(String.valueOf(v[i]), first.get(String.valueOf(v[i])) + 1);
					if (first.get(String.valueOf(v[i])) > fmax1) {
						fmax1 = first.get(String.valueOf(v[i]));
						f1 = v[i];
					} else if (first.get(String.valueOf(v[i])) > fmax2 && first.get(String.valueOf(v[i])) < fmax1) {
						fmax2 = first.get(String.valueOf(v[i]));
						f2 = v[i];
					}
				} else {
					first.put(String.valueOf(v[i]), 1);
				}
			} else {
				if (second.get(String.valueOf(v[i])) != null) {
					second.put(String.valueOf(v[i]), second.get(String.valueOf(v[i])) + 1);
					if (second.get(String.valueOf(v[i])) > smax1) {
						smax1 = second.get(String.valueOf(v[i]));
						s1 = v[i];
					} else if (second.get(String.valueOf(v[i])) > smax2 && second.get(String.valueOf(v[i])) < smax1) {
						smax2 = second.get(String.valueOf(v[i]));
						s2 = v[i];
					}
				} else {
					second.put(String.valueOf(v[i]), 1);
				}
			}
		}

		if (f1 != s1) {
			
			if (first.size() > 1) {
				if (n % 2 == 0) {
					ans = (n / 2) - fmax1;
				} else {
					ans = (n / 2) - fmax1 + 1;
				}
			}

			if (second.size() > 1) {
				ans += (n / 2) - smax1;
			}
			
		} else {
			if (fmax1 + smax2 > fmax2 + smax1) {
				if (first.size() > 1) {
					if (n % 2 == 0) {
						ans = (n / 2) - fmax1;
					} else {
						ans = (n / 2) - fmax1 + 1;
					}
				}

				if (second.size() > 1) {
					ans += (n / 2) - smax2;
				}
			} else {
				if (first.size() > 1) {
					if (n % 2 == 0) {
						ans = (n / 2) - fmax2;
					} else {
						ans = (n / 2) - fmax2 + 1;
					}
				}

				if (second.size() > 1) {
					ans += (n / 2) - smax1;
				}				
			}
		}
		if (ans == 0 && v[0] == v[1]) {
			ans = n / 2;
		}

		System.out.println(ans);

		sc.close();
	}

}
