public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int[][][] house = new int[4][3][10];

		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			int v = sc.nextInt();

			house[b-1][f-1][r-1] += v;
		}

		StringBuilder sb = new StringBuilder();

		for (int i=0; i<4; i++) {

			for (int j=0; j<3; j++) {

				for (int k=0; k<10; k++) {
					sb.append(" " + house[i][j][k]);
				}
				sb.append("\n");

			}
			if (i==3) break;
			sb.append("####################\n");

		}

		System.out.print(sb);
	}

}