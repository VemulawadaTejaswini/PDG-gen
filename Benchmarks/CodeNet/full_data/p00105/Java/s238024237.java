import java.util.*;
import java.awt.geom.*;
public class Main {
	private void doit(){
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		while(sc.hasNext()){
			String s = sc.next();
			int num = sc.nextInt();
			if(map.containsKey(s)){
				int ind = map.get(s);
				list.get(ind).add(num);
			}
			else{
				list.add(new ArrayList<Integer>());
				list.get(list.size() - 1).add(num);
				map.put(s, list.size() - 1);
			}
		}
		
		ArrayList<String> list2 = new ArrayList<String>();
		for(String key: map.keySet()){
			list2.add(key);
		}
		Collections.sort(list2);
		for(int i = 0; i < list2.size(); i++){
			String key = list2.get(i);
			int ind = map.get(key);
			System.out.println(key);
			Collections.sort(list.get(ind));
			System.out.print(list.get(ind).get(0));
			for(int j = 1; j < list.get(ind).size(); j++){
				System.out.print(" " + list.get(ind).get(j));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}