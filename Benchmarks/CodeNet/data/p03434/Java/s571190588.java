import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Integer> cards = new ArrayList<Integer>();
		for(int i = 0; i < n; ++i) {
			int card = scan.nextInt();
			cards.add(card);
		}
		scan.close();

		int aliceSum = 0;
		int bobSum = 0;
		boolean aliceTurn = true;

		for(int i=0; i<cards.size(); ++i) {
			if(aliceTurn) {
				aliceSum += getMax(cards);
			} else {
				bobSum += getMax(cards);
			}
			aliceTurn = !aliceTurn;
		}
		System.out.println(aliceSum - bobSum);

	}

	public static int getMax(List<Integer> cards) {
		int max = -1;
		int id = -1;
		for(int i=0; i<cards.size(); ++i) {
			if(cards.get(i) > max) {
				max = cards.get(i);
				id = i;
			}
		}
		cards.set(id,0);
		return max;
	}
}