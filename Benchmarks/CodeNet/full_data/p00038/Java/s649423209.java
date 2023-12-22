import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (sc.hasNextLine()) {
				String[] cards = sc.nextLine().split(",");
				Integer[] numbers = new Integer[5];
				for (int i = 0; i < cards.length; i++) {
					numbers[i] = Integer.parseInt(cards[i]);
				}
				Arrays.sort(numbers);
				List<Integer> numberList = Arrays.asList(numbers);
				int count = 1;
				int value = 1;
				// ???????????????????????????????????????????????\????????¢??????????????¢??????????????????????????????????????????
				for (int i = 1; i < numberList.size(); i++) {
					if (numberList.get(i - 1) == numberList.get(i)) {
						count += value;
						value++;
					} else {
						value = 1;
					}
				}
				if (count <= 1) {
					// ????????¬?????????????????????????????????
					int sum = 0;
					for (int num : numberList) {
						sum += num;
					}
					if ((sum == 47)
							|| (numberList.get(0) + 1 == numberList.get(1)
									&& numberList.get(1) + 1 == numberList
											.get(2)
									&& numberList.get(2) + 1 == numberList
											.get(3) && numberList.get(3) + 1 == numberList
									.get(4))) {
						count += 5;
					}
				}
				String hand = "null";
				switch (count) {
				case 7:
					hand = "four card";
					break;
				case 6:
					hand = "straight";
					break;
				case 5:
					hand = "full house";
					break;
				case 4:
					hand = "three card";
					break;
				case 3:
					hand = "two pair";
					break;
				case 2:
					hand = "one pair";
					break;
				default:
					break;
				}
				System.out.println(hand);
			}
		} finally {
			sc.close();
		}
	}
}