

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

		// 体力順にソート
		for(int i = 0; i < countSPATK; i++) {
			for (int j = i + 1; j < listMonsterHP.size(); j++) {
				if (listMonsterHP.get(i) < listMonsterHP.get(j)) {
					Long tmp = listMonsterHP.get(i);
					listMonsterHP.set(i, listMonsterHP.get(j));
					listMonsterHP.set(j, tmp);
				}
			}
			countActionMin -= listMonsterHP.get(i);
		}

		System.out.println(countActionMin);
	}
}
