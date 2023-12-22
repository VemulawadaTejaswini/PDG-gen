
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;
		sc.close();
		int[] modNums = new int[2019];
		count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0') {
				continue;
			}
			String strI = s.substring(i);
			long numI = Integer.parseInt(strI);
			modNums[(int)(numI%2019)]++;
		}

		count += modNums[0];
		for (int num : modNums) {
			count += (num * (num - 1) / 2);
		}
		System.out.println(count);
	}

}
