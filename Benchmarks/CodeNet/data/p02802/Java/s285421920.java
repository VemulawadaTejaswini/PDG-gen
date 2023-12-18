import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int m = Integer.parseInt(scan.next());

		List<Integer> ac = new ArrayList<Integer>();
		List<Integer> pena = new ArrayList<Integer>();
		Collections.fill(ac, 1);
		Collections.fill(pena, 0);

		for(int i=0; i<m; ++i)  {
			int p = Integer.parseInt(scan.next());
			String s = scan.next();

			if(ac.get(i) == 1) continue;
			if(s.equals("AC")) {
				ac.set(p, 1);
			} else {
				pena.set(p, (pena.get(p)+1));
			}
		}
		scan.close();

		int AC = 0, PENA = 0;
		for(int i=0; i<m; ++i) {
			AC += ac.get(i);
			PENA += pena.get(i);
		}

		System.out.println(AC + " " + PENA);

	}

}