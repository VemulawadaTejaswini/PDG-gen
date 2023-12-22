import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){


		List<String> stlst = new ArrayList<>();
		stlst.add("AC");
		stlst.add("WA");
		stlst.add("TLE");
		stlst.add("RE");

		Map<String, Integer> list = new HashMap<>();

		for(String a : stlst) {
			list.put(a, 0);

		}

		Scanner sc = new Scanner(System.in);

		int loop = sc.nextInt();

		for(int i = 0; i < loop; i++) {
			String str = sc.next();
			int a = list.get(str) + 1;
			list.put(str, a);
		}



		for(String a : stlst) {
			System.out.println(
				a + " x " + list.get(a)
					);
		}
	}

}