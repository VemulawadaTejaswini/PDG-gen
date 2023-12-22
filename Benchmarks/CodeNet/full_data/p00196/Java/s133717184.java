
import java.io.*;
import java.util.*;


// 2011/10/23

// 0196 ìåï
public class Main {
	
	
	class Team implements Comparable<Team> {
		String name;
		int win;
		int lose;
		public Team(String name, int win, int lose) {
			this.name = name;
			this.win = win;
			this.lose = lose;
		}
		@Override
		public int compareTo(Team o) {
			if (win != o.win) {
				return -(win - o.win);
			}
			else
				return (lose - o.lose);
		}
		
	}
	

	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		int n = readIntArray()[0];
		if (n == 0)
			return false;
		
		List<Team> list = new ArrayList<Team>();
		for(int i = 0; i < n; i++) {
			String s = reader.readLine();
			String[] sp = s.split(" ");
			
			int win = 0;
			int lose = 0;
			for(int j = 0; j < n - 1; j++) {
				String r = sp[j + 1];
				if (r.equals("0")) {
					win++;
				}
				else if (r.equals("1")) {
					lose++;
				}
			}
			list.add(new Team(sp[0], win, lose));
		}	
		
		Collections.sort(list);
		
		for(Team t: list) {
			System.out.printf("%s\n", t.name);
		}
		
//		System.out.printf("%d\n", sum / size);
		
		return true; // ³íI¹ Ö
	}
	

//	private final static boolean DEBUG = true;  // debug
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;
			
			String inputStr = "1:15:";

			inputStr = inputStr.replace(":", "\n");

			reader = new BufferedReader(new StringReader(inputStr)); 

		}
		else {
			log = new PrintStream(new OutputStream() { public void write(int b) {} } ); // «ÌÄ
			reader = new BufferedReader(new InputStreamReader(System.in)); // R\[©ç
		}
		
		int N = Integer.MAX_VALUE;
		//int N = readIntArray()[0];

		for(int i = 0; i < N; i++) {
			boolean b = new Main().main();
			if (!b)
				break;
		}		
		
		reader.close();
	}

	
	static PrintStream log;
	static BufferedReader reader;
	

	// WüÍæè1sªÌæØè¶æØèÅÌ®lðÇÞ
	// EOFÌêÍnullðÔ·
	private static int[] readIntArray() throws IOException {

		String s = null;
		for(;;) {
			s = reader.readLine();
//			log.printf("%s\n", s);
			if (s == null)
				return null;
			s = s.trim();
			if (s.length() != 0) // ¦¦¦@Ç¤àËRósðÇÞ±Æª éBÇÝòÎ·Æ¤Ü­¢­çµ¢BBBB
				break;
		}
		
		String[] sp = s.split("[ ,]"); // æØè¶ÍXy[X©J}
		int[] a = new int[sp.length];
		for(int i = 0; i < sp.length; i++) {
			a[i] = Integer.parseInt(sp[i]);
		}
		return a;
	}
		
}