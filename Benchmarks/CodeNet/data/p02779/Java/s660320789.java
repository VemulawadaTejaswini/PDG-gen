import java.util.*;
import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		Integer[] a = new Integer[n];
		Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
		List<Integer> list = new ArrayList<>(Arrays.asList(a));
		System.out.println(list.size() == list.stream().distinct().collect(Collectors.toList()).size() ? "YES" : "NO");
	}
}
