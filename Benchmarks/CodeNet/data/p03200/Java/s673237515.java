import java.util.*;

/**
 * x==black, o==whiteとする xo -> ox oxoo -> ooxo oxox -> ooxx xxoo -> xoxo xxox ->
 * xoxx
 * 
 * @author glycine
 *
 */
public class Main {
	String S;
	List<Integer> origIndexes;
	long result;

	Main() {
		Scanner in = new Scanner(System.in);
		S = in.nextLine();
		in.close();
		this.origIndexes = new ArrayList<>();
	}

	void calc() {
		for (int i = 0; i < S.length(); ++i) {
			char c = S.charAt(i);
			if (c == 'W') {
				origIndexes.add(i);
			}
		}
		long result = 0;
		for (int i = 0; i < this.origIndexes.size(); ++i) {
			result += (long) (this.origIndexes.get(i) - i);
		}
		this.result = result;
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		System.out.println(ins.result);
	}
}