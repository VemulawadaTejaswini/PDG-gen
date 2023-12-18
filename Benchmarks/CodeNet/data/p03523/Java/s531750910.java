import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(find(sc.next()));
	}

	static String find(String s) {
		boolean[] ft = { false, true };

		for (boolean b1: ft)
			for (boolean b2: ft)
				for (boolean b3: ft)
					for (boolean b4: ft)
						if (String.format("%sKIH%sB%sR%s", a(b1), a(b2), a(b3), a(b4)).equals(s))
							return "YES";
		return "NO";
	}

	static String a(boolean b) {
		return b ? "A" : "";
	}
}
