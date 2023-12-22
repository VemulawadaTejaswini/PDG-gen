import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			String[] strArr = in.nextLine().split(",");
			List<Integer> intArr = new ArrayList<>();
			for (int i = 0; i < strArr.length; i++) {
				intArr.add(Integer.parseInt(strArr[i]));
			}
			solve(intArr);
		}
	}
	public static void solve(List<Integer> hands) {
		Collections.sort(hands);
		int ans = 0;
		int[] cards = new int[15];
		for(int i=0;i<hands.size();i++) {
			cards[hands.get(i)]++;
		}
		int pairs = 0;
		int max = 0;
		for(int i=0;i<cards.length;i++) {
			max = Math.max(max, cards[i]);
			if(cards[i] == 2) pairs++;
		}

		// ?????????A
		boolean streight = false;
		if(hands.get(0) == 1) {
			if(hands.get(1) == 2 && hands.get(2) == 3 && hands.get(3) == 4 && hands.get(4) == 5) streight=true;
			if(hands.get(1) == 10 && hands.get(2) == 11 && hands.get(3) == 12 && hands.get(4) == 13) streight=true;
		} else {
			streight = true;
			for(int i=1;i<hands.size();i++) {
				if(hands.get(i) - hands.get(i-1) != 1) {
					streight = false;
					break;
				}
			}
		}

		if(max == 4) {
			System.out.println("four card");
		} else if(max == 3 && pairs == 1) {
			System.out.println("full house");
		} else if(streight) {
			System.out.println("straight");
		} else if(max == 3) {
			System.out.println("three card");
		} else if(pairs == 2) {
			System.out.println("two pair");
		} else if(pairs == 1) {
			System.out.println("one pair");
		} else {
			System.out.println("null");
		}
	}
}