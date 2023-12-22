import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/xxxyyyy/input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("src/xxxyyyy/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tno = 0; tno < T; tno++) {
			int R = 8, C = 8;
			char[][] table = new char[8][];
			for(int i = 0; i < 8; i++)
				table[i] = sc.next().toCharArray();
			int c = sc.nextInt() - 1;
			int r = sc.nextInt() - 1;
			
			Queue<Integer> q = new LinkedList<Integer>();
			q.add(r); q.add(c);
			while(!q.isEmpty()) {
				r = q.poll();
				c = q.poll();
				
				for(int dr = -3; dr <= 3; dr++)
					if ( 0 <= r + dr && r + dr < 8 && table[r + dr][c] == '1') {
						q.add(r + dr); q.add(c);
						table[r + dr][c] = '0';
					}
				for(int dc = -3; dc <= 3; dc++)
					if ( 0 <= c + dc && c + dc < 8 && table[r][c + dc] == '1') {
						q.add(r); q.add(c + dc);
						table[r][c + dc] = '0';
					}
			}
			System.out.println("Data " + (tno + 1) + ":");
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) System.out.print(table[i][j]);
				System.out.println();
			}
			
			
		}
		while(sc.hasNext()){
			String s = sc.next();
			for(int i = 0; i < s.length(); i++){
				if ( s.charAt(i) == '@') {
					i++;
					int n = s.charAt(i) - '0';
					i++;
					while(n-->0) System.out.print(s.charAt(i));
				} else
					System.out.print(s.charAt(i));
			}
			System.out.println();
		}
	}

}