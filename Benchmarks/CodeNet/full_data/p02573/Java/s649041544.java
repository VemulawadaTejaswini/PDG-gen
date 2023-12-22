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
				int indexA = 0;
				int indexB = 0;
				int index2 = 0;
				if (map.containsKey(a)){
					indexA = map.get(a);
					index2 = indexA;
				}
				if (map.containsKey(b)){
					indexB = map.get(b);
					index2 = indexB;
				}
				if ((map.containsKey(a) && map.containsKey(b)) && indexA != indexB){
					HashSet<Integer> setA = group.get(indexA);
					HashSet<Integer> setB = group.get(indexB);
					for (int x : setB){
						setA.add(x);
						map.put(x, indexA);
					}
				} else {
					group.get(index2).add(a);
					group.get(index2).add(b);
					map.put(a, index2);
					map.put(b, index2);
				}
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