public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int count = 0;
			for (int i = n + 1; i <= 2 * n; i++) {
				int num = (int) Math.sqrt(i) + 1;
				if (i == 2)
					num = 2;
				int yaku_count = 0;
				for (int j = 1; j < num; j++) {
					// System.out.println(num);
					if (i % j == 0)
						yaku_count += 2;
				}
				if (yaku_count % num == 0) {
					yaku_count += 1;
				}
				if (i == 2)
					yaku_count -= 1;
				if (yaku_count == 2) {
					count += 1;
					// System.out.println("i =" + i);
				}
			}
			System.out.println(count);
		}
	}
}