import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		for(int i = 0; i < N -1; i++) {
			B.add(sc.nextInt());
		}

		if(N <= 2) {
			for(int i = 0; i < N; i++) {
				A.add(B.get(0));
				result += A.get(i);
			}
		}else {
			A.add(B.get(0));
			result += A.get(0);
			for(int i = 1; i < N - 1; i++) {
				if(B.get(i - 1) < B.get(i)) {
					A.add(B.get(i - 1));
				}else {
					A.add(B.get(i));
				}
				result += A.get(i);
			}
			A.add(B.get(N - 2));
			result += A.get(N - 1);
		}
		System.out.println(result);
		sc.close();
	}
}