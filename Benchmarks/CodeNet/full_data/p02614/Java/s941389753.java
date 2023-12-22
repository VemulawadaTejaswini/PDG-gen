import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;

	public static long ans = 0;

	public static void main(String[] args) {

//		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

//		long a = sc.nextLong();

		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();

		String[][] s = new String[h][w];
		for(int i = 0; i < h; i++) {
			String string = sc.next();
			String[] tmp = string.split("");
			for(int j = 0; j < w; j++) {
				s[i][j] = tmp[j];
			}
		}


		//-------------------------------------------------------------------------------------

		//以下メイン処理
		for (int i = 0; i < (1 << h); i++) {
			for(int j = 0; j < (1 << w); j++) {
				String[][] tmp = new String[h][w];

				for(int a = 0; a < h; a++) {
					for(int b = 0; b < w; b++) {
						tmp[a][b] = s[a][b];
					}
				}

				for (int a = 0; a < h; a++) {
					if(((1&i>>a) == 1)) {
						for(int b = 0; b < w; b++) {
							tmp[a][b] = "r";
						}
					}
				}
				for (int a = 0; a < w; a++) {
					if(((1&j>>a) == 1)) {
						for(int b = 0; b < h; b++) {
							tmp[b][a] = "r";
						}
					}
				}

//				for(int a = 0; a < h; a++) {
//					for(int b = 0; b < w; b++) {
//						System.err.print(tmp[a][b]);
//					}
//					System.err.println();
//				}

				int count = 0;
				for(int a = 0; a < h; a++) {
					for(int b = 0; b < w; b++) {
						if(tmp[a][b].equals("#"))
							count++;
					}
				}

				if(count == k)
					ans++;
			}
		}

		//-------------------------------------------------------------------------------------

//		if(f) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

		System.out.println(ans);

		sc.close();
	}
}