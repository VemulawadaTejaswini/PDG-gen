import java.io.UnsupportedEncodingException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws UnsupportedEncodingException {

		Scanner sc = new Scanner(System.in);

		int ans = 0;
		int N = sc.nextInt();
		byte[][] listA = new byte[N][N];
		byte[][] listB = new byte[N][N];
		int i;
		int n = 0;
		for (i = 0; i < N; i++) {
			String st = sc.next();
			byte[] b_st = st.getBytes();
			n = 0;
			for (byte b : b_st) {
				listA[i][n] = b;
				n++;
			}
		}

		int A = 0;
		int B = 0;
		for (A = 0; A < N; A++) {
			for (B = 0; B < N; B++) {
				for (i = 0; i < N; i++) {
					for (n = 0; n < N; n++) {
						int ik = ((i + A) % N);
						int nk = ((n + B) % N);
						listB[i][n] = listA[ik][nk];
					}
				}

				// listBに値がはいっている。
				boolean isCheck = true;
				for (i = 0; i < N && isCheck; i++) {
					for (n = 0; n < N; n++) {
						if (listB[i][n] != listB[n][i]) {
							isCheck = false;
							break;
						}
					}
				}
				if (isCheck) {
					ans++;
				}

			}
		}

		System.out.println(ans);

		sc.close();
	}
}
