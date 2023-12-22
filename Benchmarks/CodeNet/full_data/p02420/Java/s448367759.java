import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n;
		int m, h;
		int sum = 0;
		int wordLength = 0;
		int count = 0;
		ArrayList<String> wordsList = new ArrayList<String>();
		ArrayList<Integer> shufflesList = new ArrayList<Integer>();
		while (true) {
			n = sc.next();
			if (n.equals("-")) {
				break;
			}
			wordsList.add(n);
			m = sc.nextInt();
			for (int i = 0; i < m; i++) {
				h = sc.nextInt();
				sum += h;
			}
			wordLength = sum % n.length();
			shufflesList.add(wordLength);
			sum = 0;
			count++;
		}
		for (int i = 0; i < count; i++) {
			char[] array = wordsList.get(i).toCharArray();
			int shuffle = shufflesList.get(i);
			for (int j = shuffle; j < array.length; j++) {
				System.out.print(array[j]);
			}
			for (int j = 0; j < shuffle; j++) {
				System.out.print(array[j]);
			}
			System.out.println();
		}
		sc.close();
	}
}
