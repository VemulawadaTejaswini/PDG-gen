import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = Integer.parseInt(sc.next());
		String a[] = new String[(int) N];
		for (int i = 0; i < N; i++)  a[i] = sc.next();
		
		List<String> list = Arrays.asList(a).stream()
				.map(String::toCharArray)
				.map(arr -> {
					Arrays.sort(arr);
					return arr;
				})
				.map(String::valueOf)
				.collect(Collectors.toList());
		List<String> elapsedList = new ArrayList<>();
		long count = 0;
		for (String s : list) {
			count += elapsedList.stream()
					.filter(el -> el.equals(s))
					.count();
			elapsedList.add(s);
		}
		
		System.out.println(count);
	}
}
