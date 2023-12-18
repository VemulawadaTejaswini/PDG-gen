import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = Integer.parseInt(sc.next());
		
		List<String> elapsedList = new ArrayList<>();
		long count = 0;
		for (int i = 0; i < N; i++) {
			char[] c = sc.next().toCharArray();
			Arrays.sort(c);
			String s = new String(c);
			count += elapsedList.stream()
					.filter(el -> el.equals(s))
					.count();
			elapsedList.add(s);
		}
		
		System.out.println(count);
	}
}
