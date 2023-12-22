import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static List<Integer> getStrings(Scanner sc, int num) {
		List<Integer> stringList = new ArrayList<>();
		while(num>0) {
			int nextInt = sc.nextInt();
			stringList.add(nextInt);
			num--;
		}
		return stringList;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> array = getStrings(sc, n);
		array.sort(Integer::compareTo);
		if (array.stream().distinct().count() == 1) {
			System.out.println(0);
			return;
		}
		int count = 1;
		for (int i = 1; i < array.size(); i++) {
			boolean yes= true;
			for (int j = 0; j < i; j++) {
				if (array.get(i) % array.get(j) == 0) {
					yes = false;
					continue;
				}
			}
			if (yes) {
				count++;
			}
		}
		System.out.println(count);
		return;
	}

}
