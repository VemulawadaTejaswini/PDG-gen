import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, i, q;
		List<String> list = new ArrayList<String>();

		n = scan.nextInt();

		for (i = 0; i < n; i++) {
			q = scan.nextInt();

			switch (q) {
			case 0:
				list.add(scan.next());
				break;
			case 1:
				System.out.println(list.get(scan.nextInt()));
				break;
			case 2:
				list.remove(list.size()-1);
				break;
			default:
				continue;
			}
		}
		
		scan.close();
	}
}
