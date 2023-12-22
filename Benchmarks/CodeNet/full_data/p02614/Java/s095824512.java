import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();
		char a[][] = new char[h][w];
		for (int i = 0 ; i < h ; i++) {
			String s = sc.next();
			for (int j = 0; j < w ; j++)
				a[i][j] = s.charAt(j);
		}
		int num = 0;
		for (int i = 0; i < 1 << h; i++) {
			for (int j = 0; j < 1 << w; j++) {
				int count = 0;
				for (int p = 0; p < h ; p++) {
					for (int q = 0; q < w ; q++) {
                      int p2 = 1 << p;
                      int q2 = 1 << q;
						if((i & p2) == 0 && (j & q2) == 0 && a[p][q] == '#') {
								count++;
							}
					}
					}
				if (count == k)
					num++;
				}
		}
		sc.close();
		System.out.println(num);
	}
}

