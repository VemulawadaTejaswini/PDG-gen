import java.util.*;
import java.awt.geom.*;

public class Main{

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			StringBuilder s = new StringBuilder(sc.next());
			for(int i = 0; i < s.length(); i++){
				int ind = s.charAt(i) - 'A';
				int newind = (ind - 3 + 26) % 26;
				s.setCharAt(i, (char)(newind + 'A'));
			}
			
			System.out.println(s.toString());
		}
	}

	
	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}