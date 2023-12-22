public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner sc = new java.util.Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		while (true) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			if (h==0 && w==0) break;

			for (int i = 1; i <= h; i++) {
				for (int j = 1; j <= w; j++) {

					if (i%2 == 1 && j%2 == 1) {
						sb.append("#");
					} else if (i%2 == 0 && j%2 == 0) {
						sb.append("#");
					} else {
						sb.append(".");
					}

				}
				sb.append("\n");
			}
			sb.append("\n");
		}

		System.out.print(sb);
	}

}