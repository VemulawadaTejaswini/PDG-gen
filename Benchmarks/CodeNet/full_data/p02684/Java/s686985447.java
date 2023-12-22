import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer townNum = sc.nextInt();  //townNum = 町の数
		Long teleportNum = sc.nextLong();  //teleportNum = テレポート回数

		List<Integer> teleIn = new ArrayList<Integer>(townNum);  //teleIn = テレポートの移動先全てのリスト
		for(int i = 0; i < townNum; i ++) {
			teleIn.add(sc.nextInt() - 1);
		}

		List<Integer> teleTurn = new ArrayList<Integer>(townNum);  //teleTurn = テレポート移動先の順番リスト
		Integer nowTown = 0;  //nowTown = 今いる町の町番号(最初は０)
		Integer nextTown;  //nextTown = 次の町の町番号
		teleTurn.add(0);  //最初の町は「１の町（０）」なので
		while(true) {
			nextTown = teleIn.get(nowTown);
			if(teleTurn.contains(nextTown)) {
				break;
			}
			teleTurn.add(nextTown);
			nowTown = nextTown;
		}
		
		Integer roopStart = teleTurn.indexOf(nextTown);  //roopStart = teleTurnリストのループが開始する要素番号
	
		Integer notRoop = teleTurn.size() - roopStart - 1;


		Integer result = 0;
		if(teleportNum <= notRoop) {
			Integer teleportNumInt = teleportNum.intValue();
			result = teleTurn.get(teleportNumInt);

		} else {
			Long num1 = teleportNum - notRoop;
			Integer roopRemain = (int)(num1 % (teleTurn.size() - notRoop));

			if(roopRemain == 0) {
				result = teleTurn.get(teleTurn.size() - 1);

			} else {
				result = teleTurn.get(notRoop + roopRemain - 1);

			}
		}
		
		System.out.println(result + 1);
	}
}