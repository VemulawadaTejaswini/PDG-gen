import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Character, Set<String>> map = new HashMap<>();
		for(int i =0; i < n; i++) {
			String s = sc.next();
			if(!s.matches("^[MARCH].*")) continue;
			char c = s.charAt(0);
			if(!map.containsKey(c)) map.put(c, new HashSet<String>());
			map.get(c).add(s);
		}
		if(map.size() < 3) {
			System.out.println(0);
			return;
		}
		List<Set<String>> list = new ArrayList<>(map.values());
		list.forEach(System.out::println);
		long sum = 0;
		for(int i = 0;i < list.size(); i++){
			for(int j = i+1; j < list.size(); j++){
				for(int k = j+1; k < list.size(); k++){
					long l = (long)list.get(i).size() * (long)list.get(j).size() * (long)list.get(k).size();
					sum += l;
				}
			}
		}
		System.out.println(sum);

	}
}
