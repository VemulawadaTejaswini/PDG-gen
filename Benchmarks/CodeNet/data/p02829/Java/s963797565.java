import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	//C問題

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;

		a = scan.nextInt();
		b = scan.nextInt();

		List<Integer> numList = new ArrayList<>();
		numList.add(1);
		numList.add(2);
		numList.add(3);

		numList.remove(a);
		numList.remove(b);

		System.out.println(numList.get(0));
	}

}