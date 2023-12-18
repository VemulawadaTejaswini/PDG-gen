import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		in.close();
		Set<Integer> values = new HashSet<>();
		for (int i = 0; i < tokens.length; ++i) {
			values.add(Integer.parseInt(tokens[i]));
		}
		if (values.contains(1) && values.contains(9) && values.contains(7) && values.contains(4)) {
			System.out.println("YES");
		} else {
			System.out.println("No");
		}
	}

}