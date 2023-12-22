import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = 999999;
		List<Integer> L = new ArrayList<Integer>();
		for (int i = 2 ; i <= N ; i++) {
			L.add(i);
		}
		List<Integer> P = new ArrayList<Integer>();
		while (!L.isEmpty()) {
			int i = L.get(0);
			P.add(i);
			for (Iterator<Integer> it = L.iterator() ; it.hasNext() ;) {
				Integer I = it.next();
				if (I % i == 0) it.remove();
			}
		}
		L.clear();

		int[] S = new int[N+1];
		for (int i = 0 ; i < P.size() ; i++) {
			S[P.get(i)] = i+1;
		}
		int p = 0;
		for (int i = 0 ; i < S.length ; i++) {
			if (S[i] == 0) {
				S[i] = p;
			} else {
				p = S[i];
			}
		}

		String line;
		while ((line = br.readLine()) != null) {
			int n = Integer.parseInt(line);
			System.out.println(S[n]);
		}

	}
}