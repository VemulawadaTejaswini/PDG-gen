import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Moonlight Farm
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		Main main = new Main();

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int N = parseInt(line);
			if (N == 0) break;

			Crop[] crops = new Crop[N];
			for (int i = 0; i < N; i++) {
				crops[i] = main.new Crop(br.readLine());
			}
			Arrays.sort(crops);

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < N; i++) {
				sb.append(crops[i].getName()).append("\n");
			}
			sb.append("#");
			System.out.println(sb.toString());

		} //end while
	} //end main

	class Crop implements Comparable<Crop> {

		private String L;
		private int P, A, B, C, D, E, F, S, M;
		private double efficiency;

		Crop(String str) {
			StringTokenizer st = new StringTokenizer(str);
			this.L = st.nextToken();
			this.P = parseInt(st.nextToken());
			this.A = parseInt(st.nextToken());
			this.B = parseInt(st.nextToken());
			this.C = parseInt(st.nextToken());
			this.D = parseInt(st.nextToken());
			this.E = parseInt(st.nextToken());
			this.F = parseInt(st.nextToken());
			this.S = parseInt(st.nextToken());
			this.M = parseInt(st.nextToken());
			this.efficiency = setEfficiency();
		}

		String getName() {
			return this.L;
		}

		double getEfficiency() {
			return this.efficiency;
		}

		private double setEfficiency() {
			int income = S * F * M - P;
			int required = A + B + C + ((D + E) * M);
			return (double) income / required;
		}

		@Override
		public int compareTo(Crop o) {

			int negate = -1;

			if (this.getEfficiency() < o.getEfficiency()) {
				return -1 * negate;
			} else if (this.getEfficiency() > o.getEfficiency()) {
				return 1 * negate;
			} else {
				return this.getName().compareTo(o.getName());
			}
		}
	}
}