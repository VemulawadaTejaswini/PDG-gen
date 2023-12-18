import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = Integer.parseInt(sc.next());
		
		HashMap<String, Integer> map = new HashMap<>();
		long count = 0;
		for (int i = 0; i < N; i++) {
			char[] c = sc.next().toCharArray();
			Arrays.sort(c);
			String s = new String(c);
			Integer n;
			if (map.containsKey(s)) {
				n = map.get(s);
				map.put(s, n+1);
				count += n+1;
			}	
			else {
				map.put(s, 0);
			}	
		}
		
		System.out.println(count);
	}
}