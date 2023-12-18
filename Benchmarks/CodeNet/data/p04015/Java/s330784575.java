import java.util.*;

public class Main {
	public static takCards(int[] cards, int avg) {
		ArrayList<Integer>[] cache = new ArrayList<Integer>[cards.length];

		for (ArrayList<Integer> l : cache)
			l = new ArrayList<Integer>();

		long count = 0;
		for (int i = 1; i <= cards.length; i++)
			for (int j = 0; j < cards.length; j++){
				ArrayList<Integer> curList = cache[i-1];
				if (i == 1) {
					curList.add(cards[j]);
					if (cards[j] == avg)
						count++;
				}
				else {
					ArrayList<Integer> prevList = cache[i-2];
					for (int k : prevList){
						curList.add(k + cards[j]);
						if (k+cards[j] == avg*i)
							count++;
					}
				}
			}

		return count;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String firstLine = scanner.nextLine();
		String secondLine = scanner.nextLine();

		String[] convertedFirst = firstLine.split("\\s+");
		int avg = Integer.parseInt(convertedFirst[1]);

		String[] convertedSecond = secondLine.split("\\s+");
		int[] arr = new int[convertedSecond.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(convertedSecond[i]);
		}

		System.out.println(takCards(arr, avg));
	}
}