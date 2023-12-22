import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int map[] = new int[(n - 1) / 2];
			int rem[] = new int[n];
			for (int i = 1; i < n; i++) {
				rem[(i * i) % n] = 1;
			}
			int index = 0;
			for (int i = 0; i < n; i++) {
				if (rem[i] == 1) {
					rem[index++] = i;
				}
			}
			for (int i = 0; i < index; i++) {
				for (int j = 0; j < index ; j++) {
					if (i != j) {
						int res = rem[i] - rem[j];
						res += (res < 0) ? n : 0;
						res = ((n - 1) / 2 < res) ? n - res : res;
						map[res - 1]++;
					}
				}
			}
			for (int i = 0; i < (n - 1) / 2; i++) {
				System.out.println(map[i]);
			}
		}
	}
}