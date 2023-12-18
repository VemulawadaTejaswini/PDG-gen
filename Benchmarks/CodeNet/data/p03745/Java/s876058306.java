import java.util.*;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		if (n<=2) {
			System.out.println(1);
			return;
		}
		int[] a = new int[100010];
		int c = 0;
		for (int i = 0;i < n;i++) {
			int tmp = sc.nextInt();
			if (c!=0) {
				if (a[c-1]==tmp) continue;
				a[c] = tmp;
				c++;
			} else {
				a[c] = tmp;
				c++;
			}
		}
		int ret = 0;
		c = 0;
		while (a[c]!=0) {
			int n1 = a[c++];
			int n2 = a[c++];
			int tmp;
			if (n1==0||n2==0) {
				ret++;
				break;
			}
			if (n1<n2) {
				while (true) {
					tmp = a[c++];
					if (tmp==0||n2>tmp) {
						ret++;
						c--;
						break;
					}
					n2 = tmp;
				}
			} else {
				while (true) {
					tmp = a[c++];
					if (tmp==0||n2<tmp) {
						ret++;
						c--;
						break;
					}
					n2 = tmp;
				}
			}
			System.out.println(c);
		}
		System.out.println(ret);
	}
}
