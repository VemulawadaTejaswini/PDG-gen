import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H = sc.nextInt();

		int NN = N * 2;

		Integer S[] = new Integer[NN];
		List<Integer> nage = new ArrayList<Integer>();
		List<Integer> furi = new ArrayList<Integer>();

		int cnt = 0;

		for (int i = 0; i < NN; i++) {
			S[i] = sc.nextInt();
		}

		for (int i = 0; i < NN; i += 2) {
			furi.add(S[i]);
		}

		for (int i = 1; i < NN; i += 2) {
			nage.add(S[i]);
		}

		int i = nage.size();
		int x = 0;

		while (x < nage.size() || H <= 0) {
			if (i > 0) {
				H -= nage.get(i - 1);
			} else {
				break;
			}
			cnt++;
			i--;
			x++;
		}

		if (H >= 0 && i == 0 && N != 1) {
			cnt--;
		}

		while (H >= 0) {
			H -= furi.get(furi.size() - 1);
			cnt++;
		}

		System.out.println(cnt);
	}
}
