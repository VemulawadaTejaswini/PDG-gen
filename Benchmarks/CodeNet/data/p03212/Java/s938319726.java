import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	private void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int cnt = 0;
		if (N < 100) {
			System.out.println(cnt);
			return;
		}

		for (int i = 100; i <= N;) {
			int keta = Integer.toString(i).length();
			int l = (int) Math.pow(10, keta - 1);

			for (int j = 0; j < keta; j++) {
				int c = (i % (l * 10)) / l;
				while (c != 3 && c != 5 && c != 7 && c < 10) {
					i += l;
					c++;
				}
				if(c == 10) {
					break;
				}
				l /= 10;
			}
			if(i%10 ==0) {
				continue;
			}
//			System.out.println(i);
			if (is753Number(i)) {
				cnt++;
			}
			i++;
		}
		System.out.println(cnt);
		sc.close();
	}


	private boolean is753Number(int x) {
		boolean three = false;
		boolean five = false;
		boolean seven = false;
		while (x > 0) {
			int mod = x % 10;
			switch (mod) {
			case 3:
				three = true;
				break;
			case 5:
				five = true;
				break;
			case 7:
				seven = true;
				break;
			default:
				return false;
			}
			x /= 10;
		}
		return three && five && seven;
	}
}
