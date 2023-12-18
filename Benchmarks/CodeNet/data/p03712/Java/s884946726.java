import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][]a = new char[H][W];
		for(int i = 0; i < H; i++) {
			String s = sc.next();
			for(int j = 0; j < W; j++) {
				a[i][j] = s.charAt(j);
			}
		}
		sc.close();
		String k = "";
		for(int i = 0; i < W + 2; i++) {
			k += "#";
		}
		System.out.println(k);
		if(H == 1 && W == 1) {
			System.out.println("#" + a[0][0] + "#");
			System.out.println(k);
			System.exit(0);
		}
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(j == 0) {
					System.out.print("#" + a[i][j]);
				}else if(j == W - 1) {
					System.out.print(a[i][j] + "#");
				}else {
					System.out.print(a[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println(k);
	}
}