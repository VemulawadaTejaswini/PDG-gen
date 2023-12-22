import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		PriorityQueue<Short> pq = new PriorityQueue<Short>();
		short N = Short.parseShort(st.nextToken());
		short T = Short.parseShort(st.nextToken());
		st = new StringTokenizer(br.readLine());
		short p;
		for (short i = 0; i < N; i++) {
			p = Short.parseShort(st.nextToken());
			pq.add(p);
		}
		int sum = 0;
		for (short i = 0; i < T; i++) {
			sum += pq.poll();
		}
		System.out.print(sum);
	}
}
