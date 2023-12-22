import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sort st = new Sort();
		int n = sc.nextInt();
		int[][] array = new int[n][3];
		for (int i = 0; i < array.length; i++) {
			String str = sc.next();
			try {
				array[i][0] = Integer.parseInt(str.substring(1, str.length()));
				array[i][2] = (int) str.charAt(0);
				array[i][1] = i;
			} catch (Exception e) {
				break;
			}
		}
		int[][] array2 = new int[array.length][array[0].length];
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[0].length; j++) {
				array2[i][j] = array[i][j];
 			}
		}
		st.bubble(array);
		st.select(array2);
	}

}

class Sort {
	Scanner sc;

	public void bubble(int[][] array) {
		int count = 0;
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int i = 1; i < array.length; i++) {
				if (array[i][0] < array[i - 1][0]) {
					swap(array, i, i - 1);
					count++;
					flag = true;
				}
			}
		}
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(((char) array[i][2]) + "" + array[i][0] + " ");
		}
		System.out.println((char)array[array.length - 1][2] + "" + array[array.length - 1][0]);
		if (judge(array)) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}
	}

	public void select(int[][] array) {
		int minJ = 0;
		for (byte i = 0; i < array.length; i++) {
			minJ = i;
			for (byte j = i; j < array.length; j++) {
				if (array[j][0] < array[minJ][0]) {
					minJ = j;
				}
			}
			if (i != minJ) {
				swap(array, minJ, i);
			}
		}
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(((char) array[i][2]) + "" + array[i][0] + " ");
		}
		System.out.println((char)array[array.length - 1][2] + "" + array[array.length - 1][0]);
		if (judge(array)) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}
	}

	public boolean judge(int[][] array) {
		for (int i = 1; i < array.length; i++) {
			if (array[i][0] == array[i - 1][0] && array[i][1] < array[i - 1][1]) {
				return false;
			}
		}
		return true;
	}

	public void swap(int[][] array, int x, int y) {
		for (int i = 0; i < array[0].length; i++) {
			int tmp = array[x][i];
			array[x][i] = array[y][i];
			array[y][i] = tmp;
		}
	}
}

