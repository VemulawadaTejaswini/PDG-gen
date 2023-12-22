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
		int ac = 0;
		int wa = 0;
		int tle = 0;
		int re = 0;
		for (String a :array) {
			if (a.equals("AC")) {
				ac++;
				continue;
			}
			if (a.equals("WA")) {
				wa++;
				continue;
			}
			if (a.equals("RE")) {
				re++;
				continue;
			}
			if (a.equals("TLE")) {
				tle++;
				continue;
			}
		}
		System.out.println("AC x " + ac);
		System.out.println("WA x " + wa);
		System.out.println("TLE x " + tle);
		System.out.println("RE x " + re);
	}

}
