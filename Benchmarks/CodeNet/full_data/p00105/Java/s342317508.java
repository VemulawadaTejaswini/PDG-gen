import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Map<String, String> book = new HashMap<String, String>();
		while(sc.hasNext()) {
			String[] text = sc.nextLine().split(" ");
			if(book.containsKey(text[0])) {
				book.put(text[0], book.get(text[0]) + " " + text[1]);
			} else {
				book.put(text[0], text[1]);
			}
		}

		//??¢?????????????????????????????????
		Object[] books = book.keySet().toArray();
		Arrays.sort(books);

		for(String str : book.keySet()) {
			System.out.println(str);
			System.out.println(book.get(str));
		}
	}

}