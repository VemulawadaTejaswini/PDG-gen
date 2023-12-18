import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HashMap<String, Integer> s = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		String in ;
		for(int i=0;i<n;i++) {
			in = sc.next();
			if(s.containsKey(in)) {
				s.put(in, s.get(in)+1);
			}else {
				s.put(in, 1);
			}
			max = Math.max(max, s.get(in));
		}

		ArrayList<String> out = new ArrayList<>();
		for( String key : s.keySet()) {
			if(s.get(key) == max) {
				out.add(key);
			}
		}
		Collections.sort(out);
		for(int i=0;i<out.size();i++) {
			System.out.println(out.get(i));
		}
	}
}
