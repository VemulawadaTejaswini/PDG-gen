import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		List<Integer> list = new ArrayList<>();

		for(int i = 0; i < N; i++) {
			list.add(scan.nextInt());
		}

		List<Integer> subList;
		for(int i = 0; i < list.size(); i++) {
          
			subList = new ArrayList<Integer>(list);
			subList.remove(i);

			// 最大値を求める
			Optional<Integer> s = subList.stream().max(Comparator.naturalOrder());
			System.out.println(s.get());
		}
	}
}