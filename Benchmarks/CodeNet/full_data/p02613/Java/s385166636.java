import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (final Scanner sc = new Scanner(System.in);) {

			final int n = sc.nextInt();

			List<String> list = new ArrayList<>();
			for(int i=0;i<n;i++) {
				list.add(sc.next());
			}

			int ac=0;
			int wa=0;
			int tle=0;
			int re=0;
			for(String s: list) {
				if(s.equals("AC")) {
					ac++;
				}else if(s.equals("WA")) {
					wa++;
				}else if(s.equals("TLE")) {
					tle++;
				}else if(s.equals("RE")) {
					re++;
				}else {
					continue;
				}
			}

			System.out.println("AC x " + ac);
			System.out.println("WA x " + wa);
			System.out.println("TLE x " + tle);
			System.out.println("RE x " + re);

		}
	}
}