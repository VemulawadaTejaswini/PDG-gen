import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final String EOT = "END_OF_TEXT";
		
		Scanner stdin = new Scanner(System.in);
		String search = "";
		ArrayList<String> list = new ArrayList<String>();
		int result = 0;
		
		try {
			search = stdin.next();
			do
				list.add(stdin.next());
			while (!EOT.equals(list.get(list.size() - 1)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		stdin.close();
		
		for (Iterator<String> i = list.iterator(); i.hasNext(); ) {
			if (search.equalsIgnoreCase(i.next()))
				++result;
		}
		System.out.println(result);
	}
}