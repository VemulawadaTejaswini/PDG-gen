import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		ArrayList<Integer> A = new ArrayList<Integer>();
		for(int i = 0; i < N; i ++) {
			A.add(stdIn.nextInt());
		}
		Collections.sort(A, Comparator.reverseOrder());
		int ans = 0;
		ans += A.get(0);
		for(int i = 2; i < N; i ++) {
			ans += A.get((int) Math.floor((double) i/2));
		}
		System.out.println(ans);
	}
}