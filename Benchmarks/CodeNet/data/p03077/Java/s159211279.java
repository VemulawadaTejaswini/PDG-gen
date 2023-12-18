import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		//コマンドライン引数取得部分
		Scanner scanner = new Scanner(System.in);
		//グループ人数
		//BigInteger people = scanner.nextBigInteger();
		//Integer people = scanner.nextInt();
		Long people = scanner.nextLong();
		//乗客数
		//ArrayList<BigInteger> passengerNumList = new ArrayList<>();
		//ArrayList<Integer> passengerNumList = new ArrayList<>();
		ArrayList<Long> passengerNumList = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			//passengerNumList.add(scanner.nextBigInteger());
			//passengerNumList.add(scanner.nextInt());
			passengerNumList.add(scanner.nextLong());
		}
		scanner.close();

		//最小移動時間
		int time = 0;
		//各都市に残っている人数
		//BigInteger ZERO = BigInteger.ZERO;
		Long ZERO = new Long(0);
		//BigInteger[] cityNumList = { people, ZERO, ZERO, ZERO, ZERO, ZERO };
		//Integer[] cityNumList = { people, 0, 0, 0, 0, 0 };
		Long[] cityNumList = { people, ZERO, ZERO, ZERO, ZERO, ZERO };
		while (cityNumList[5].compareTo(people) != 0) {
			for (int i = 4; 0 <= i; i--) {
				if (cityNumList[i] > 0) {
					if (cityNumList[i] > passengerNumList.get(i)) {
						cityNumList[i + 1] += passengerNumList.get(i);
						cityNumList[i] -= passengerNumList.get(i);
					} else {
						cityNumList[i + 1] += (cityNumList[i]);
						cityNumList[i] = ZERO;
					}
				}
			}
			time++;
		}
		System.out.println(time);
	}

}
