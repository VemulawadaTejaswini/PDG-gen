
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long monsterNumber = scan.nextLong(); // モンスターの数
		long countSPATK = scan.nextLong(); // 必殺技の使用可能回数

		// monsterの数と必殺技の回数を比較
		if (monsterNumber < countSPATK) {
			System.out.println(0);
			scan.close();
			return;
		}

		List<Long> listMonsterHP = new ArrayList<Long>(); // monsterのHPリスト
		long countActionMin = 0; // 必殺技は含めない
		for(int i = 0; i < monsterNumber; i++) {
			long input = scan.nextLong();
			listMonsterHP.add(input);
			countActionMin += input;
		}

		scan.close();

		// 必殺技を使って倒す
		for(; countSPATK > 0; countSPATK--) {
			int index = 0;
			for(int j = 0; j < listMonsterHP.size(); j++) {
				if (listMonsterHP.get(index) < listMonsterHP.get(j)) {
					index = j;
				}
			}
			countActionMin -= listMonsterHP.get(index);
			listMonsterHP.set(index, 0l);
		}

		System.out.println(countActionMin);
	}
}
