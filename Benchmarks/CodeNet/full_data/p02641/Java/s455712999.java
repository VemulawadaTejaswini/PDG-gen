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
		int x = sc.nextInt();
		int n = sc.nextInt();
		List<Integer> p = getStrings(sc, n);
		if (n == 0) {
			System.out.println(x);
			return;
		}
		int min = 0;
		for (int i = x-1; i >=0 ; i--) {
			if (!p.contains(i)) {
				min = i;
				break;
			}
		}
		int max = 200;
		for (int i = x+1; i <= 101 ; i++) {
			if (!p.contains(i)) {
				max = i;
				break;
			}
		}
		if (Math.abs(x-min) == Math.abs(x-max)) {
			System.out.println(min);
			return;
		} else if (Math.abs(x-min) < Math.abs(x-max)) {
			System.out.println(min);
			return;
		} else {
			System.out.println(max);
			return;
		}

	}

}
