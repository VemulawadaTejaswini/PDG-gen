import java.io.*;
import java.util.*;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> mountains = new ArrayList<Integer>();
		while(true){
			String s = r.readLine();
			if(s == null) break;
			mountains.add(Integer.valueOf(s));
		}
		Collections.sort(mountains);
		Collections.reverse(mountains);
		int i = 0;
		for(int m : mountains) {
			System.out.println(m);
			if(++i >= 3) break;
		}
	}
}