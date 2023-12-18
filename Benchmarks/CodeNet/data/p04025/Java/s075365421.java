
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> list = IntStream.range(0, N).mapToObj(x -> sc.nextInt())
				.sorted((a, b) -> Integer.compare(b, a))
				.collect(Collectors.toCollection(ArrayList::new));
		int max=list.get(0);
		int min=list.get(list.size()-1);
		int sum=0;
		
		boolean firstOrnot=true;
		
		for (int i = min; i < max; i++) {
			int sumInter=0;
			for (int j = 0; j < list.size(); j++) {
				sumInter+=Math.pow(list.get(j)-i, 2);
			}
			if (firstOrnot) {
				firstOrnot=false;
				sum=sumInter;
			}else {
				if (sumInter<sum) {
					sum=sumInter;
				}
			}
		}
		
		System.out.println(sum);

	}

}
