import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[] cnt = new long[5]; // 'M','A','R','C','H'

		for (int i = 0; i < n; i++) {
			String name = sc.next();
			switch (name.charAt(0)) {
			case 'M':
				cnt[0]++;
				break;
			case 'A':
				cnt[1]++;
				break;
			case 'R':
				cnt[2]++;
				break;
			case 'C':
				cnt[3]++;
				break;
			case 'H':
				cnt[4]++;
				break;
			default:
				break;
			}
		}

		long ans = 0;
		for (int i = 0; i < cnt.length - 2; i++) {
			for (int j = i + 1; j < cnt.length - 1; j++) {
				for (int k = j + 1; k < cnt.length; k++) {
					ans += cnt[i] * cnt[j] * cnt[k];
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
