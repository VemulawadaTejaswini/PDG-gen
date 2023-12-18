import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] n_k = sc.nextLine().split(" ");
		int k = Integer.parseInt(n_k[1]);
		Map<Integer,Integer> balls = Arrays.asList(sc.nextLine().split(" "))
				.parallelStream()
				.map(Integer::valueOf)
				.collect(Collectors.toMap(i->i,j->1,(s,a)->s+a));
		List<Integer> count=balls
				.values()
				.parallelStream()
				.sorted()
				.collect(Collectors.toList());
		int nowK=balls.size(),result=0;
		for(Integer i:count) {
			if(nowK--<=k)break;
			result+=i;
		}
		System.out.println(result);
	}
}