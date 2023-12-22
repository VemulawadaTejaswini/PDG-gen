import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int w, q;
		int a[];
		int sleepAt;

		w = sc.nextInt();
		q = sc.nextInt();
		while (w + q != 0) {
			a = new int[w];
			for (int i = 0; i < w; i++) {
				a[i] = -1;
			}
			for (int i = 0; i < q; i++) {
				int name, size;
				char c = sc.next().charAt(0);
				if (c == 's') {
					name = sc.nextInt();
					size = sc.nextInt();
					sleepAt = sleep(a, w, name, size);
					if (sleepAt != -1) {
						System.out.println(sleepAt);
					} else {
						System.out.println("impossible");
					}
				} else if (c == 'w') {
					name = sc.nextInt();
					wakeup(a, w, name);
				}
			}
			System.out.println("END");
			w = sc.nextInt();
			q = sc.nextInt();
		}
	}

	public static int sleep(int a[], int w, int name, int size) {
		boolean flag = true;;
		for (int i = 0; i < w - size + 1; i++) {
			flag = true;
			for (int j = i; j < i + size; j++) {
				if (a[j] != -1) {
					flag = false;
					break;
				}
			}
			if (flag) {
				for (int j = i; j < i + size; j++) {
					a[j] = name;
				}
				return i;
			}
		}
		return -1;
	}
	
	public static void wakeup(int a[], int w, int name) {
		for (int i = 0; i < w; i++) {
			if (a[i] == name) {
				a[i] = -1;
			}
		}
	}
}