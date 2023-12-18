import java.util.*;
import java.io.*;

class Main {

	void solve () {

		HashMap<String, Integer> map = new HashMap<>();
		map.put("SUN", 7);
		map.put("MON", 6);
		map.put("TUE", 5);
		map.put("WED", 4);
		map.put("THU", 3);
		map.put("FRI", 2);
		map.put("SAT", 1);
		System.out.println(map.get(in.next()));
		
	}

	public static PrintWriter out = new PrintWriter(System.out);
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

}