import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> ret = new ArrayList<Integer>();
		while (sc.hasNext()) {
			String text = sc.nextLine();
			ret.add(text.split(" ")[0].length() + text.split(" ")[1].length());
		}
		for (int num : ret) {
			System.out.println(num);
		}
	}
}