import java.util.*;
import java.io.*;

class Main {

	void solve() {

		HashMap<Integer, String> map = new HashMap<>();
		map.put(25, "Christmas");
		map.put(24, "Christmas Eve");
		map.put(23, "Christmas Eve Eve");
		map.put(22, "Christmas Eve Eve Eve");
		out.println(map.get(inint()));
		
	}
	
	public static Scanner in = new Scanner(System.in);
	public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}
	
	public int inint() {
		return in.nextInt();
	}
	
	public String instr() {
		return in.next();
	}

}