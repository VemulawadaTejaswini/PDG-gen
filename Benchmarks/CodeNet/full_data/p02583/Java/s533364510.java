import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> Kind = new ArrayList<Integer>();
		for(int i = 0; i < N; i ++) {
			int length = stdIn.nextInt();
			if(Kind.contains(length)) {
				map.replace(length, map.get(length) + 1);
			}else {
				Kind.add(length);
				map.put(length, 1);
			}
		}
		
		int ans = 0;
		
		for(int i = 0; i < Kind.size(); i ++) {
			for(int j = i + 1; j < Kind.size(); j ++) {
				for(int k = j + 1; k < Kind.size(); k ++) {
					int a = Kind.get(i);
					int b = Kind.get(j);
					int c = Kind.get(k);
					int longest = Math.max(a, Math.max(b, c));
					if(longest < a + b + c - longest) {
						ans += map.get(a) * map.get(b) * map.get(c);
					}
				}
			}
		}
		
		System.out.println(ans);
		
	}
}