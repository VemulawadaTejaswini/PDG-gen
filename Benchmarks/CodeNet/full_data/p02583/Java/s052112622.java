import java.util.*;


public class Main{
	public static boolean is_able_triangle(Integer a, Integer b, Integer c){
		int a_int = a.intValue();
		int b_int = b.intValue();
		int c_int = c.intValue();

		return (c_int < a_int + b_int);
	};

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		sc = null;
		long result = 0;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		sc = new Scanner(System.in);
		for(int i = 0; i < n; i++){
			int key = Integer.parseInt(sc.next());
			if(map.get(key) == null){
				map.put(key, 1);
			}
			else{
				map.put(key, map.get(key) + 1);
			}
		}

		Collection<Integer> keysToArray = map.keySet();
		Integer[] length_array = keysToArray.toArray(new Integer[keysToArray.size()]);

		for(int f = 0; f < map.size() - 2; f++){
			for(int s = f+1; s < map.size() - 1; s++){
				for(int t = s+1; t < map.size(); t++){
					// System.out.println(length_array[f] + " " + length_array[s] +" "+ length_array[t]);
					if (is_able_triangle(length_array[f], length_array[s], length_array[t])){
						// System.out.println("this is triangle");
						result += map.get(length_array[f]) * map.get(length_array[s]) * map.get(length_array[t]);
						// System.out.println( map.get(length_array[f]) * map.get(length_array[s]) * map.get(length_array[t]));
					}
				}
			}
		}


		// map.keySet().forEach( key->{
		// 		System.out.println(key + " " + map.get(key));
		// 	}
		// );
		System.out.println(result);
	}
}
