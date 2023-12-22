import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] all = line.split(" ");

		ArrayList<Integer> allint = new ArrayList<Integer>();

		for (int i = 0; i < all.length; i++) {
			if (judge(all[i]) == true) {
				allint.add(Integer.parseInt(all[i]));
			} else if (all[i].equals("+")) {
				allint.set(allint.size() - 2, allint.get(allint.size() - 2)
						+ allint.get(allint.size() - 1));
				allint.remove(allint.size() - 1);
			} else if (all[i].equals("-")) {
				allint.set(allint.size() - 2, allint.get(allint.size() - 2)
						- allint.get(allint.size() - 1));
				allint.remove(allint.size() - 1);
			} else if (all[i].equals("*")) {
				allint.set(allint.size() - 2, allint.get(allint.size() - 2)
						* allint.get(allint.size() - 1));
				allint.remove(allint.size() - 1);
			}

		}

		System.out.println(allint.get(0));

	}

	String n;

	public Main(String n) {
		super();
		this.n = n;
	}

	public static boolean judge(String n) {
		try {
			Integer.parseInt(n);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}
}