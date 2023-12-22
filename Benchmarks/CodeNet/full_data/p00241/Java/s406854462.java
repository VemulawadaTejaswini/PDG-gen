import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0")) {

			int n = Integer.parseInt(line);
			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				Quaternion qa, qb;
				qa = new Quaternion(parseInt(st.nextToken()),
						parseInt(st.nextToken()), parseInt(st.nextToken()),
						parseInt(st.nextToken()));
				qb = new Quaternion(parseInt(st.nextToken()),
						parseInt(st.nextToken()), parseInt(st.nextToken()),
						parseInt(st.nextToken()));
				System.out.println(qa.Multi(qb).toString());
			}

		}

	}
}

class Quaternion {

	int n, i, j, k;

	public Quaternion(int n, int i, int j, int k) {
		this.n = n;
		this.i = i;
		this.j = j;
		this.k = k;
	}

	public Quaternion Plus(Quaternion b) {
		return new Quaternion(n + b.n, i + b.i, j + b.j, k + b.k);
	}

	public Quaternion Multi(Quaternion b) {

		int _n, _i, _j, _k;
		_n = n * b.n - i * b.i - j * b.j - k * b.k;
		_i = n * b.i + i * b.n + j * b.k - k * b.j;
		_j = n * b.j - i * b.k + j * b.n + k * b.i;
		_k = n * b.k + i * b.j - j * b.i + k * b.n;
		return new Quaternion(_n, _i, _j, _k);
	}

	public String toString() {
		return new String(n + " " + i + " " + j + " " + k);
	}

}