import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		long ans2 = 0;
//		long ans = 0;
//		int ans = 0;

		Scanner sc = new Scanner(System.in);


		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();

//		String string = sc.next();
//		StringBuilder s = new StringBuilder(string);

		boolean f = false;
		boolean f2 = false;
		String s ="";
//
		String[][] a = new String[h][w];
//		int[] b = new int[n];
		int[][] aa = new int[h][w];
//		int[] bb = new int[n];
		for (int i = 0; i < h; i++) {
			s = sc.next();
			for(int j = 0; j < w; j++) {
				a[i][j] = String.valueOf(s.charAt(j));
				aa[i][j] = 0;
			}
		}
//		for (int i = 0; i < n; i++) {
//			b[i] = sc.nextInt();
//			bb[i] = b[i];
//		}

		int index = 0;


		for (int i = 0; i < h; i++) {
			index++;
			f = false;
			for(int j = 0; j < w; j++) {
				if(a[i][j].equals("#") && f){
					index++;
				}
				if(a[i][j].equals("#") && !f) {
					f = true;
//					System.err.println("aaaaaa");
				}
				aa[i][j] = index;
				if(f2) {
					aa[i-1][j] = aa[i][j];
				}
			}
			f2 = false;
			if(!f) {
				index += -1;
				f2 = true;
			}
		}

		if(f2) {
			for(int j = 0; j < w; j++) {
					aa[h-1][j] = aa[h-2][j];
			}
		}
		for (int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				System.out.print(aa[i][j]);;
				System.out.print(" ");
			}
			System.out.println("");
		}

		sc.close();
	}
}