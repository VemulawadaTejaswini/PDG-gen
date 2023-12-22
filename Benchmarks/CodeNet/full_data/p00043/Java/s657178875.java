import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	public boolean checkHand(String hand) {
		char c = hand.charAt(0); // 先頭の牌
		if (hand.length() == 3) { // 最終ステップだった
			if (hand.equals(""+c+c+c)) return true; //刻子だった
			if ("12".equals(""+(hand.charAt(1)-c)+(hand.charAt(2)-c))) return true; // 順子だった
		} else { // 途中経過だった
			if (hand.startsWith(""+c+c+c)) { // 先頭を含む刻子が存在した
				return checkHand((new StringBuilder(hand)).delete(0, 3).toString());
			}
			if (hand.contains(String.valueOf((char) (c+1)))
				&& hand.contains(String.valueOf((char) (c+2)))) { // 先頭を含む順子が存在した
				int i1 = hand.indexOf(String.valueOf((char) (c+1)));
				int i2 = hand.indexOf(String.valueOf((char) (c+2)));
				return checkHand((new StringBuilder(hand))
					.deleteCharAt(i2).deleteCharAt(i1).deleteCharAt(0).toString());
			}
		}
		return false;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Main m = new Main();

		String line;
		while ((line = br.readLine()) != null) {
			String[] hand_org = new String[14];
			for (int i = 0 ; i < 13 ; i++) hand_org[i] = String.valueOf(line.charAt(i));
			String result = "";
			for (int n = 1 ; n < 10 ; n++) {
				//System.out.println("Add "+n+"-------");
				String[] hand_a = Arrays.copyOf(hand_org, 14);
				hand_a[13] = ""+n; Arrays.sort(hand_a);
				String hand = hand_a[0]+hand_a[1]+hand_a[2]+hand_a[3]
						+hand_a[4]+hand_a[5]+hand_a[6]+hand_a[7]+hand_a[8]
						+hand_a[9]+hand_a[10]+hand_a[11]+hand_a[12]+hand_a[13];
				for (int j = 1 ; j < 10 ; j++) {
					int idxF = hand.indexOf(""+j), idxL = hand.lastIndexOf(""+j);
					if (0 < idxL-idxF && idxL-idxF < 4) { // 追加した牌が２~４枚だった
						//System.out.println(hand+" : "+j+" ("+idxF+" "+idxL+")");
						String body = (new StringBuilder(hand)).deleteCharAt(idxL).deleteCharAt(idxF).toString();
						if (m.checkHand(body)) result = result+" "+n;
					}
				}
			}
			System.out.println((result.equals(""))?0:result.trim());
		}


	}

}