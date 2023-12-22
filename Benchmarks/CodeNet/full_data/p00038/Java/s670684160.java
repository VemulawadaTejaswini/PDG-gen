import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private int[] card = new int[5];

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String[] cd = scan.nextLine().split(",");
			for (int i = 0; i < 5; i++) card[i] = Integer.parseInt(cd[i]);
			
			Arrays.sort(card);
			
			if (fourCard()) {
				System.out.println("four card");
			}else if (fullHouse()) {
				System.out.println("full house");
			}else if (straight()) {
				System.out.println("straight");
			}else if (threeCard()) {
				System.out.println("three card");
			}else if (twoPair()) {
				System.out.println("two pair");
			}else if (onePair()) {
				System.out.println("one pair");
			}else {
				System.out.println("null");
			}
			
		}
	}
	
	private boolean fourCard() {
		int max = 0;
		for (int i = 0; i < 5; i++) {
			max = Math.max(max, continueNum(card[i]));
		}
		return (max > 3);
	}
	
	private boolean fullHouse() {
		int max1 = -1;
		for (int i = 0; i < 5; i++) {
			if (continueNum(card[i]) == 3) max1 = card[i];
		}
		
		if (max1 != -1) {
			int count = 0, max;
			for (int i = 0; i < 5; i++) {
				if (card[i] != max1) {
					for (int j = 0; j < 5; j++) {
						if (card[j] != max1 && i != j && card[i] == card[j]) return true;
					}
				}
			}
			return false;
		}else {
			return false;
		}
	}
	
	private boolean straight() {
		if (card[0] == 1) {
			if (card[1] == 2 && card[2] == 3 && card[3] == 4 && card[4] == 5) return true;
			else if (card[1] == 10 && card[2] == 11 && card[3] == 12 && card[4] == 13) return true;
			else return false;
		}else {
			if (card[1] == card[0] + 1 && card[2] == card[1] + 1 && card[3] == card[2] + 1 && card[4] == card[3] + 1) return true;
			else return false;
		}
	}
	
	private boolean threeCard() {
		for (int i = 0; i < 5; i++) {
			if (continueNum(card[i]) == 3) return true;
		}
		return false;
	}
	
	private boolean twoPair() {
		int pair1 = -1;
		for (int i = 0; i < 5; i++) {
			if (continueNum(card[i]) == 2) {
				pair1 = card[i];
				break;
			}
		}
		
		if (pair1 != -1) {
			for (int i = 0; i < 5; i++) {
				int count = 0;
				if (card[i] != pair1) {
					for (int j = 0; j < 5; j++) {
						if (i != j && card[i] == card[j]) count++;
					}
				}
				if (count == 1) return true;
			}
			return false;
		}else {
			return false;
		}
	}
	
	private boolean onePair() {
		for (int i = 0; i < 5; i++) {
			if (continueNum(card[i]) == 2) return true;
		}
		return false;
	}
	
	private int continueNum(int num) {
		int count = 0;
		for (int i = 0; i < 5; i++) {
			if (num == card[i]) count++;
		}
		return count--;
	}
	
	private void debug() {
		System.out.println();
	}

}