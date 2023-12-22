import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int target = sc.nextInt();
			int number = sc.nextInt();
			Integer[] atari = new Integer[number];
			for (int i=0; i<number; i++) {
				atari[i] = sc.nextInt();
				sc.nextInt();
			}
			Arrays.sort(atari, Comparator.reverseOrder()); // 降順になる
			int money = 0;
			for (int i=0; i<number-1; i++) {
				if (atari[i]<target) {
					money += target - atari[i];
				}
			}
			System.out.println(money);
		}
	}
}

