import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main  {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int count = 0;
		TreeMap<Integer, Integer> map = new TreeMap<>();

		for(int i = 0; i < n; i++) {
			int query = scan.nextInt();
			int a = scan.nextInt();

			switch(query) {

			case 0:	//insert
				if(!map.containsKey(a)) map.put(a, 1l);
				else map.put(a, map.get(a) + 1);
				count++;
				System.out.println(count);
				break;

			case 1:	//find
				if(map.get(a) != null) System.out.println(map.get(a));
				else System.out.println(0);
				break;

			case 2:	//delete
				if(map.get(a) != null) {
					count -= map.get(a);
					map.remove(map.get(a));
				}
				break;

			case 3:	//dump
				int b = scan.nextInt();
				SortedMap<Integer, Integer> subM = map.subMap(a,true, b,true);
				for(Integer x : subM.keySet()) {
					for(int j=0; j<map.get(x); i++) {
						System.out.println(x);
					}
				}
				break;
			}
		}
	}
}
