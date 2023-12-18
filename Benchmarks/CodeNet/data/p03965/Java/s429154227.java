import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] in = br.readLine().toCharArray();
		System.out.println(new Solver().solve(in));
	}

}

class Solver {

	int solve(char[] arr) {

		int pCnt = 0;
		int gCnt = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 'g') {
				gCnt++;
			} else if (arr[i] == 'p') {
				pCnt++;
			}
		}
		return arr.length / 2 - pCnt;

	}

}