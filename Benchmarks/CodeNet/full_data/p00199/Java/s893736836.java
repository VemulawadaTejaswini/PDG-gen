
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int m;
	int n;
	char chair[];

	public static void main(String[] args) {
		(new Main()).start();
	}

	private void start() {
		n = sc.nextInt();
		m = sc.nextInt();
		while (n != 0) {
			chair = new char[n];
			Arrays.fill(chair, '#');
			for (int i = 0; i < m; i++) {
				sit(sc.next().charAt(0));
			}
			for (int i = 0; i < n; i++) {
				System.out.print(chair[i]);
			}
			System.out.println();
			n = sc.nextInt();
			m = sc.nextInt();
		}
	}

	private void sit(char c) {
		switch (c) {
		case 'A':
			for (int i = 0; i < n; i++) {
				if (chair[i] == '#') {
					chair[i] = 'A';
					return;
				}
			}
			break;
		case 'B':
			for (int i = n - 1; i >= 0; i--) {
				if (chair[i] == '#') {
					if ((i > 0 && chair[i - 1] == 'A')
							|| (i < n - 1 && chair[i + 1] == 'A'))
						continue;
					chair[i] = 'B';
					return;
				}
			}
			for (int i = 0; i < n; i++) {
				if (chair[i] == '#') {
					chair[i] = 'B';
					return;
				}
			}
			break;
		case 'C':
			for (int i = 0; i < n; i++) {
				if (chair[i] != '#') {
					if (i < n - 1 && chair[i + 1] == '#') {
						chair[i + 1] = 'C';
						return;
					}
					if (i > 0 && chair[i - 1] == '#') {
						chair[i - 1] = 'C';
						return;
					}
				}
			}
			if (n % 2 == 0) {
				chair[(n + 1) / 2] = 'C';
			} else {
				chair[n / 2 + 1] = 'C';
			}
			break;
		case 'D':
			int max = 0;
			int maxindex = 0;
			int count = 1000;
			int distance[] = new int[n];
			for (int i = 0; i < n; i++) {
				if (chair[i] == '#') {
					count++;
				} else {
					count = 0;
				}
				distance[i] = count;
			}
			count = 1000;
			for (int i = n - 1; i >= 0; i--) {
				if (chair[i] == '#') {
					count++;
				} else {
					count = 0;
				}
				distance[i] = distance[i] < count ? distance[i] : count;
				if (max <= distance[i]) {
					max = distance[i];
					maxindex = i;
				}
			}
			if (max >= 1000)
				chair[0] = 'D';
			else
				chair[maxindex] = 'D';
			break;
		}
	}
}