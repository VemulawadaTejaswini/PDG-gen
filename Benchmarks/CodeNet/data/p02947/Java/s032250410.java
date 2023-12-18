import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s[] = new String[n];
		String s1[] = new String[n];
		char chars[] = new char[10];
		int tempn[] = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
			chars = s[i].toCharArray();
			Arrays.sort(chars);
			s1[i] = Arrays.toString(chars);
			tempn[i] = i;
		}
		Long count = 0L;
		Long tempcount = 0L;
		for (int i = 0; i < n; i++) {
			if (tempn[i] == -1) {
				continue;
			}
			for (int j = i; j < n; j++) {
				if (j == i) {
					j++;
				}
				if (j == n) {
					continue;
				}
				if (tempn[j] == -1) {
					continue;
				}
				if (s1[i].equals(s1[j])) {
					tempn[j] = -1;
					tempcount++;
				}
			}
			while (tempcount > 0) {
				count += tempcount;
				tempcount--;				
			}
		}
		System.out.println(count);
	}
}