import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	static final int NUM_RAND = 10;
	static final int DIGIT = 4;

	/**
	 * @param args
	 */
	public static void main(String[] args)
			throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int numInput = Integer.parseInt(br.readLine());
		for(int i = 0; i < numInput; i++){
			int[] r = rand(Integer.parseInt(br.readLine()), DIGIT, NUM_RAND);
			System.out.println("Case " + (i + 1) + ":");
			for(int n : r){
				System.out.println(n);
			}
		}
	}

	public static int[] rand(int seed, int digit, int numRand) {
		int[] r = new int[numRand];
		String randSquare = null;
		for (int i = 0; i < r.length; i++) {
			randSquare = String.format("%0" + digit * 2 + "d", seed * seed);
			String center = getCenter(randSquare, digit);
			r[i] = Integer.parseInt(center);
			seed = r[i];
		}
		return r;
	}

	private static String getCenter(String str, int digit) {
		return str.substring(digit / 2, digit / 2 + digit);
	}
}