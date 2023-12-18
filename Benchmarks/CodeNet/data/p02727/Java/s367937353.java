import java.net.CookieHandler;
import java.util.*;

public class Main {

	private static List<Long> getStrings(Scanner sc, long num) {
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
		long x = sc.nextLong();
		long y = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		List<Long> aArray = getStrings(sc, a);
		List<Long> bArray = getStrings(sc, b);
		List<Long> cArray = getStrings(sc, c);

		List<Long> allArray = new ArrayList<>();
		allArray.addAll(aArray.subList(0, (int)x));
		allArray.addAll(bArray.subList(0, (int)y));
		allArray.addAll(cArray);
		Collections.sort(allArray);
		Collections.reverse(allArray);
		long sum = 0;
		for (int i = 0; i < x+y; i++) {
			sum+=allArray.get(i);
		}

		System.out.println(sum);
	}

}
