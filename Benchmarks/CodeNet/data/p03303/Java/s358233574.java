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
	
	/**
	 *  入力した数字を配列に格納するメソッド.
	 * @param sc
	 * @param n
	 * @return
	 */
	public static List<Integer> inList(Scanner sc, int n) {
		List<Integer> list = new ArrayList<Integer>();
		for (int a=0;a<n;a++) {
			list.add(sc.nextInt());
		}
		return list;
	}

}