import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] S = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char c : S){
			if(!map.containsKey(c)){
				map.put(c, 1);
			}else{
				map.put(c, map.get(c)+1);
			}
		}
		List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>(){
			@Override
			public int compare(Entry<Character, Integer> e1, Entry<Character,Integer> e2){
				return ((Integer)e2.getValue()).compareTo((Integer)e1.getValue());
			}
		});

		if(list.get(0).getValue().equals(list.get(1).getValue())){
			System.out.println("-1 -1");
			return;
		}

		char c1 = list.get(0).getKey();
		char c2 = list.get(1).getKey();
		int a = Math.min(str.indexOf(c1), str.indexOf(c2))+1;
		int b = Math.max(str.lastIndexOf(c1), str.lastIndexOf(c2))+1;

		System.out.println(a + " " + b);
	}
}
