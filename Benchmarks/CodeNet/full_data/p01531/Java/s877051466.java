import java.util.*;
import java.io.*;
import java.math.*;

class Main {
	static String[][] map = new String[][] {{"a","i","u","e","o"},{"ka","ki","ku","ke","ko"},{"sa","si","su","se","so"},{"ta","ti","tu","te","to"},{"na","ni","nu","ne","no"},
		{"ha","hi","hu","he","ho"},{"ma","mi","mu","me","mo"},{"ya","","yu","","yo"},{"ra","ri","ru","re","ro"},{"wa","","nn","","wo"}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] in = sc.next().toCharArray();
		for(int i = 0; i < in.length; i += 2) {
			int c = 0;
			switch(in[i+1]) {
			case 'T':c = 0; break;
			case 'L':c = 1; break;
			case 'U':c = 2; break;
			case 'R':c = 3; break;
			case 'D':c = 4; break;
			}
			if(in[i] == '0') {
				System.out.print(map[9][c]);
			}
			else {
				System.out.print(map[(in[i] - '0') - 1][c]);
			}
		}
		System.out.println();
		
	}
}