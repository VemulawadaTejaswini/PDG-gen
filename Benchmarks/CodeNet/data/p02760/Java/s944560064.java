import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Integer[] a = new Integer[9];
		Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
		List<Integer> list = new ArrayList<>(Arrays.asList(a));
		int n = Integer.parseInt(sc.next());
		for(int i=0; i<n; i++){
			Integer b = Integer.parseInt(sc.next());
			if(list.contains(b)){
				list.set(list.indexOf(b), 0);
			}
		}
		String result = "No";
		if(
			(list.get(0) == list.get(1) && list.get(1) == list.get(2))
			|| (list.get(3) == list.get(4) && list.get(4) == list.get(5))
			|| (list.get(6) == list.get(7) && list.get(7) == list.get(8))
			|| (list.get(0) == list.get(3) && list.get(3) == list.get(6))
			|| (list.get(1) == list.get(4) && list.get(4) == list.get(7))
			|| (list.get(2) == list.get(5) && list.get(5) == list.get(8))
			|| (list.get(0) == list.get(4) && list.get(4) == list.get(8))
			|| (list.get(2) == list.get(4) && list.get(4) == list.get(6))
		){
			result = "Yes";
		}
		System.out.println(result);
	}
}
