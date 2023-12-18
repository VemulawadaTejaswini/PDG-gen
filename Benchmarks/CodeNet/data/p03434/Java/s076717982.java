import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] cards = new int[N];
		for (int i = 0; i < N ; i++) {
			cards[i] = sc.nextInt();
		}
		Arrays.sort(cards);

		int AlicePoint = 0;
		int BobPoint = 0;
		for (int i = 0; i < N ; i++) {
			if (i % 2 == 0) {
				AlicePoint += cards[N-1-i];
			} else {
				BobPoint += cards[N-1-i];
			}
		}
		System.out.println(AlicePoint - BobPoint);
	}
}
