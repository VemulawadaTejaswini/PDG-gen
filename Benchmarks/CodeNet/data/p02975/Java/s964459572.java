import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] a = new int[N];
		for (int i=0;i<N;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(a);
		int tmp = 0;
		int flag = 0;
		if (N%3 != 0) {
			flag=1;
		} else {
			for (int i=0;i<N;i++) {
				if (i==0) {
					tmp = a[0];
				} else if (0<i && i<N/3) {
					if (tmp != a[i]) {
						flag=1;
						break;
					}
				} else if (i==N/3) {
					tmp = a[N/3];
				} else if (N/3<i && i<N/3*2) {
					if (tmp != a[i]) {
						flag=1;
						break;
					}
				} else if (i==N/3*2) {
					if (a[N/3*2]!=(a[0]^a[N/3])) {
						flag=1;
						break;
					}
					tmp = a[N/3*2];
				} else if (N/3*2<i && i<N) {
					if (tmp != a[i]) {
						flag=1;
						break;
					}
				}
			}
		}
		if (flag==0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}