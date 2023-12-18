
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		List<Long> list = new ArrayList<Long>();
		list.add((long)2);
		list.add((long)1);
		
		for(int i = 2; i <= N; i++) {
			list.add(list.get(i - 2) + list.get(i - 1));
		}
		
		System.out.println(list.get(list.size() - 1));
		
		scan.close();
	}

}
