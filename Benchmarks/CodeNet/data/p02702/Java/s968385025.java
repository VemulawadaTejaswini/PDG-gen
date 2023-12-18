
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;
		sc.close();
		int[] modCount = new int[2019];

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0') {
				continue;
			}
			String strI = s.substring(i);
			int index = (int)(Long.parseLong(strI) % 2019);
			modCount[index]++;
		}

		count = 0;
		count += modCount[0];
		for (int num : modCount) {
			count += (num * (num - 1) / 2);
		}
		System.out.println(count);
	}

}
