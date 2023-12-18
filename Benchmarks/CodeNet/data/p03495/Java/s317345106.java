import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] n_k = sc.nextLine().split(" ");
		int k = Integer.parseInt(n_k[1]);
		List<Integer> balls = Arrays.asList(sc.nextLine().split(" "))
				.parallelStream()
				.map(Integer::valueOf)
				.sorted()
				.collect(Collectors.toList());
		int nowIndex=0;
		Set<Integer> kinds=balls.parallelStream().collect(Collectors.toSet());
		LinkedList<Integer> count=new LinkedList<Integer>();
		for(Integer key:kinds) {
			count.add(nowIndex++,(int)balls.parallelStream().filter(i->i==key).count());
		}
		count.sort(Integer::compare);
		int result=0;
		for(int nowK=kinds.size();nowK>k;nowK--) {
			result+=count.remove();
		}
		System.out.println(result);
	}
}