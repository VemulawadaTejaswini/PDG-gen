import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		Queue<Integer> A = new ArrayDeque<>();
		Queue<Integer> B = new ArrayDeque<>();
		for(int i = 0; i < n; i++) {
			A.add(Integer.parseInt(sc.next()));
		}
		for(int i = 0; i < m; i++) {
			B.add(Integer.parseInt(sc.next()));
		}
		int time = 0;
		int count = 0;
		while(A.size() > 0 || B.size() > 0) {
			int book = 0;
			if(A.size() == 0) {
				time += B.poll();
				count++;
				if(time > k) {
					System.out.println("a0");
					count--;
					break;
				}
			}
			else if(B.size() == 0) {
				time += A.poll();
				count++;
				if(time > k) {
					System.out.println("b0");
					count--;
					break;
				}
			}
			else {
//				System.out.println(A.size() + " " + B.size());
				if(A.peek() > B.peek()) {
					time += B.poll();
					count++;
				}
				else {
					time += A.poll();
					count++;
				}
				if(time > k) {
//					System.out.println("break");
					count--;
					break;
				}
			}
		}
		System.out.println(count);
	}
}