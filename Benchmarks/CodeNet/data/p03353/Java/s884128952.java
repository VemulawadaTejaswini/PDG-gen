import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();

		System.out.println(getSubstring(s,k));
	}

	private static String getSubstring(String s, int k){
		Set<String> set = new HashSet<>();
		String str = s;
		for(char c = 'a'; Character.isAlphabetic(c); c++){
			Queue<String> queue = new ArrayDeque<>();

			List<String> list = new ArrayList<>();
			for(int i = 0;i < str.length(); i++){
				if(str.charAt(i) == c) list.add(s.substring(i));
			}
			Collections.sort(list);
			queue.addAll(list);

			String subS;
			while((subS = queue.poll()) != null){
				for(int i = 1; i <= subS.length(); i++){
					set.add(subS.substring(0, i));
					if(set.size() == k) break;
				}
				if(set.size() == k) break;
			}
			if(set.size() == k) break;
		}
		return set.stream().sorted().collect(Collectors.toList()).get(k-1);
	}
}