import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public final class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		System.out.println(new Solver().solve(in));
	}
}

class Solver {

	String solve(String in) {

		String turn = "First";
		List<Character> l = in.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		LinkedList<Character> ll = new LinkedList<Character>(l);
		ListIterator<Character> li = ll.listIterator(1);
		boolean yes = true;
		while (ll.size() > 2 && li.nextIndex() < ll.size() - 1) {
			char prev = (char) li.previous();
			li.next();
			li.next();
			char next = (char) li.next();
			li.previous();
			li.previous();
			if (prev == next) {
				li.next();
			} else {
				li.remove();
				if (li.previousIndex() > 0)
					li.previous();
				if (turn.equalsIgnoreCase("First")) {
					turn = "Second";
				} else
					turn = "First";
			}
		}
		return turn.equalsIgnoreCase("First") ? "Second" : "First";
	}
}
