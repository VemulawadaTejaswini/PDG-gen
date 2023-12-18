import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		List<Integer> v = Arrays.stream(sc.nextLine().split(" ",0)).map(Integer::valueOf).collect(Collectors.toList());
		List<Integer> c = Arrays.stream(sc.nextLine().split(" ",0)).map(Integer::valueOf).collect(Collectors.toList());
		int max = 0;
		for (int i=0;i<N;i++) {
			int d = v.get(i) - c.get(i);
			if (d > 0) {
				max += d;
			}
		}
		System.out.println(max);
		sc.close();
	}

}