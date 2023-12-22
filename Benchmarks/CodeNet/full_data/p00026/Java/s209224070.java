import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(",|\\r\\n");

		paper = new int[2+10+2][2+10+2];
		while (sc.hasNext()) {
			dropInk(sc.nextInt()+2, sc.nextInt()+2, sc.nextInt());
		}
		//  0, 1, : dammy
		//  2, 3, ... , 10, 11, : use
		//  12, 13, : dammy
		int max = 0, count = 0;
		for (int i=2; i <= 11; i++) {
			for (int j=2; j <= 11; j++) {
				if (paper[i][j] == 0) {
					count++;
				} else if (paper[i][j] > max) {
					max = paper[i][j];
				}
			}
		}
		System.out.println(count);
		System.out.println(max);
	}

	public static int[][] paper;

	public static void dropInk(int x, int y, int s) {
		if (s==1) {
			paper[x][y]++;
			paper[x-1][y]++;
			paper[x][y-1]++;
			paper[x+1][y]++;
			paper[x][y+1]++;
			return;
		}

		if (s==2) {
			dropInk(x, y, 1);
			paper[x-1][y-1]++;
			paper[x+1][y-1]++;
			paper[x-1][y+1]++;
			paper[x+1][y+1]++;
			return;
		}

		if (s==3) {
			dropInk(x, y, 2);
			paper[x-2][y]++;
			paper[x][y-2]++;
			paper[x+2][y]++;
			paper[x][y+2]++;
			return;
		}
	}

}