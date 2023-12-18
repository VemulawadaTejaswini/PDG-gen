import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		PriorityQueue<Double> q = new PriorityQueue<>();
		for(int i = 0; i < n; i++) {
			q.add((double)(-sc.nextInt()));
		}
		for(int i = 0; i < m; i++) {
			double a = q.poll();
			q.add(a/2);
		}
		long res = 0;
		while(!q.isEmpty()) {
			double a = -q.poll();
			res += (long)Math.floor(a);
		}
		System.out.println(res);
	}

}
