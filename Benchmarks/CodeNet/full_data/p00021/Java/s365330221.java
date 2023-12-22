import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int tateLine = sc.nextInt();
		int yokoLine = sc.nextInt();
		int[] numList = new int[tateLine];
		
		for (int i = 0; i < tateLine; i++) {
			numList[i] = i + 1;
		}
		
		int[][] yoko = new int[yokoLine][2];
		
		for (int i = 0; i < yokoLine; i++) {
			String[] s = sc.next().split(",");

			yoko[i][0] = Integer.parseInt(s[0]) - 1;
			yoko[i][1] = Integer.parseInt(s[1]) - 1;

		}

		for (int i = 0; i < yokoLine; i++) {
			int b = numList[yoko[i][0]];
			numList[yoko[i][0]] = numList[yoko[i][1]];
			numList[yoko[i][1]] = b;
		}

		for (int i = 0; i < tateLine; i++) {
			System.out.println(numList[i]);
		}
	}

}