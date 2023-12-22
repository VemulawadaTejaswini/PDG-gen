import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		Set<String> set = new HashSet<String>();
		List<String> candidate = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			int h = sc.nextInt(), w = sc.nextInt();
			if (h == 0 && w == 0) break;
			
			sc.nextLine();
			char[][] donut = new char[h][w];
			for (int i = 0; i < h; i++) {
				String s = sc.nextLine();
				for (int j = 0; j < w; j++)
					donut[i][j] = s.charAt(j);
			}
			
			int[] dx = {0, 0, 1, -1, 1, -1, 1, -1};
			int[] dy = {1, -1, 0, 0, 1, -1, -1, 1};
			
			set.clear();
			candidate.clear();
			
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					for (int k = 0; k < 8; k++) {
						sb.delete(0, sb.length());
						int x = i, y = j;
						do {
							sb.append(donut[x][y]);
							if (set.contains(sb.toString())) {
								if (candidate.isEmpty())
									candidate.add(sb.toString());
								else if (candidate.get(0).length() == sb.length())
									candidate.add(sb.toString());
								else if (candidate.get(0).length() < sb.length()) {
									candidate.clear();
									candidate.add(sb.toString());
								}
								
							} else if (sb.length() > 1){
								set.add(sb.toString());
							}
							x = (x + dx[k] + h) % h;
							y = (y + dy[k] + w) % w;
						} while (x != i || y != j);
					}
				}
			}
			Collections.sort(candidate);
			if (candidate.size() == 0)
				out.println(0);
			else
				out.println(candidate.get(0));
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}