
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		List<Long> list = new ArrayList<Long>();

		for(int i = 0 ; i < N ; i++) {
			A[i] = sc.nextLong();
		}
		for(int i = 0 ; i < N ; i++) {
			if(list.contains(A[i])) {
				list.remove(A[i]);
			} else {
				list.add(A[i]);
			}
		}
		System.out.println(list.size());
	}
}