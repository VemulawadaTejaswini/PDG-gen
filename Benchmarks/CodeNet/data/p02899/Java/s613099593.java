import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		for(int i = 0; i < N; i++) {
			A.add(sc.nextInt());
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(A.get(j) == i + 1) {
					B.add(j + 1);
				}
			}
		}
		for(int i = 0; i < N; i++) {
			System.out.print(B.get(i) + " ");
		}
		sc.close();
	}
}
