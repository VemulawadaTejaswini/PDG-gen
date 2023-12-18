import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		List<Integer> list = new ArrayList<>();
		for(int i=a; i<=b; i++){
			if(i < a + k || i > b - k){
				list.add(i);
			}
		}
		list.stream().distinct().forEach(System.out::println);
	}
}
