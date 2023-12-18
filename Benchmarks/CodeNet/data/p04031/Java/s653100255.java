
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arg = br.readLine().split(" ");
		int[] inp = new int[arg.length];
		for (int i = 0; i < arg.length; i++) {
			inp[i] = Integer.parseInt(arg[i]);
		}
		Solver s = new Solver();

		System.out.println(s.solve(inp));
	}

}

class Solver {

	int solve(int[] inp) {

		int max = Arrays.stream(inp).max().getAsInt();
		int min = Arrays.stream(inp).min().getAsInt();
		int sum = 0;
		int temp = 0;
		for (int i = min; i <= max; i++) {
			temp = 0;
			for (int j = 0; j < inp.length; j++) {
				temp += (i - inp[j]) * (i - inp[j]);
			}
			if (sum > temp||sum==0)
				sum = temp;
		}
		return sum;

	}

}