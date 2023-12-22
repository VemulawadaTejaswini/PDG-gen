import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Main {
	static List<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (n != 0) {
			list.clear();
			Collections.addAll(list, scan.nextInt(),scan.nextInt(),scan.nextInt());
			list.sort(Comparator.reverseOrder());
			if ((list.get(0) * list.get(0)) == ((list.get(1) * list.get(1)) + (list.get(2) * list.get(2)))) {
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			n--;
		}
	}
}