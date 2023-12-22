import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		int n = Integer.parseInt(line1);

		int[] num = new int[n];

		for (int i = 0; i < n; i++) {
			String kari = sc.nextLine();
			num[i] = Integer.parseInt(kari);
		}

		int answer = 0;

		for (int i = 0; i < n; i++) {
			if (num[i] == 2) {
				answer++;
			} else if (num[i] % 2 != 0 && num[i] >= 3) {
				double sq = Math.sqrt(i);
				int sqr = (int) sq;
				
				int j = 3;
				int breakcount = 0;
				while (j <= sq) {
					if (num[i] % j == 0) {
						breakcount = 1;
						break;
					}
				}
				if (breakcount == 0) {
					answer++;
				}
			}
		}
		System.out.println(answer);

	}

}