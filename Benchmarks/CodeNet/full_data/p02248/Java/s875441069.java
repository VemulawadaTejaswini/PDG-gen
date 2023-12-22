import java.util.HashMap;
import java.util.Scanner;

public class Main {
	final boolean DEBUG = false;
	void run() {
		Scanner scan = new Scanner(System.in);
		char[] t = scan.next().toCharArray();
		char[] p = scan.next().toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < p.length; i++) {
			int index = p.length - i - 1;
			if (!map.containsKey(p[index])) {
				if (DEBUG)
					System.out.println("put: " + p[index] + " " + i);
				map.put(p[index], i);
			}
		}
		int tIdx = p.length - 1;
		while (tIdx < t.length) {
			if (DEBUG)
				System.out.println("tIdx: " + tIdx);
			int index = 0;
			for (index = 0; index < p.length; index++) {
				if (DEBUG)
					System.out.println(index + ": " + t[tIdx - index] + " != " + p[p.length - index - 1]);
				if (t[tIdx - index] != p[p.length - index - 1]) {
					if (map.containsKey(t[tIdx - index])) {
						if (DEBUG)
							System.out.println("add: " + map.get(t[tIdx - index]));
						tIdx += map.get(t[tIdx - index]);
						if (tIdx == t.length - 1 && map.get(t[tIdx - index]) == 0)
							return;
					} else {
						if (DEBUG)
							System.out.println("add: " + p.length);
						tIdx += p.length;
					}
					break;
				}
			}
			if (index == p.length) {
				System.out.println(tIdx - p.length + 1);
				tIdx++;
			}
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}

