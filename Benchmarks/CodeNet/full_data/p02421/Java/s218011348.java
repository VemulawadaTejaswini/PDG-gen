import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int point[] = new int[2];
		for (int i = 0; i < n; i++) {
			String game = sc.nextLine();
			String games[] = game.split(" ");
			if (games[0].compareTo(games[1]) == 0) {
				point[0]++;
				point[1]++;
			} else if (games[0].compareTo(games[1]) > 0) {
				point[0] += 3;
			} else {
				point[1] += 3;
			}
		}
		System.out.println(String.format("%d %d", point[0], point[1]));
	}

}