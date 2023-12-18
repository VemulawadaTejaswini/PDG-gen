
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int index = 0;
		Set<Integer> A = new HashSet<Integer>();
		for(int i = 0; i < N; i++) {
			index = scan.nextInt();
			if(A.contains(index)) {
				A.remove(index);
			} else {
				A.add(index);
			}
		}
		System.out.println(A.size());
		scan.close();

	}

}
