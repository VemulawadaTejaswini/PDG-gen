import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//BufferedReader in = new BufferedReader(new FileReader(new File("input.txt")));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] line = in.readLine().split(" ");
		int N = conv(line[0]); int M = conv(line[1]);
		int[][] gates = new int[M][2];
		for(int i = 0; i < M; i++) {
			line = in.readLine().split(" ");
			gates[i][0] = conv(line[0]); gates[i][1] = conv(line[1]);
		}
		int Lmax = 0; int Rmin = Integer.MAX_VALUE;
		for(int[] range : gates) {
			if(Lmax < range[0]) {
				Lmax = range[0];
			}
			if(range[1] < Rmin) {
				Rmin = range[1];
			}
		}
		int valid = Rmin - Lmax;
		if(valid < 0) {
			System.out.println(0);
			return;
		}
		System.out.println(valid + 1);
	}
	public static int conv(String s) {
		return Integer.valueOf(s);
	}
}