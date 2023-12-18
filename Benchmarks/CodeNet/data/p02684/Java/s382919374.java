import java.io.*;
import java.util.StringTokenizer;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] input = new int[N];
		for (int i = 0; i < N; i++) {
			input[i] = Integer.parseInt(st.nextToken()) - 1;
		}
		
		int[] touch = new int[N];
		int current = 0;
		while (K != 0) {
			if (touch[current] == 0) {
				touch[current] = K;
				current = input[current];
				K--;
			} else {
				K = K % (touch[current] - K);
				if (K == 0) {
					break;
				}
				current = input[current];
				K--;
			}			
		}
		System.out.println(current + 1);
	}
}
