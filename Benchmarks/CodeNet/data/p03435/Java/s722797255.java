

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String result = "Yes";
			int[][] arr = new int[3][3];
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int a[] = new int[3];
			int b[] = new int[3];
			a[0] = 0;
			for(int i = 0; i < 3; i++) {
				b[i] = arr[0][i] - a[0];
				a[i] = arr[i][0] - b[0];
			}
			l : for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(a[i] + b[j] != arr[i][j]) {
						result = "No";
						break l;
					}
				}
			}
			System.out.println(result);
	}

}
