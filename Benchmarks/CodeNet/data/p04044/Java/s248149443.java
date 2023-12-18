
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int nagasa = scan.nextInt();
		int n = scan.nextInt();

		//String[] ary = new String[nagasa];
		Set<String> set = new TreeSet<String>();

		int i = 0;

		for (i = 0; i <= nagasa; i++) {
			set.add(scan.nextLine());

		}
		//System.out.println(set);

		Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }

	}

}