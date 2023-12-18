import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Main main = new Main();
		Robot A[] = new Robot[N];
		for (int i=0;i<N;i++) {
			Robot r = main.new Robot();
			r.x = sc.nextInt();
			r.l = sc.nextInt();
			A[i] = r;
		}
		Arrays.sort(A);
		int count =0;
		int now =Integer.MIN_VALUE;
		for (int i=0;i<N;i++) {
			if (now<=A[i].x-A[i].l) {
				count ++;
				now = A[i].x+A[i].l;
			}
		}
		System.out.println(count);
	}

	public class Robot implements Comparable<Robot> {
		int x;
		int l;
		@Override
		public int compareTo(Robot o) {
			return this.x+this.l-o.x-o.l;
		}
	}
}