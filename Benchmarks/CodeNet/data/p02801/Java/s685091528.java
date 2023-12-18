import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Map<String, String> M = new HashMap<>();

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		M.put("a", "b");
		M.put("b", "c");
		M.put("c", "d");
		M.put("d", "e");
		M.put("e", "f");
		M.put("f", "g");
		M.put("g", "h");
		M.put("h", "i");
		M.put("i", "j");
		M.put("j", "k");
		M.put("k", "l");
		M.put("l", "m");
		M.put("m", "n");
		M.put("n", "o");
		M.put("o", "p");
		M.put("p", "q");
		M.put("q", "r");
		M.put("r", "s");
		M.put("s", "t");
		M.put("t", "u");
		M.put("u", "v");
		M.put("v", "w");
		M.put("w", "x");
		M.put("x", "y");
		M.put("y", "z");

		System.out.println(M.get(str));

	}
}
