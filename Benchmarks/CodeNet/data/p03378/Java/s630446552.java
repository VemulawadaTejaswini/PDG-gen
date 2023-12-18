import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		Integer[] a = new Integer[m];
		Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
		List<Integer> list = new ArrayList<>(Arrays.asList(a));
		int countMinus = 0, countPlus = 0;
		for(int i=x; i!=0; i--){
			if(list.contains(i)){
				countMinus++;
			}
		}
		for(int i=x; i!=n; i++){
			if(list.contains(i)){
				countPlus++;
			}
		}
		System.out.println(countPlus < countMinus ? countPlus : countMinus);
	}
}
