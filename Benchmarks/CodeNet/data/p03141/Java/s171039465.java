import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String inStr = "";
		int N = 0;
		List<Integer> A = new ArrayList<Integer>();
		List<Integer> B = new ArrayList<Integer>();
		try {
			inStr = new String(input.readLine());
			N = Integer.valueOf(inStr);

			for (int i = 0; i < N; i++) {
				inStr = new String(input.readLine());
				String[] inStrArray = inStr.split(" ");
				A.add(Integer.valueOf(inStrArray[0]));
				B.add(Integer.valueOf(inStrArray[1]));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		exec(N, A, B);

	}

	private static void exec(int _N, List<Integer> _A, List<Integer> _B) {

		boolean flag = true;
		Integer sumA = 0;
		Integer sumB = 0;
		for (int i = 0; i < _N; i++) {
			Integer max = 0;
			Integer max2 = 0;
			Integer maxIndex = 0;
			if (flag) {
				for (int j = 0; j < _A.size(); j++) {
					Integer tmp = _A.get(j);
					Integer tmp2 = _B.get(j);
					if (max < tmp) {
						max = tmp;
						max2 = tmp2;
						maxIndex = j;
					} else if (max == tmp) {
						if (max2 < tmp2) {
							max2 = tmp2;
							maxIndex = j;
						}
					}
				}
				sumA += max;
				flag = false;
			} else {
				for (int j = 0; j < _B.size(); j++) {
					Integer tmp = _B.get(j);
					Integer tmp2 = _A.get(j);
					if (max < tmp) {
						max = tmp;
						max2 = tmp2;
						maxIndex = j;
					} else if (max == tmp) {
						if (max2 < tmp2) {
							max2 = tmp2;
							maxIndex = j;
						}
					}
				}
				sumB += max;
				flag = true;
			}

			_A.set(maxIndex, 0);
			_B.set(maxIndex, 0);
		}

		System.out.println(sumA - sumB);
	}

}
