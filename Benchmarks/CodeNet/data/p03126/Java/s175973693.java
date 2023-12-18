import java.util.Scanner;

public class Main{

	public static void main (String[] args) {

		Main main = new Main();

		main.solve();
	}

	private void solve () {

		Scanner scanner = new Scanner (System.in);

		int people = scanner.nextInt();
		int foodType = scanner.nextInt();
		int[] likeList = new int[foodType];

		for (int index=0; index<people; index++) {
			int number = scanner.nextInt();
			for (int index2=0; index2<number; index2++) {
				int food = scanner.nextInt();
				likeList[food-1]++;
			}
		}

		int count=0;

		for (int index=0; index<foodType; index++) {
			if (likeList[index]==people) {
				count++;
			}
		}
		System.out.println(count);
	}
}
