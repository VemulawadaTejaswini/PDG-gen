import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		char[][] a = new char[h][w];

		for (int i = 0; i < h; i++) {
			String tmpa = "";
			tmpa = sc.next();
			for (int j = 0; j < w; j++) {
				a[i][j] = tmpa.charAt(j);
			}
		}

		final char dot = '.';
		final char sharp = '#';

		int globalMax = 0;
		int localMin = h+w-2;

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {

				if (a[i][j] == dot) {
					localMin = h+w-2;
					for (int k = 0; k < h; k++) {
						for (int l = 0; l < w; l++) {
							if (a[k][l] == sharp) {
								localMin = Math.min(localMin, Math.abs(i - k) + Math.abs(j - l));
							}
						}
					}
				}
				globalMax = Math.max(localMin, globalMax);
			}
		}
		System.out.println(globalMax);


		//		ArrayList<Integer> corx_wh = new ArrayList<>();
		//		ArrayList<Integer> cory_wh = new ArrayList<>();
		//
		//		ArrayList<Integer> corx_bl = new ArrayList<>();
		//		ArrayList<Integer> cory_bl = new ArrayList<>();
		//
		//		//		for (int i = 0; i < h; i++) {
		//		//			for (int j = 0; j < ; k++) {
		//		//			tmpa[] = sc.next();
		//		//			for (int k=0; k<tmpa[k].length();k++) {
		//		//				a[k][k]
		//		//			}
		//		//		}
		//
		//		for (int i = 0; i < h; i++) {
		//			String tmpa = "";
		//			tmpa = sc.next();
		//			for (int j = 0; j < w; j++) {
		//				a[i][j] = tmpa.charAt(j);
		//				if (String.valueOf(a[i][j]).equals(".")) {
		//					corx_wh.add(j);
		//					cory_wh.add(i);
		//				} else {
		//					corx_bl.add(j);
		//					cory_bl.add(i);
		//				}
		//			}
		//		}
		//
		//		//		for (int i = 0; i < h; i++) {
		//		//			String tmpa = "";
		//		//			for (int j = 0; j < w; j++) {
		//		//				tmpa = sc.next();
		//		//				for (int k=0; k<w; k++) {
		//		//					a[i][k] = tmpa.charAt(k);
		//		//				}
		//		//
		//		//				if (String.valueOf(a[i][j]).equals(".")) {
		//		//					corx_wh.add(i);
		//		//					cory_wh.add(j);
		//		//				} else {
		//		//					corx_bl.add(i);
		//		//					cory_bl.add(j);
		//		//				}
		//		//			}
		//		//		}
		//
		//		int globalMax = 0;
		//
		//		for (int i = 0; i < h; i++) {
		//			for (int j = 0; j < w; j++) {
		//
		//				if (String.valueOf(a[i][j]).equals(".")) {
		//					int localMax = 0;
		//
		//					for (int k = 0; k < h; k++) {
		//						for (int l = 0; l < w; l++) {
		//							if (String.valueOf(a[k][l]).equals("#")) {
		//								localMax = Math.max(localMax,
		//										Math.abs(corx_wh.get(i) - corx_bl.get(k) + cory_wh.get(j) - cory_bl.get(l)));
		//							}
		//						}
		//					}
		//
		//					globalMax = Math.max(localMax, globalMax);
		//				}
		//			}
		//		}
	}

}
