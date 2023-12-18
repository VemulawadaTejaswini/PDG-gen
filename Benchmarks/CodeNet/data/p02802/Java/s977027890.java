import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		Map<Integer, String> map = new HashMap<Integer, String>();
		int ok = 0;
		int ng = 0;
		for(int i = 0; i < m; i++) {
			int p = scan.nextInt();
			String s = scan.next();
			if(map.get(p) == null) {
				map.put(p, s);
				if(s.equals("AC")) {
					ok++;
				} else {
					ng++;
				}
			} else if (map.get(p).equals("WA")) {
				if(s.equals("AC")) {
					ok++;
                    map.put(p, s);
				} else {
					ng++;
				}
			}
		}

		System.out.println(ok + " " + ng);
	}
}