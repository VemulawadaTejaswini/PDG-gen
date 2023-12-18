import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static List<String> getStrings(Scanner sc, int num) {
		List<String> stringList = new ArrayList<>();
		while(num>0) {
			String nextInt = sc.next();
			stringList.add(nextInt);
			num--;
		}
		return stringList;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> array = getStrings(sc, n);
		System.out.println(array.stream().distinct().count());
	}

}
