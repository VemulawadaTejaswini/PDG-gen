import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		
		int[] ansPlayer = new int[Q];
		
		for(int i = 0 ; i < Q ; i++) {
			ansPlayer[i] = sc.nextInt() - 1;
		}
		
		for(int i = 0 ; i < N ; i++) {
			int point = K;
			for (int j : ansPlayer) {
				if (j != i) {
					point--;
				}
			}
			if (point > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		
	}

}
