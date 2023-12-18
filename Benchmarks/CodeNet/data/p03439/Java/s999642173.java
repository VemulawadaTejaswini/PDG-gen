
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	int map[];

	void run() {
		int n = sc.nextInt();
		
		int map[] = new int[n + 1];
		int pos = 0;
		System.out.println(0);
		int q0 = query(0);
		map[n] = q0;
		if (q0 == 0) {
			return;
		}
		rec(0, n);

	}

	int query(int pos) {
		if (map[pos] == 0) {
			System.out.println(pos);
			System.out.flush();
			String s = sc.nextLine();
			switch (s) {
			case "Male":
				map[pos] = 1;
				break;
			case "Female":
				map[pos] = -1;
				break;
			}
		}
		return map[pos];
	}

	void rec(int left, int right) {

		int ll = query(left);
		int rr = query(right);

		int mid = (right + left) / 2;
		int mm = query(mid);
		if(mm == 0){
			return;
		}

		int len1 = mid - left;
		int len2 = right - mid;
		
		boolean leftMustContain = ((len1 % 2) == 0) ^ (ll == mm);
		boolean rightMustContain = ((len2 % 2) == 0) ^ (mm==rr);

		if (leftMustContain && rightMustContain) {
			if (len1 < len2) {
				rec(left, mid);
			} else {
				rec(mid, right);
			}
		} else if (leftMustContain) {
			rec(left, mid);
			return;
		} else if (rightMustContain) {
			rec(mid, right);
			return;
		} else {
			rec(left, mid);
			rec(mid, right);
		}
	}
}
