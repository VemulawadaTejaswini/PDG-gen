import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int K = Integer.parseInt(W.split(" ")[0]);
		int N = Integer.parseInt(W.split(" ")[1]);

		int[] a = new int[N];
		int maxDist = 0;
		int dist = 0;
		String Y = in.readLine();
		 a[0] = Integer.parseInt(Y.split(" ")[0]);

		for(int i = 1; i < N; i++) {
		 a[i] = Integer.parseInt(Y.split(" ")[i]);
		 dist = a[i] - a[i-1];
		 if(dist > maxDist)
			 maxDist = dist;
		}

		int tmp = (K-a[N-1]) + a[0];

		if( tmp> maxDist) {
			maxDist = tmp;
		}

		System.out.println(K-maxDist);

	}

}
