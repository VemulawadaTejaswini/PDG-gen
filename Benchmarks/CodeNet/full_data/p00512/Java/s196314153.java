import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
	static int max;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(int i = 0; i < n; i++) {
			String a = sc.next();
			int b = sc.nextInt();
			if(map.containsKey(a)) map.put(a, map.get(a) + b);
			else {
				list.add(a);
				map.put(a, b);
			}
		}
		Collections.sort(list,new Comp());
		
		for(int i = 0; i < list.size(); i++) { 
			System.out.println(list.get(i) + " " + map.get(list.get(i)));
		}
		
	}
	static class Comp implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			if(o1.length() != o2.length()) return o1.length() - o2.length();
			for(int i = 0; i < o1.length(); i++) {
				if(o1.charAt(i) == o2.charAt(i)) continue;
				return o1.charAt(i) - o2.charAt(i);
			}
			return 0;
		}
		
		
	}
}