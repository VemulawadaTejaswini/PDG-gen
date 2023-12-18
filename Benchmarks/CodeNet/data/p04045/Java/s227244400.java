package atCoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int dislikeNumsCount = sc.nextInt();
		int payment = 0;
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			nums.add(i);
		}
		for (int i = 0; i < dislikeNumsCount; i++) {
			int dislikeNum = sc.nextInt();
			if (nums.contains(dislikeNum)) {
				nums.remove(nums.indexOf(dislikeNum));
			}
		}
		int index = 0;
		if (price < 10) {
			int onesDigit = 0;
			index = 0;
			while (true) {
				onesDigit = nums.get(index);
				if (onesDigit > price) {
					break;
				}
				index++;
			}

			payment = onesDigit;
		} else if (price >= 10 && price < 100) {
			int tensDigit = 0;
			index = 0;
			while (true) {
				tensDigit = nums.get(index);
				if (tensDigit * 10 > price) {
					break;
				}
				index++;
			}
			int onesDigit = 0;
			index = 0;
			while (true) {
				onesDigit = nums.get(index);
				if (tensDigit * 10 + onesDigit > price) {
					break;
				}
				index++;
			}

			payment = tensDigit * 10 + onesDigit;
		} else if (price >= 100 && price < 1000) {
			int hundredsDigit = 0;
			index = 0;
			while (true) {
				hundredsDigit = nums.get(index);
				if (hundredsDigit * 100 > price) {
					break;
				}
				index++;
			}
			int tensDigit = 0;
			index = 0;
			while (true) {
				tensDigit = nums.get(index);
				if (hundredsDigit * 100 + tensDigit * 10 > price) {
					break;
				}
				index++;
			}
			int onesDigit = 0;
			index = 0;
			while (true) {
				onesDigit = nums.get(index);
				if (hundredsDigit * 100 + tensDigit * 10 + onesDigit > price) {
					break;
				}
				index++;
			}

			payment = hundredsDigit * 100 + tensDigit * 10 + onesDigit;
		} else if (price >= 1000 && price < 10000) {
			int thousandsDigit = 0;
			index = 0;
			while (true) {
				thousandsDigit = nums.get(index);
				if (thousandsDigit * 1000 > price) {
					break;
				}
				index++;
			}
			int hundredsDigit = 0;
			index = 0;
			while (true) {
				hundredsDigit = nums.get(index);
				if (thousandsDigit * 1000 + hundredsDigit * 100 > price) {
					break;
				}
				index++;
			}
			int tensDigit = 0;
			index = 0;
			while (true) {
				tensDigit = nums.get(index);
				if (thousandsDigit * 1000 + hundredsDigit * 100 + tensDigit * 10 > price) {
					break;
				}
				index++;
			}
			int onesDigit = 0;
			index = 0;
			while (true) {
				onesDigit = nums.get(index);
				if (thousandsDigit * 1000 + hundredsDigit * 100 + tensDigit * 10 + onesDigit > price) {
					break;
				}
				index++;
			}

			payment = thousandsDigit * 1000 + hundredsDigit * 100 + tensDigit * 10 + onesDigit;
		}
		System.out.println(payment);
		sc.close();
	}
}