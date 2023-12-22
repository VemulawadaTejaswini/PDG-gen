import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		ArrayList<HashSet<Integer>> group = new ArrayList<HashSet<Integer>>();
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int index=0;
		for (int i=0; i<m; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (map.containsKey(a) || map.containsKey(b)){
				int index2;
				if (map.containsKey(a)){
					index2 = map.get(a);
				} else {
					index2 = map.get(b);
				}
				group.get(index2).add(a);
				group.get(index2).add(b);
			} else {
				HashSet<Integer> set = new HashSet<Integer>();
				set.add(a);
				set.add(b);
				group.add(set);
				map.put(a, index);
				map.put(b, index);
				index++;
			}
		}
		int ans=0;
		for (int i=0; i<group.size();i++){
			ans = Math.max(group.get(i).size(), ans);
		}
		System.out.println(ans);
	}


}