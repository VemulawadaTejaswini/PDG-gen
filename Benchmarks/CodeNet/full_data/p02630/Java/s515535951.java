import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.next());
		long[] list = new long[1000000];
		long sum =0;
		int x;
		for(int i=0;i<N;i++) {
			x = Integer.parseInt(scanner.next());
			list[x]++;
			sum += x;
		}
		int Q = Integer.parseInt(scanner.next());
		int b,c;
		for(int i=0;i<Q;i++) {
			b = Integer.parseInt(scanner.next());
			c = Integer.parseInt(scanner.next());
			sum += (c-b)*list[b];
			list[c] += list[b];
			list[b] =0;
			System.out.println(sum);
		}
		scanner.close();
	}
}