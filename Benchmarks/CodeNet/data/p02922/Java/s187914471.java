import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int increase = Integer.parseInt(sc.next()) -1;
		int want = Integer.parseInt(sc.next());
		int total = 1;
		int addCount = 0;

		while (total < want) {
			total += increase;
			addCount++;
		}

		System.out.println(addCount);
	}
}
