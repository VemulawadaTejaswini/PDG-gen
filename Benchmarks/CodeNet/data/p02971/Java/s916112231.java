import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> A = new ArrayList<>();

		for(int i=0;i<N;i++) {
			A.add(sc.nextInt());
		}
		int max = Collections.max(A);

		for(int i=0;i<N;i++) {
			int ai = A.get(i);
			if(ai != max) {
				System.out.println(max);
			}else {
				List<Integer> temp = new ArrayList<>(A);
				temp.remove(i);
				System.out.println(Collections.max(temp));
			}
		}
	}
}