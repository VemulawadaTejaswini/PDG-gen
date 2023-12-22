import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		
		new Main().execute(a, b, c, k);
	}

	public void execute(int a, int b, int c, int k) {
		List<int[]> cardPoint = new ArrayList<>();
		int[] firstCard = {a, b, c};
		cardPoint.add(firstCard);
		for (int i = 0; i < k; i++) {
			List<int[]> nextCardPoint = new ArrayList<>();
			
			for (int[] cards : cardPoint) {
				int[] redCard = {cards[0] * 2, cards[1], cards[2]};
				int[] greenCard = {cards[0], cards[1] * 2, cards[2]};
				int[] blueCard = {cards[0], cards[1], cards[2] * 2};
				
				if (judge(redCard) || judge(greenCard) || judge(blueCard)) {
					System.out.println("Yes");
					return;
				}
				nextCardPoint.add(redCard);
				nextCardPoint.add(greenCard);
				nextCardPoint.add(blueCard);
			}
			cardPoint = nextCardPoint;
		}
		System.out.println("No");
	}
	
	private boolean judge(int[] card) {
		return card[0] < card[1] && card[1] < card[2];
	}
}


