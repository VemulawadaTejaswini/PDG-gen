import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		List<Integer> list = Arrays.stream(S.split(""))
		        .map(Integer::parseInt)
		        .collect(Collectors.toList());

		int N = list.size();

		int hoge = 0;
		for (int i=0; i < list.size()-1; hoge++) {
			if (list.get(i) != list.get(i+1)) {
				list.remove(i+1);
				list.remove(i);
				i = 0;
			} else {
				i++;
			}
		}
		System.out.println(N - list.size());
	}
}