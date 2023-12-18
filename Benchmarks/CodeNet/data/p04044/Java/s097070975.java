import java.util.*;
import java.util.stream.Collectors;
public class Main{

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			s.nextInt();
			List<String> list = new ArrayList<>(n);
			for(int i=0; i<n; i++) {
				list.add(s.next());
			}
			System.out.println(list.stream().sorted().collect(Collectors.joining()));
		}
	}
}
