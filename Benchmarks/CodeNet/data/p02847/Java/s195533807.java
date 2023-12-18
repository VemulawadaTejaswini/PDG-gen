import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> weekList = new ArrayList<>();
		weekList.add("SUN");
		weekList.add("MON");
		weekList.add("TUE");
		weekList.add("WED");
		weekList.add("THU");
		weekList.add("FRI");
		weekList.add("SAT");

		String S = sc.next();
		int index = weekList.indexOf(S);

		System.out.println(7-index);

		sc.close();
	}
}
