import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sequenceNum = Integer.parseInt(br.readLine());

		boolean oddFlag = true;

		ArrayList<Integer> oddPosNums = new ArrayList<Integer>();
		ArrayList<Integer> evenPosNums = new ArrayList<Integer>();

		// 数列を奇数項、偶数項に分けて格納。
		for (int i = 1; i <= sequenceNum; i++) {
			if (oddFlag) {
				oddPosNums.add(Integer.parseInt(br.readLine()));
			} else {
				evenPosNums.add(Integer.parseInt(br.readLine()));
			}

			oddFlag = !oddFlag;
		}

		int end = sequenceNum / 2;
		int oddMax = oddPosNums.size() - 1;
		int counter = 0;
		start: while (true) {
			Collections.sort(oddPosNums);
			Collections.sort(evenPosNums);
			for (int i = 0; i < end; i++) {
				if (oddPosNums.get(i) > evenPosNums.get(i)) {
					counter++;

					int n = oddPosNums.get(i);
					oddPosNums.set(i, evenPosNums.get(i));
					evenPosNums.set(i, n);
					continue start;
				}

				if ((i + 1) > oddMax) {
					break;
				}

				if (oddPosNums.get(i + 1) < evenPosNums.get(i)) {
					counter++;

					int n = oddPosNums.get(i);
					oddPosNums.set(i, evenPosNums.get(i));
					evenPosNums.set(i, n);
					continue start;
				}

			}
			break;
		}

		System.out.println(counter);
	}
}
