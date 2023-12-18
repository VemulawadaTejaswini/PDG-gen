import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		for(int i = 0; i < N; i++) {
			A.add(Integer.parseInt(sc.next()));
			B.add(A.get(i));
		}
		sc.close();
		Collections.sort(B);
		int max = B.get(N - 1);
		int count = 0;
		for(int i = 0; i < N; i++) {
			if(max == A.get(i)) {
				count++;
			}
		}
		for(int i = 0; i < N; i++) {
			if(count < 2) {
				if(max == A.get(i)) {
					System.out.println(B.get(N - 1 - count));
				}else {
					System.out.println(max);
				}
			}else {
				System.out.println(max);
			}
		}
	}

}