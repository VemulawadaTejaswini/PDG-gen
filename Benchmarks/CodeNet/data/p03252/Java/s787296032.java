import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		sc.close();
		
		boolean flag = true;
		Map<Character, Character> map = new HashMap<>();
		Map<Character, Integer> sMap = new HashMap<>();
		Map<Character, Integer> tMap = new HashMap<>();
		for(int i = 0;i < S.length();++i) {
			if(map.containsKey(S.charAt(i))) {
				if(map.get(S.charAt(i)) != T.charAt(i)) {
					flag = false;
					break;
				}
			} else {
				map.put(S.charAt(i), T.charAt(i));
			}
			if(sMap.containsKey(S.charAt(i)))
				sMap.put(S.charAt(i), sMap.get(S.charAt(i)) + 1);
			else
				sMap.put(S.charAt(i), 1);
			if(tMap.containsKey(T.charAt(i)))
				tMap.put(T.charAt(i), tMap.get(T.charAt(i)) + 1);
			else
				tMap.put(T.charAt(i), 1);
		}
		if(flag) {
			List<Entry<Character, Integer>> sList = new ArrayList<>(sMap.entrySet());
			List<Entry<Character, Integer>> tList = new ArrayList<>(tMap.entrySet());
			sList.sort(Entry.comparingByValue());
			tList.sort(Entry.comparingByValue());
			if(sList.size() != tList.size()) {
				flag = false;
			} else {
				for(int i = 0;i < sList.size();++i) {
					if(sList.get(i).getValue() != tList.get(i).getValue()) {
						flag = false;
						break;
					}
				}
			}
		}
		
		if(flag)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
