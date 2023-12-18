import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] A = new int[N];
		boolean[] paper = new boolean[1000000000];
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(sc.next());
			paper[i] = false;
		}

		int count = 0;
		for(int i = 0; i < A.length; i++) {
			if(!paper[A[i]-1]) {
				paper[A[i]-1] = true;
				count++;
			}else {
				paper[A[i]-1] = false;;
				count--;
			}
		}

		System.out.println(count);

		sc.close();
	}

}
