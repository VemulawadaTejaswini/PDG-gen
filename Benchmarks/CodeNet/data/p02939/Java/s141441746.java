import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class A {
	static String s = "";
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			s = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		HashMap<String, Integer> map = new HashMap<>();
		
		System.out.println(search(map, 0, 1));		
		
}
	
	static int search(HashMap<String, Integer> map, int begin, int len) {
		if(begin+len >= s.length())return map.size();
		String sub = s.substring(begin, begin+len);
		if(map.containsKey(sub)) {
			return search(map, begin, len+1);
		}else {
			map.put(sub, begin);
			return search(map, begin+1, 1);
		}
	}
}
