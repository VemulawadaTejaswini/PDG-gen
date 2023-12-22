import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int firstNumber = input.nextInt();
		int[] firstList = new int[firstNumber];

		for (int i = 0; i < firstNumber; i++)
			firstList[i] = input.nextInt();

		int secondNumber = input.nextInt();
		int[] secondList = new int[secondNumber];

		for (int i = 0; i < secondNumber; i++)
			secondList[i] = input.nextInt();

		System.out.println(find(firstList, secondList));

	}

	public static int find(int[] first, int[] second) {
		int sameNumber = 0;
		ArrayList<Integer> alreadyAppear = new ArrayList<>();
		boolean appear = false;

		for (int i = 0; i < first.length; i++) {
			for (int j = 0; j < second.length; j++) {
				if (first[i] == second[j]) {
					for (int k = 0; k < alreadyAppear.size(); k++) {
						if (first[i] == alreadyAppear.get(k))
							appear = true;

					}

					if (!appear) {
						sameNumber++;
						alreadyAppear.add(first[i]);
						break;
					}
				}
			}

			appear = false;
		}

		return sameNumber;
	}

}