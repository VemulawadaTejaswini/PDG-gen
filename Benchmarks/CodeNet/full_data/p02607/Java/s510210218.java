import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static List<Long> getStrings(Scanner sc, int num) {
		List<Long> stringList = new ArrayList<>();
		while(num>0) {
			long nextInt = sc.nextLong();
			stringList.add(nextInt);
			num--;
		}
		return stringList;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Long> array = getStrings(sc, n);
		int count = 0;
		for (int i = 0; i < n; i+=2) {
			if (array.get(i) % 2 ==1) {
				count++;
			}
		}
		System.out.println(count);
	}

}
