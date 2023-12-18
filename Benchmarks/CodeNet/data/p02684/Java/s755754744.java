import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int town = Integer.parseInt(sc.next());
		long telepoNum = Long.parseLong(sc.next());
		int[] telepoArray = new int[town];
		for (int i = 0; i < town; i++) {
			telepoArray[i] = Integer.parseInt(sc.next());
		}

		// そのままやるとTLEになりそうなので、法則を見つけて計算回数を減らす
		List<Integer> loopList = new ArrayList<>();
		int point = 1;
		int offset = 0;
		for (int i = 0; i < town; i++) {
			if (loopList.contains(point)) {
				offset = loopList.indexOf(point);
				loopList.subList(0, offset).clear();
				break;
			}
			loopList.add(point);
			point = telepoArray[point-1];
		}
		if (telepoNum < offset) {
			System.out.println(telepoArray[(int) (telepoNum - 1)]);
		} else {
			int telepoNum2 = (int) ((telepoNum - offset) % loopList.size());
			System.out.println(telepoArray[offset+telepoNum2]);
		}
	}
}
