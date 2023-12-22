import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		int MAX = inp.length();
		List<String> cat = new ArrayList<String>();
		cat.add("");
		for (int i = 0; i < cat.size(); i++) {
			if (cat.get(i).length() > MAX)
				break;
			for (int j = 0; j < cat.size(); j++) {
				if (cat.get(j).length() > MAX)
					break;
				String str = "m" + cat.get(i) + "e" + cat.get(j) + "w";
				if (!cat.contains(str))
					cat.add(str);
			}
		}
		System.out.println(cat.contains(inp) ? "Cat" : "Rabbit");
	}
}