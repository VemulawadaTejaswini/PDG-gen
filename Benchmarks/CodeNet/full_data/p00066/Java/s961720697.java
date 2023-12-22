import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0066
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNext()) {
			char[][] cs = new char[3][3];
			String s = sc.next();
			for (int i = 0; i < 9; i++)
				cs[i / 3][i % 3] = s.charAt(i);
			
			char res = 'd';
			for (int i = 0; i < 3; i++) {
				char c = cs[i][0];
				boolean ok = true;
				for (int j = 1; j < 3; j++) 
					if (c != cs[i][j])
						ok = false;
				
				if (ok) res = c;
			}
				
			for (int j = 0; j < 3; j++) {
				char c = cs[0][j];
				boolean ok = true;
				for (int i = 1; i < 3; i++) 
					if (c != cs[i][j])
						ok = false;
				
				if (ok) res = c;
			}
			
			char c = cs[0][0];
			if (c == cs[1][1] && c == cs[2][2])
				res = c;

			c = cs[0][2];
			if (c == cs[1][1] && c == cs[2][0])
				res = c;

			System.out.println(res);
			
		}
	}
}