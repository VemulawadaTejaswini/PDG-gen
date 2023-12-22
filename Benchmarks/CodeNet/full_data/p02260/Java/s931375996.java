import java.io.*;

class a {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder out = new StringBuilder();
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n];
		String[] in = br.readLine().split(" ");
		for (int i = 0; i < n; i++)
			A[i] = Integer.parseInt(in[i]);
		int i, j, t, minv, sw = 0;
		for (i = 0; i < n; i++) {
			minv = i;
			for (j = i; j < n; j++) {
				if (A[minv] > A[j]) {
					minv = j;
				}
				t = A[i];
				A[i] = A[minv];
				A[minv] = t;
			}
			if (i != minv) {
				++sw;
			}
		}
		out.append(A[0]);
		for (int k = 1; k < n; k++) 
			out.append(' ').append(A[k]);
		out.append('\n').append(sw).append('\n');
		System.out.print(out);

	}

}