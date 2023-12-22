import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String ph = new String();

		
			while(sc.hasNext()) {
				ph = sc.nextLine();
				System.out.printf("%s\n", PokerHand(ph));
			}
	}

	private static String PokerHand(String ph) {
		String[] pkh = new String[5];
		int[] pkh_cnvIntger = new int[5];
		String hndnm = "null";
		Map<Integer, Integer> mapHand = new HashMap<>();
		int cnt = 0;
		boolean isStraight = true;
		int firstRankcnt = 0;
		int secondRankcnt = 0;
		
		pkh = ph.split(",");
		for (int i = 0; i < 5; i++) {
			pkh_cnvIntger[i] = Integer.parseInt(pkh[i]);
			cnt = 1;
				if (mapHand.containsKey(pkh_cnvIntger[i])) {
					cnt = mapHand.get(pkh_cnvIntger[i]) + 1;
				} 
			mapHand.put(pkh_cnvIntger[i], cnt);
		}
	
		for (int i = 1; i <= 13; i++) {
			if (mapHand.containsKey(i)) {
				if (mapHand.get(i) > firstRankcnt ) {
					secondRankcnt = firstRankcnt;
					firstRankcnt = mapHand.get(i);
				} else if ( mapHand.get(i) >secondRankcnt){
					secondRankcnt = mapHand.get(i);
				}
			}
		}
		
		//System.out.println(mapHand);
		
		if (firstRankcnt >= 4) {
			hndnm = "four card";
		} else if (firstRankcnt == 3) {
			if (secondRankcnt == 2) {
				hndnm = "full house";
			} else {
				hndnm = "three card";
			}
		} else if (firstRankcnt == 2) {
			if (secondRankcnt == 2) {
				hndnm = "two pair";
			} else {
				hndnm = "one pair";
			}
		} else {
			hndnm = null;
		}
		
		Arrays.sort(pkh_cnvIntger);
		for (int i = 1; i < 5; i++) { // ストレート
			if (pkh_cnvIntger[i] - pkh_cnvIntger[i - 1] != 1) {
				isStraight = false;
				break;
			}
		}
		if (pkh_cnvIntger[0] == 1 && pkh_cnvIntger[1] == 10 && pkh_cnvIntger[2] == 11 && pkh_cnvIntger[3] == 12 && pkh_cnvIntger[4] == 13) { 
			isStraight = true;
		}
		
		if (isStraight == true) hndnm = "straight";
		
		return hndnm;
	}

}

