
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static int maxBooks(int first[], int second[], int firstPointer, int secondPointer, int time, int count) {
		if (time == 0) {
			return count;
		}
		int resultOne = count;
		if (firstPointer < first.length && time - first[firstPointer] >= 0) {
			resultOne = maxBooks(first, second, firstPointer + 1, secondPointer, time - first[firstPointer], count+1);
		}
		int resultTwo = count;
		if (secondPointer < second.length && time - second[secondPointer] >= 0) {
			resultTwo = maxBooks(first, second, firstPointer, secondPointer + 1, time - second[secondPointer], count+1);
		}

		return Math.max(resultOne, resultTwo);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line[] = null;
		int n, m, k;
		line = br.readLine().split(" ");
		n = Integer.parseInt(line[0]);
		m = Integer.parseInt(line[1]);
		k = Integer.parseInt(line[2]);
		int first[] = new int[n];
		int second[] = new int[m];
		line = br.readLine().split(" ");
		for (int i = 0; i < first.length; i++) {
			first[i] = Integer.parseInt(line[i]);
		}
		line = br.readLine().split(" ");
		for (int i = 0; i < second.length; i++) {
			second[i] = Integer.parseInt(line[i]);
		}
		System.out.println(maxBooks(first, second, 0, 0, k,0));

	}

}
