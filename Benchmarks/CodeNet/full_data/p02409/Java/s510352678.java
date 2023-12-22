import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] tower1 = {{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
		int[][] tower2 = {{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
		int[][] tower3 = {{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
		int[][] tower4 = {{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
		for (int i = 0; i < n; i++) {
			int[] line = convertInt(br.readLine().split(" "));
			switch (line[0]) {
				case 1:
					tower1[line[1] - 1][line[2] - 1] += line[3];
					break;
				case 2:
					tower2[line[1] - 1][line[2] - 1] += line[3];
					break;
				case 3:
					tower3[line[1] - 1][line[2] - 1] += line[3];
					break;
				case 4:
					tower4[line[1] - 1][line[2] - 1] += line[3];
					break;
			}
		}
		print(tower1);
		System.out.println("####################");
		print(tower2);
		System.out.println("####################");
		print(tower3);
		System.out.println("####################");
		print(tower4);
	}

	private static void print(int[][] two_array) {
		int cnt = 0;
		for (int[] array : two_array) {
			for (int i : array) {
				cnt++;
				System.out.print(" " + i);
			}
			System.out.println("");
		}
	}

	private static int[] convertInt(String[] strArray) {
		int len = strArray.length;
		int[] intArray = new int[len];
		for (int i = 0; i < len; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray;
	}
}