import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int h = sc.nextInt();
		int w = sc.nextInt();

		int index = 0;
		int[][] a = new int[h][w];
		for(int i = 0; i < h; i++) {
			String str = sc.next();
			boolean Wcut = true;
			for(int j = 0; j < w; j++) {
				if(str.charAt(j) == '.') {
					a[index][j] = 0;
				} else {
					a[index][j] = 1;
					Wcut = false;
				}
			}
			if(!Wcut) {
				index++;
			}
		}
		
		for(int i = 0; i < w; i++) {
			boolean Hcut = true;
			for(int j = 0; j < index; j++) {
				if(a[j][i] == 1) {
					Hcut = false;
					break;
				}
			}
			if(Hcut) a[0][i] = -1;
		}

		for(int i = 0; i < index; i++) {
			for(int j = 0; j < w; j++) {
				if(a[0][j] == -1) continue;
				if(a[i][j] == 0) {
					System.out.print(".");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
}