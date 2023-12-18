import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Q = Integer.parseInt(scan.nextLine());
		for (int q = 0;q < Q ;q++ ) {
			String[] line = scan.nextLine().split(" ", 0);
			int l = Integer.parseInt(line[0]);
			int r = Integer.parseInt(line[1]);
			System.out.println(search(l,r));
		}
	}

	private static int search(int l,int r) {
		int ans = 0;
		for(int i = l; i <= r; i++) {
			if (i == 1) continue;
			if (i % 2 == 0) continue;
			if ((check(i)) && check((i + 1)/2)) ans++;
		}
		return ans;
	}
	private static boolean check(int i) {
		for (int j = 2;j < i ;j++ ) {
			if (i%j == 0) return false;
		}
		return true;
	}
}
