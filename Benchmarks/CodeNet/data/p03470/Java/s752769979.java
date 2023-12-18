import java.util.*;
import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>(n);
		for(int i=0; i<n; i++){
			list.add(sc.nextInt());
		}
		list = list.stream().distinct().collect(Collectors.toList());
		System.out.println(list.size());
	}
}
