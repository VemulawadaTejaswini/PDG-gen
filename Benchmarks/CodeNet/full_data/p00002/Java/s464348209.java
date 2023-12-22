import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> ret = new ArrayList<Integer>();
		while (sc.hasNext()) {
			ret.add(sc.nextLine().length() + sc.nextLine().length());
		}
		ret.forEach(e -> System.out.println(e));
	}
}