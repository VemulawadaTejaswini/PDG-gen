import java.util.Scanner;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int personCount = sc.nextInt();
		int[] personHeight = new int[personCount];
		for (int i = 0; i < personCount; i++) {
			personHeight[i] = sc.nextInt();
		}

		int answerCount = 0;

		for (int i = 0; i < (personCount - 1); i++) {
			for (int j = (i + 1); j < personCount; j++) {
				int numberDiff = j - i;
				int heightSum = Math.abs(personHeight[i] + personHeight[j]);
				if (numberDiff == heightSum) {
					answerCount++;
				}
			}
		}

		System.out.print(answerCount);

	return;

	}
}
