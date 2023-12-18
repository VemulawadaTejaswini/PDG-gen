import java.util.*;
import java.util.stream.*;

public class Main {
	Scanner sc;
	String s, t;
	
	public Main() {
		sc = new Scanner(System.in);
	}
	
	@SuppressWarnings("unchecked")
	private void calc() {
		s = sc.next();
		t = sc.next();
		
		List[] m = new List[26];
		for (int i = 0; i < 26; i++) m[i] = new ArrayList();
		
		for (int i = 0; i < s.length(); i++)
			m[s.charAt(i)-'a'].add(i);
		
		int[][] map = new int[26][];
		for (int i = 0; i < 26; i++) {
			map[i] = new int[m[i].size()];
			for (int j = 0; j < map[i].length; j++)
				map[i][j] = (Integer)m[i].get(j);
		}
		
		int count = 0;
		int pos = 0;
		for (int i = 0; i < t.length(); i++) {
			int c = t.charAt(i)-'a';
			if (map[c].length == 0) {
				pos = -1;
				break;
			}
			if (pos >= s.length()) {
				pos = 0;
				count++;
			}
			
			while (true) {
				int index = Arrays.binarySearch(map[c], pos);
				if (index >= 0) {
					pos++;
				} else if (index < -map[c].length) {
					pos = 0;
					count++;
					continue;
				} else {
					pos = map[c][-index-1]+1;
				}
				break;
			}
		}
		if (pos == -1) System.out.println(-1);
		else System.out.println(count*s.length()+pos);
		System.out.flush();
	}

	public static void main(String[] args) {
		new Main().calc();
	}

}
