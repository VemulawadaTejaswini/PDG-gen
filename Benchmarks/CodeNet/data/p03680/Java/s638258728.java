import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static int searchId(int n, int[] a, int id) throws IOException {
		for (int i = 0; i < n; i++) {
			if (a[i] == id)
				return i + 1;
		}
		return -1;
	}

	public static void solve() throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int[] tabu = new int[n];
		for (int i = 0; i < n; i++) {
			tabu[i] = sc.nextInt();
		}

		int cnt = 1;
		int id = searchId(n, a, 2);
		if (id == 1) {
			System.out.println(cnt);
		} else if (id == -1) {
			System.out.println(-1);
		} else {
			for (int i = 0; i < n; i++) {
				cnt++;
				id = searchId(n, a, id);
				if (id == 1) {
					System.out.println(cnt);
					break;
				} else if (id == -1) {
					System.out.println(-1);
					break;
				}
			}
		}
		if (id != 1 && id != -1 && cnt == n + 1)
			System.out.println(-1);

		sc.close();
	}

	public static void main(String[] args) {
		try {
			solve();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
