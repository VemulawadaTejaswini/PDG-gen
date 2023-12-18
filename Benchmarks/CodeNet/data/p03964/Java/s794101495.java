import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] ary = new int[n][2];
		for (int i = 0; i < n; i++) {
			int[] temp = new int[2];
			temp[0] = sc.nextInt();
			temp[1] = sc.nextInt();
			ary[i] = temp;
		}
		int tPoint = ary[0][0];
		int aPoint = ary[0][1];
		for (int i = 1; i < n; i++) {
			if (tPoint < aPoint) {
				int newAPoint = 0;
				while (aPoint > newAPoint || newAPoint / ary[i][1] * ary[i][0] < tPoint) {
					newAPoint += ary[i][1];
				}
				aPoint = newAPoint;
				tPoint = newAPoint / ary[i][1] * ary[i][0];
			} else {
				int newTPoint = 0;
				while (tPoint > newTPoint || newTPoint / ary[i][0] * ary[i][1] < aPoint) {
					newTPoint += ary[i][0];
				}
				tPoint = newTPoint;
				aPoint = tPoint / ary[i][0] * ary[i][1];
			}
		}
		System.out.println(aPoint + tPoint);
	}

}