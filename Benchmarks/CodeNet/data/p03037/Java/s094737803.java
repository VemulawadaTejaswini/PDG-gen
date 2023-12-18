import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int CARD_SIZE, GATE_SIZE, ans = 0, first, end, firstMax = 1, endMin;
		CARD_SIZE = sc.nextInt();
		endMin = CARD_SIZE;
		GATE_SIZE = sc.nextInt();

		for (int gateNum = 0; gateNum < GATE_SIZE; gateNum++) {
			first = sc.nextInt();
			end = sc.nextInt();

			if (firstMax < first ) {
				firstMax = first;
			}
			if ( end < endMin) {
				endMin = end;
			}

		}
		sc.close();
		ans = endMin - firstMax + 1;

		System.out.println(ans);

	}

}
