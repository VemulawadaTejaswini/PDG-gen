import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int N, A, B, C, D;
	static char[] S;
	static boolean isCheck;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		A = Integer.parseInt(st.nextToken()) - 1;
		B = Integer.parseInt(st.nextToken()) - 1;
		C = Integer.parseInt(st.nextToken()) - 1;
		D = Integer.parseInt(st.nextToken()) - 1;
		S = br.readLine().toCharArray();

		go(A, B + 1);
		go(A, B + 2);
		go(A + 1, B);
		go(A + 1, B + 1);
		go(A + 1, B + 2);
		go(A + 2, B);
		go(A + 2, B + 1);
		go(A + 2, B + 2);
		if (isCheck) {
			bw.write("Yes");
		} else {
			bw.write("No");
		}

		bw.flush();
		bw.close();
		br.close();
	}

	private static void go(int toA, int toB) {
		if (toA < N && toB < N && S[toA] == '.' && S[toB] == '.' && toA != toB) {
			if (toA == C && toB == D) {
				isCheck = true;
			}

			go(toA, toB + 1);
			go(toA, toB + 2);
			go(toA + 1, toB);
			go(toA + 1, toB + 1);
			go(toA + 1, toB + 2);
			go(toA + 2, toB);
			go(toA + 2, toB + 1);
			go(toA + 2, toB + 2);

		} else {
			return;
		}

	}

}
