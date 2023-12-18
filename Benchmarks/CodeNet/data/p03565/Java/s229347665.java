import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}



	public void run() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int sLen = s.length();
		String t = sc.next();
		int tLen = t.length();
		final String init = String.join("", Collections.nCopies(tLen, "?"));
		ArrayList<String> aList = new ArrayList<String>();
		for(int i=0; i<sLen-tLen+1; i++) {
			StringBuilder tt = new StringBuilder(init);
			for(int j=0; j<=tLen; j++) {
				if(s.substring(i, i+tLen).equals(tt.toString())) {
					StringBuilder ss = new StringBuilder(s);
					ss.replace(i, i+tLen, t.toString());
					aList.add(ss.toString().replaceAll("\\?", "a"));
				}
				if(j<tLen) tt.replace(j, j+1, t.substring(j, j+1));
			}

		}
		aList.add(s);
		Collections.sort(aList);
		if(aList.size()==0) {
			System.out.println("UNRESTORABLE");
		} else {
			System.out.println(aList.get(0));
		}
		sc.close();
	}

}
