public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int[] mini = new int[]{ -1, -2, -3 }; // -1 > -2 > -3
		int temp;
		for (int i = 0; i < 10; i++) {
			temp = sc.nextInt();
			if (temp > mini[0]) {
				mini[2] = mini[1];
				mini[1] = mini[0];
				mini[0] = temp;
			} else if (temp > mini[1]) {
				mini[2] = mini[1];
				mini[1] = temp;
			} else if (temp > mini[2]) {
				mini[2] = temp;
			}
		}

		for (int i = 0; i < 3; i++)
			System.out.println(mini[i]);
	}

}