import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();
		int A[];
		int B[];
		Integer distance[];
		int number[];
		A = new int[M];
		B = new int[M];
		distance = new Integer[N];						//部屋1からの距離．
		number = new int[N];							//部屋に置く番号．
		Deque<Integer> rooms = new ArrayDeque<>();

		rooms.add(1);
		distance[0] = 0;
		number[0] = 0;
		for(int i = 0; i < M; i++) {
			A[i] = scan.nextInt();
			B[i] = scan.nextInt();
		}

		while(!rooms.isEmpty()) {
			int a = rooms.poll();
			for(int i = 0; i < M; i++) {
				if(A[i] == a && distance[B[i] - 1] == null) {
					rooms.add(B[i]);
					distance[B[i]-1] = distance[a - 1] + 1;
					number[B[i] - 1] = a;
				}
				if(B[i] == a && distance[A[i] - 1] == null) {
					rooms.add(A[i]);
					distance[A[i]-1] = distance[a - 1] + 1;
					number[A[i] - 1] = a;
				}
			}
		}

		System.out.println("Yes");
		for(int i = 1; i < N; i++)	System.out.println(number[i]);
	}
}
