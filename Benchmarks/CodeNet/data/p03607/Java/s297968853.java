
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int index = 0;
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < N; i++) {
			index = scan.nextInt();
			if(list.indexOf(index) == -1) {
				list.add(index);
			} else {
				list.remove(list.indexOf(index));
			}
		}
		System.out.println(list.size());
		scan.close();

	}

}
