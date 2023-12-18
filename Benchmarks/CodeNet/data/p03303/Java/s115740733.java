import java.util.*;

public class Main {

	public static void main(String[] args) {
		// make new Scanner.
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int t = Integer.parseInt(sc.next());
		
		while (true) {
			if (t >= str.length()) {
				System.out.println(str.substring(0, 1));
				break;
			} else {
				System.out.print(str.substring(0, 1));
				str = str.substring(t);
			}
		}
		
		// Listに格納.
//		List<Integer> list = inList(sc,n);
		

		// close Scanner
		sc.close();

	}